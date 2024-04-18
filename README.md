
Experiments with compiling Kotlin to Wasm Component, 
linking it with an example component written in Rust, transpiling it to JS + Core Wasm using [jco](https://github.com/bytecodealliance/jco), 
and running the result in Node.js.

## Install dependencies

Checkout `skuzmich/cm-prototype` branch of [Kotlin](https://github.com/JetBrains/kotlin) somewhere and install it to mavenLocal:

```
cd path/to/kotlin
./gradlew install --parallel
```

Install recent Rust toolchain and add wasm32-unknown-unknown target:

```shell
rustup target add wasm32-unknown-unknown
```

Install wasm-tools

```shell
cargo install wasm-tools
```

Install Node.js with canary V8 with WasmGC support, for example via NVM:

```shell
NVM_NODEJS_ORG_MIRROR=https://nodejs.org/download/v8-canary nvm install 21.0.0-v8-canary20231019bd785be450
```

Install jco and preview2-shim

```shell
npm install
```

Install the latest experimental wit-bindgen CLI with Kotlin support via `cargo`:

```shell
cargo install wit-bindgen-cli --git https://github.com/skuzmich/wit-bindgen --branch kotlin
```

## Build and run

```shell
./run.sh
```
