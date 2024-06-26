// Generated by `wit-bindgen` 0.25.0. DO NOT EDIT!

@file:OptIn(UnsafeWasmMemoryApi::class)

import kotlin.wasm.unsafe.*

@WasmImport("cm:example/jsiface", "[resource-drop]x")
internal external fun __cm_resource_abi_import_Jsiface_X_drop(handle: Int): Unit

@WasmImport("cm:example/jsiface", "[constructor]x")
internal external fun __wasm_import_constructor(p0: Int): Int

@WasmImport("cm:example/jsiface", "[method]x.get-a")
internal external fun __wasm_import_getA(p0: Int): Int

@WasmImport("cm:example/jsiface", "[method]x.set-a")
internal external fun __wasm_import_setA(p0: Int, p1: Int): Unit

@WasmImport("cm:example/jsiface", "[static]x.add")
internal external fun __wasm_import_add(p0: Int, p1: Int): Int

@WasmImport("cm:example/iface", "markdown-to-html")
internal external fun __wasm_import_markdownToHtml(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("cm:example/iface", "test1")
internal external fun __wasm_import_test1(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Long,
    p5: Int,
    p6: Int,
    p7: Int,
    p8: Long,
    p9: Int,
    p10: Int
): Unit

@WasmImport("cm:example/iface", "test2")
internal external fun __wasm_import_test2(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("cm:example/iface", "test3")
internal external fun __wasm_import_test3(p0: Int, p1: Int, p2: Int, p3: Int): Int

@WasmImport("cm:example/iface", "test-record")
internal external fun __wasm_import_testRecord(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Unit

@WasmImport("cm:example/iface", "test-result")
internal external fun __wasm_import_testResult(p0: Int, p1: Int): Unit

@WasmImport("cm:example/iface", "test-tuple")
internal external fun __wasm_import_testTuple(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int,
    p7: Int,
    p8: Int
): Unit

@WasmImport("cm:example/iface", "test-variant")
internal external fun __wasm_import_testVariant(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("cm:example/iface", "test-enum")
internal external fun __wasm_import_testEnum(p0: Int): Int

@WasmImport("cm:example/iface", "test-flags")
internal external fun __wasm_import_testFlags(p0: Int, p1: Int): Unit

@WasmImport("wasi:cli/environment@0.2.0", "get-environment")
internal external fun __wasm_import_getEnvironment(p0: Int): Unit

@WasmImport("wasi:cli/environment@0.2.0", "get-arguments")
internal external fun __wasm_import_getArguments(p0: Int): Unit

@WasmImport("wasi:cli/environment@0.2.0", "initial-cwd")
internal external fun __wasm_import_initialCwd(p0: Int): Unit

@WasmImport("wasi:cli/exit@0.2.0", "exit") internal external fun __wasm_import_exit(p0: Int): Unit

@WasmImport("wasi:io/error@0.2.0", "[resource-drop]error")
internal external fun __cm_resource_abi_import_Error_Error_drop(handle: Int): Unit

@WasmImport("wasi:io/error@0.2.0", "[method]error.to-debug-string")
internal external fun __wasm_import_toDebugString(p0: Int, p1: Int): Unit

@WasmImport("wasi:io/poll@0.2.0", "[resource-drop]pollable")
internal external fun __cm_resource_abi_import_Poll_Pollable_drop(handle: Int): Unit

@WasmImport("wasi:io/poll@0.2.0", "[method]pollable.ready")
internal external fun __wasm_import_ready(p0: Int): Int

@WasmImport("wasi:io/poll@0.2.0", "[method]pollable.block")
internal external fun __wasm_import_block(p0: Int): Unit

@WasmImport("wasi:io/poll@0.2.0", "poll")
internal external fun __wasm_import_poll(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[resource-drop]input-stream")
internal external fun __cm_resource_abi_import_Streams_InputStream_drop(handle: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]input-stream.read")
internal external fun __wasm_import_read(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]input-stream.blocking-read")
internal external fun __wasm_import_blockingRead(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]input-stream.skip")
internal external fun __wasm_import_skip(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]input-stream.blocking-skip")
internal external fun __wasm_import_blockingSkip(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]input-stream.subscribe")
internal external fun __wasm_import_subscribe(p0: Int): Int

@WasmImport("wasi:io/streams@0.2.0", "[resource-drop]output-stream")
internal external fun __cm_resource_abi_import_Streams_OutputStream_drop(handle: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.check-write")
internal external fun __wasm_import_checkWrite(p0: Int, p1: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.write")
internal external fun __wasm_import_write(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.blocking-write-and-flush")
internal external fun __wasm_import_blockingWriteAndFlush(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.flush")
internal external fun __wasm_import_flush(p0: Int, p1: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.blocking-flush")
internal external fun __wasm_import_blockingFlush(p0: Int, p1: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.subscribe")
internal external fun __wasm_import_subscribe0(p0: Int): Int

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.write-zeroes")
internal external fun __wasm_import_writeZeroes(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.blocking-write-zeroes-and-flush")
internal external fun __wasm_import_blockingWriteZeroesAndFlush(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.splice")
internal external fun __wasm_import_splice(p0: Int, p1: Int, p2: Long, p3: Int): Unit

@WasmImport("wasi:io/streams@0.2.0", "[method]output-stream.blocking-splice")
internal external fun __wasm_import_blockingSplice(p0: Int, p1: Int, p2: Long, p3: Int): Unit

@WasmImport("wasi:cli/stdin@0.2.0", "get-stdin") internal external fun __wasm_import_getStdin(): Int

@WasmImport("wasi:cli/stdout@0.2.0", "get-stdout")
internal external fun __wasm_import_getStdout(): Int

@WasmImport("wasi:cli/stderr@0.2.0", "get-stderr")
internal external fun __wasm_import_getStderr(): Int

@WasmImport("wasi:cli/terminal-input@0.2.0", "[resource-drop]terminal-input")
internal external fun __cm_resource_abi_import_TerminalInput_TerminalInput_drop(handle: Int): Unit

@WasmImport("wasi:cli/terminal-output@0.2.0", "[resource-drop]terminal-output")
internal external fun __cm_resource_abi_import_TerminalOutput_TerminalOutput_drop(handle: Int): Unit

@WasmImport("wasi:cli/terminal-stdin@0.2.0", "get-terminal-stdin")
internal external fun __wasm_import_getTerminalStdin(p0: Int): Unit

@WasmImport("wasi:cli/terminal-stdout@0.2.0", "get-terminal-stdout")
internal external fun __wasm_import_getTerminalStdout(p0: Int): Unit

@WasmImport("wasi:cli/terminal-stderr@0.2.0", "get-terminal-stderr")
internal external fun __wasm_import_getTerminalStderr(p0: Int): Unit

@WasmImport("wasi:clocks/monotonic-clock@0.2.0", "now")
internal external fun __wasm_import_now(): Long

@WasmImport("wasi:clocks/monotonic-clock@0.2.0", "resolution")
internal external fun __wasm_import_resolution(): Long

@WasmImport("wasi:clocks/monotonic-clock@0.2.0", "subscribe-instant")
internal external fun __wasm_import_subscribeInstant(p0: Long): Int

@WasmImport("wasi:clocks/monotonic-clock@0.2.0", "subscribe-duration")
internal external fun __wasm_import_subscribeDuration(p0: Long): Int

@WasmImport("wasi:clocks/wall-clock@0.2.0", "now")
internal external fun __wasm_import_now1(p0: Int): Unit

@WasmImport("wasi:clocks/wall-clock@0.2.0", "resolution")
internal external fun __wasm_import_resolution2(p0: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[resource-drop]descriptor")
internal external fun __cm_resource_abi_import_Types_Descriptor_drop(handle: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.read-via-stream")
internal external fun __wasm_import_readViaStream(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.write-via-stream")
internal external fun __wasm_import_writeViaStream(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.append-via-stream")
internal external fun __wasm_import_appendViaStream(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.advise")
internal external fun __wasm_import_advise(p0: Int, p1: Long, p2: Long, p3: Int, p4: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.sync-data")
internal external fun __wasm_import_syncData(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.get-flags")
internal external fun __wasm_import_getFlags(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.get-type")
internal external fun __wasm_import_getType(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.set-size")
internal external fun __wasm_import_setSize(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.set-times")
internal external fun __wasm_import_setTimes(
    p0: Int,
    p1: Int,
    p2: Long,
    p3: Int,
    p4: Int,
    p5: Long,
    p6: Int,
    p7: Int
): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.read")
internal external fun __wasm_import_read3(p0: Int, p1: Long, p2: Long, p3: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.write")
internal external fun __wasm_import_write4(p0: Int, p1: Int, p2: Int, p3: Long, p4: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.read-directory")
internal external fun __wasm_import_readDirectory(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.sync")
internal external fun __wasm_import_sync(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.create-directory-at")
internal external fun __wasm_import_createDirectoryAt(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.stat")
internal external fun __wasm_import_stat(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.stat-at")
internal external fun __wasm_import_statAt(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.set-times-at")
internal external fun __wasm_import_setTimesAt(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Long,
    p6: Int,
    p7: Int,
    p8: Long,
    p9: Int,
    p10: Int
): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.link-at")
internal external fun __wasm_import_linkAt(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int,
    p7: Int
): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.open-at")
internal external fun __wasm_import_openAt(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int
): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.readlink-at")
internal external fun __wasm_import_readlinkAt(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.remove-directory-at")
internal external fun __wasm_import_removeDirectoryAt(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.rename-at")
internal external fun __wasm_import_renameAt(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int
): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.symlink-at")
internal external fun __wasm_import_symlinkAt(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int
): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.unlink-file-at")
internal external fun __wasm_import_unlinkFileAt(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.is-same-object")
internal external fun __wasm_import_isSameObject(p0: Int, p1: Int): Int

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.metadata-hash")
internal external fun __wasm_import_metadataHash(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]descriptor.metadata-hash-at")
internal external fun __wasm_import_metadataHashAt(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int
): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[resource-drop]directory-entry-stream")
internal external fun __cm_resource_abi_import_Types_DirectoryEntryStream_drop(handle: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "[method]directory-entry-stream.read-directory-entry")
internal external fun __wasm_import_readDirectoryEntry(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/types@0.2.0", "filesystem-error-code")
internal external fun __wasm_import_filesystemErrorCode(p0: Int, p1: Int): Unit

@WasmImport("wasi:filesystem/preopens@0.2.0", "get-directories")
internal external fun __wasm_import_getDirectories(p0: Int): Unit

@WasmImport("wasi:sockets/network@0.2.0", "[resource-drop]network")
internal external fun __cm_resource_abi_import_Network_Network_drop(handle: Int): Unit

@WasmImport("wasi:sockets/instance-network@0.2.0", "instance-network")
internal external fun __wasm_import_instanceNetwork(): Int

@WasmImport("wasi:sockets/udp@0.2.0", "[resource-drop]udp-socket")
internal external fun __cm_resource_abi_import_Udp_UdpSocket_drop(handle: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.start-bind")
internal external fun __wasm_import_startBind(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int,
    p7: Int,
    p8: Int,
    p9: Int,
    p10: Int,
    p11: Int,
    p12: Int,
    p13: Int,
    p14: Int
): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.finish-bind")
internal external fun __wasm_import_finishBind(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.stream")
internal external fun __wasm_import_stream(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int,
    p7: Int,
    p8: Int,
    p9: Int,
    p10: Int,
    p11: Int,
    p12: Int,
    p13: Int,
    p14: Int
): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.local-address")
internal external fun __wasm_import_localAddress(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.remote-address")
internal external fun __wasm_import_remoteAddress(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.address-family")
internal external fun __wasm_import_addressFamily(p0: Int): Int

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.unicast-hop-limit")
internal external fun __wasm_import_unicastHopLimit(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.set-unicast-hop-limit")
internal external fun __wasm_import_setUnicastHopLimit(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.receive-buffer-size")
internal external fun __wasm_import_receiveBufferSize(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.set-receive-buffer-size")
internal external fun __wasm_import_setReceiveBufferSize(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.send-buffer-size")
internal external fun __wasm_import_sendBufferSize(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.set-send-buffer-size")
internal external fun __wasm_import_setSendBufferSize(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]udp-socket.subscribe")
internal external fun __wasm_import_subscribe5(p0: Int): Int

@WasmImport("wasi:sockets/udp@0.2.0", "[resource-drop]incoming-datagram-stream")
internal external fun __cm_resource_abi_import_Udp_IncomingDatagramStream_drop(handle: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]incoming-datagram-stream.receive")
internal external fun __wasm_import_receive(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]incoming-datagram-stream.subscribe")
internal external fun __wasm_import_subscribe6(p0: Int): Int

@WasmImport("wasi:sockets/udp@0.2.0", "[resource-drop]outgoing-datagram-stream")
internal external fun __cm_resource_abi_import_Udp_OutgoingDatagramStream_drop(handle: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]outgoing-datagram-stream.check-send")
internal external fun __wasm_import_checkSend(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]outgoing-datagram-stream.send")
internal external fun __wasm_import_send(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:sockets/udp@0.2.0", "[method]outgoing-datagram-stream.subscribe")
internal external fun __wasm_import_subscribe7(p0: Int): Int

@WasmImport("wasi:sockets/udp-create-socket@0.2.0", "create-udp-socket")
internal external fun __wasm_import_createUdpSocket(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[resource-drop]tcp-socket")
internal external fun __cm_resource_abi_import_Tcp_TcpSocket_drop(handle: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.start-bind")
internal external fun __wasm_import_startBind8(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int,
    p7: Int,
    p8: Int,
    p9: Int,
    p10: Int,
    p11: Int,
    p12: Int,
    p13: Int,
    p14: Int
): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.finish-bind")
internal external fun __wasm_import_finishBind9(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.start-connect")
internal external fun __wasm_import_startConnect(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int,
    p7: Int,
    p8: Int,
    p9: Int,
    p10: Int,
    p11: Int,
    p12: Int,
    p13: Int,
    p14: Int
): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.finish-connect")
internal external fun __wasm_import_finishConnect(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.start-listen")
internal external fun __wasm_import_startListen(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.finish-listen")
internal external fun __wasm_import_finishListen(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.accept")
internal external fun __wasm_import_accept(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.local-address")
internal external fun __wasm_import_localAddress10(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.remote-address")
internal external fun __wasm_import_remoteAddress11(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.is-listening")
internal external fun __wasm_import_isListening(p0: Int): Int

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.address-family")
internal external fun __wasm_import_addressFamily12(p0: Int): Int

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-listen-backlog-size")
internal external fun __wasm_import_setListenBacklogSize(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.keep-alive-enabled")
internal external fun __wasm_import_keepAliveEnabled(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-keep-alive-enabled")
internal external fun __wasm_import_setKeepAliveEnabled(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.keep-alive-idle-time")
internal external fun __wasm_import_keepAliveIdleTime(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-keep-alive-idle-time")
internal external fun __wasm_import_setKeepAliveIdleTime(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.keep-alive-interval")
internal external fun __wasm_import_keepAliveInterval(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-keep-alive-interval")
internal external fun __wasm_import_setKeepAliveInterval(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.keep-alive-count")
internal external fun __wasm_import_keepAliveCount(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-keep-alive-count")
internal external fun __wasm_import_setKeepAliveCount(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.hop-limit")
internal external fun __wasm_import_hopLimit(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-hop-limit")
internal external fun __wasm_import_setHopLimit(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.receive-buffer-size")
internal external fun __wasm_import_receiveBufferSize13(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-receive-buffer-size")
internal external fun __wasm_import_setReceiveBufferSize14(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.send-buffer-size")
internal external fun __wasm_import_sendBufferSize15(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.set-send-buffer-size")
internal external fun __wasm_import_setSendBufferSize16(p0: Int, p1: Long, p2: Int): Unit

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.subscribe")
internal external fun __wasm_import_subscribe17(p0: Int): Int

@WasmImport("wasi:sockets/tcp@0.2.0", "[method]tcp-socket.shutdown")
internal external fun __wasm_import_shutdown(p0: Int, p1: Int, p2: Int): Unit

@WasmImport("wasi:sockets/tcp-create-socket@0.2.0", "create-tcp-socket")
internal external fun __wasm_import_createTcpSocket(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/ip-name-lookup@0.2.0", "[resource-drop]resolve-address-stream")
internal external fun __cm_resource_abi_import_IpNameLookup_ResolveAddressStream_drop(
    handle: Int
): Unit

@WasmImport(
    "wasi:sockets/ip-name-lookup@0.2.0", "[method]resolve-address-stream.resolve-next-address")
internal external fun __wasm_import_resolveNextAddress(p0: Int, p1: Int): Unit

@WasmImport("wasi:sockets/ip-name-lookup@0.2.0", "[method]resolve-address-stream.subscribe")
internal external fun __wasm_import_subscribe18(p0: Int): Int

@WasmImport("wasi:sockets/ip-name-lookup@0.2.0", "resolve-addresses")
internal external fun __wasm_import_resolveAddresses(p0: Int, p1: Int, p2: Int, p3: Int): Unit

@WasmImport("wasi:random/random@0.2.0", "get-random-bytes")
internal external fun __wasm_import_getRandomBytes(p0: Long, p1: Int): Unit

@WasmImport("wasi:random/random@0.2.0", "get-random-u64")
internal external fun __wasm_import_getRandomU64(): Long

@WasmImport("wasi:random/insecure@0.2.0", "get-insecure-random-bytes")
internal external fun __wasm_import_getInsecureRandomBytes(p0: Long, p1: Int): Unit

@WasmImport("wasi:random/insecure@0.2.0", "get-insecure-random-u64")
internal external fun __wasm_import_getInsecureRandomU64(): Long

@WasmImport("wasi:random/insecure-seed@0.2.0", "insecure-seed")
internal external fun __wasm_import_insecureSeed(p0: Int): Unit

@WasmExport("cm:example/iface#markdown-to-html")
fun __wasm_export_markdownToHtml(p0: Int, p1: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: String = IfaceExportsImpl.markdownToHtml(STRING_FROM_MEM(p0, p1))

    val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()

    val bytearray = result.encodeToByteArray()
    val len = bytearray.size
    val ptr0 = allocator.writeToLinearMemory(bytearray).address.toInt()

    (ptr + 4).ptr.storeInt(len)
    (ptr + 0).ptr.storeInt(ptr0)
    return ptr
  }
}

@WasmExport("cm:example/iface#test1")
fun __wasm_export_test1(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Long,
    p5: Int,
    p6: Int,
    p7: Int,
    p8: Long,
    p9: Int
): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: String =
        IfaceExportsImpl.test1(
            (p0 != 0),
            p1.toByte(),
            p2.toShort(),
            p3,
            p4,
            p5.toUByte(),
            p6.toUShort(),
            p7.toUInt(),
            p8.toULong(),
            p9)

    val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()

    val bytearray = result.encodeToByteArray()
    val len = bytearray.size
    val ptr0 = allocator.writeToLinearMemory(bytearray).address.toInt()

    (ptr + 4).ptr.storeInt(len)
    (ptr + 0).ptr.storeInt(ptr0)
    return ptr
  }
}

@WasmExport("cm:example/iface#test2")
fun __wasm_export_test2(p0: Int, p1: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val list = ArrayList<String?>(p1)
    for (i in 0 until p1) {
      val base = (p0) + (i * 12)
      // OptionLift start
      val option =
          if ((base + 0).ptr.loadUByte().toInt() == 1) {
            STRING_FROM_MEM((base + 4).ptr.loadInt(), (base + 8).ptr.loadInt())
          } else {
            null
          }
      // OptionLift end

      list.add(option)
    }
    val result: List<String> = IfaceExportsImpl.test2(list)

    val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()

    val address = allocator.allocate(result.size * 8 /*, align=4*/).address.toInt()
    for ((index, el) in result.withIndex()) {
      val base = address + (index * 8)

      val bytearray = el.encodeToByteArray()
      val len = bytearray.size
      val ptr0 = allocator.writeToLinearMemory(bytearray).address.toInt()

      (base + 4).ptr.storeInt(len)
      (base + 0).ptr.storeInt(ptr0)
    }
    (ptr + 4).ptr.storeInt(result.size)
    (ptr + 0).ptr.storeInt(address)
    return ptr
  }
}

@WasmExport("cm:example/iface#test3")
fun __wasm_export_test3(p0: Int, p1: Int, p2: Int, p3: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    // OptionLift start
    val option1 =
        if (p0 == 1) {
          // OptionLift start
          val option0 =
              if (p1 == 1) {
                // OptionLift start
                val option =
                    if (p2 == 1) {
                      p3
                    } else {
                      null
                    }
                // OptionLift end
                Option.Some(option)
              } else {
                Option.None
              }
          // OptionLift end
          Option.Some(option0)
        } else {
          Option.None
        }
    // OptionLift end
    val result: Int = IfaceExportsImpl.test3(option1)

    return result
  }
}

@WasmExport("cm:example/iface#test-record")
fun __wasm_export_testRecord(p0: Int, p1: Int, p2: Int, p3: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: IfaceExports.Ab =
        IfaceExportsImpl.testRecord(
            IfaceExports.Ab(
                STRING_FROM_MEM(p0, p1),
                STRING_FROM_MEM(p2, p3),
            ))

    val ptr = /* RETURN_ADDRESS_ALLOC(size=16, align=4)*/ allocator.allocate(16).address.toInt()

    val bytearray = result.a.encodeToByteArray()
    val len = bytearray.size
    val ptr0 = allocator.writeToLinearMemory(bytearray).address.toInt()

    (ptr + 4).ptr.storeInt(len)
    (ptr + 0).ptr.storeInt(ptr0)

    val bytearray3 = result.b.encodeToByteArray()
    val len2 = bytearray3.size
    val ptr1 = allocator.writeToLinearMemory(bytearray3).address.toInt()

    (ptr + 12).ptr.storeInt(len2)
    (ptr + 8).ptr.storeInt(ptr1)
    return ptr
  }
}

@WasmExport("cm:example/iface#test-result")
fun __wasm_export_testResult(p0: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: Result<Int> = IfaceExportsImpl.testResult((p0 != 0))

    val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()
    if (result.isFailure) {
      val payload0 = (result.exceptionOrNull() as ComponentException).value as Int
      (ptr + 0).ptr.storeByte(1.toByte())
      (ptr + 4).ptr.storeInt(payload0)
    } else {
      val payload = result.getOrThrow()!!
      (ptr + 0).ptr.storeByte(0.toByte())
      (ptr + 4).ptr.storeInt(payload)
    }
    return ptr
  }
}

@WasmExport("cm:example/iface#test-tuple")
fun __wasm_export_testTuple(
    p0: Int,
    p1: Int,
    p2: Int,
    p3: Int,
    p4: Int,
    p5: Int,
    p6: Int,
    p7: Int
): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: Tuple6<Boolean, Boolean, String, Boolean, String, Int> =
        IfaceExportsImpl.testTuple(
            (p0 != 0),
            Pair<Boolean, String>(
                (p1 != 0),
                STRING_FROM_MEM(p2, p3),
            ),
            Triple<Boolean, String, Int>(
                (p4 != 0),
                STRING_FROM_MEM(p5, p6),
                p7,
            ))

    val ptr = /* RETURN_ADDRESS_ALLOC(size=28, align=4)*/ allocator.allocate(28).address.toInt()
    (ptr + 0).ptr.storeByte((if (result.f0) 1 else 0).toByte())
    (ptr + 1).ptr.storeByte((if (result.f1) 1 else 0).toByte())

    val bytearray = result.f2.encodeToByteArray()
    val len = bytearray.size
    val ptr0 = allocator.writeToLinearMemory(bytearray).address.toInt()

    (ptr + 8).ptr.storeInt(len)
    (ptr + 4).ptr.storeInt(ptr0)
    (ptr + 12).ptr.storeByte((if (result.f3) 1 else 0).toByte())

    val bytearray3 = result.f4.encodeToByteArray()
    val len2 = bytearray3.size
    val ptr1 = allocator.writeToLinearMemory(bytearray3).address.toInt()

    (ptr + 20).ptr.storeInt(len2)
    (ptr + 16).ptr.storeInt(ptr1)
    (ptr + 24).ptr.storeInt(result.f5)
    return ptr
  }
}

@WasmExport("cm:example/iface#test-variant")
fun __wasm_export_testVariant(p0: Int, p1: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    // VariantLift START.
    val variant =
        when (p0) {
          0 -> {
            IfaceExports.V.A(p1)
          }
          1 -> {
            IfaceExports.V.B(Float.fromBits(p1))
          }
          else -> error("unreachable")
        }
    // VariantLift END
    val result: IfaceExports.V = IfaceExportsImpl.testVariant(variant)

    val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()
    // VariantLower START
    when (val x = result) {
      is IfaceExports.V.A -> {
        val payload = x.value
        (ptr + 0).ptr.storeByte(0.toByte())
        (ptr + 4).ptr.storeInt(payload)
      }
      is IfaceExports.V.B -> {
        val payload0 = x.value
        (ptr + 0).ptr.storeByte(1.toByte())
        (ptr + 4).ptr.storeFloat(payload0)
      }
      else -> error("unreachable")
    }
    // VariantLower END
    return ptr
  }
}

@WasmExport("cm:example/iface#test-enum")
fun __wasm_export_testEnum(p0: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: Int = IfaceExportsImpl.testEnum(IfaceExports.Color.values()[p0])

    return result
  }
}

@WasmExport("cm:example/iface#test-flags")
fun __wasm_export_testFlags(p0: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: String = IfaceExportsImpl.testFlags(IfaceExports.Fg(p0.toLong()))

    val ptr = /* RETURN_ADDRESS_ALLOC(size=8, align=4)*/ allocator.allocate(8).address.toInt()

    val bytearray = result.encodeToByteArray()
    val len = bytearray.size
    val ptr0 = allocator.writeToLinearMemory(bytearray).address.toInt()

    (ptr + 4).ptr.storeInt(len)
    (ptr + 0).ptr.storeInt(ptr0)
    return ptr
  }
}

@WasmImport("[export]cm:example/test", "[resource-drop]test-exported-resource")
internal external fun __cm_resource_abi_export_TestExportsImpl_TestExportedResource_drop(
    handle: Int
): Unit

@WasmImport("[export]cm:example/test", "[resource-new]test-exported-resource")
internal external fun __cm_resource_abi_export_TestExportsImpl_TestExportedResource_new(
    handle: Int
): Int

@WasmImport("[export]cm:example/test", "[resource-rep]test-exported-resource")
internal external fun __cm_resource_abi_export_TestExportsImpl_TestExportedResource_rep(
    handle: Int
): Int

@WasmExport("cm:example/test#[constructor]test-exported-resource")
fun __wasm_export_constructor(p0: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val result: TestExportsImpl.TestExportedResourceImpl =
        TestExportsImpl.TestExportedResourceImpl(p0)

    var handle = result.__handle.value
    if (handle == 0) {
      var localRep = RepTable.add(result)
      handle = __cm_resource_abi_export_TestExportsImpl_TestExportedResource_new(localRep)
    }

    result.__handle = ResourceHandle(0)
    return handle
  }
}

@WasmExport("cm:example/test#[method]test-exported-resource.get-a")
fun __wasm_export_getA(p0: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val resource = RepTable.get(p0) as TestExportsImpl.TestExportedResourceImpl
    val result: Int = resource.getA()

    return result
  }
}

@WasmExport("cm:example/test#[method]test-exported-resource.set-a")
fun __wasm_export_setA(p0: Int, p1: Int): Unit {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val resource = RepTable.get(p0) as TestExportsImpl.TestExportedResourceImpl
    resource.setA(p1)
  }
}

@WasmExport("cm:example/test#[static]test-exported-resource.add")
fun __wasm_export_add(p0: Int, p1: Int): Int {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator ->
    val resource = RepTable.get(p0) as TestExportsImpl.TestExportedResourceImpl
    val result: TestExportsImpl.TestExportedResourceImpl =
        TestExportsImpl.TestExportedResourceImpl.add(resource, p1)

    var handle = result.__handle.value
    if (handle == 0) {
      var localRep = RepTable.add(result)
      handle = __cm_resource_abi_export_TestExportsImpl_TestExportedResource_new(localRep)
    }

    result.__handle = ResourceHandle(0)
    return handle
  }
}

@WasmExport("cm:example/test#test")
fun __wasm_export_test(): Unit {
  freeAllComponentModelReallocAllocatedMemory()
  withScopedMemoryAllocator { allocator -> TestExportsImpl.test() }
}
