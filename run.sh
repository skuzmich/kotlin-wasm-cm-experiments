#!/usr/bin/env bash

COMPILED_WASM=./build/compileSync/wasmWasi/main/productionExecutable/kotlin
MODULE_NAME=kco-wasm-wasi
WASI_ADAPTER=./wasi_snapshot_preview1.reactor.wasm

set -e

rm -rf ./build/out
mkdir -p ./build/out/dependencies

# Build Rust component
cp wit/example.wit ./rust-component/wit/

(cd ./rust-component/ && \
cargo build --target wasm32-wasi --release -q && \
wasm-tools component new ./target/wasm32-wasi/release/example.wasm -o ../build/out/dependencies/example.wasm --adapt ../$WASI_ADAPTER)

# Generate WIT bindings for Kotlin
wit-bindgen kotlin ./wit --out-dir src/wasmWasiMain/kotlin/bindings

# Compile Kotlin code
./gradlew :compileProductionExecutableKotlinWasmWasi -Pkotlin.wasm.stability.nowarn=true

# Embed wit interface to core wasm file (wasm-tools convention)
mkdir -p ./build/out/wasm
wasm-tools component embed wit/ $COMPILED_WASM/$MODULE_NAME.stub.wasm -o build/out/wasm/$MODULE_NAME.stube.embedded.wasm

mkdir -p ./build/out/component

# Create a component from core Wasm
wasm-tools component new build/out/wasm/$MODULE_NAME.stube.embedded.wasm -o build/out/component/$MODULE_NAME.uncomposed.wasm --adapt $WASI_ADAPTER --realloc-via-memory-grow

# Compose Kotlin component with Rust component into a single linked component
wasm-tools compose build/out/component/$MODULE_NAME.uncomposed.wasm  -o build/out/component/$MODULE_NAME.wasm --definitions ./build/out/dependencies/example.wasm --search-path ./build/out/dependencies &> build/wasm-tools-compose.log

# Transpile component into JS + core Wasm
npx jco transpile build/out/component/$MODULE_NAME.wasm -o build/out/jco --base64-cutoff 0 -q --map "cm:example/jsiface=./../../../jsiface.mjs"

# Replace a stub module with a real Kotlin core module
cp $COMPILED_WASM/$MODULE_NAME.wasm build/out/jco/$MODULE_NAME.core.wasm

# Run in Node.js and call ini (main) function
cp build/out/jco/$MODULE_NAME.js build/out/jco/$MODULE_NAME.mjs

node run.mjs