import('./build/out/jco/kco-wasm-wasi.mjs').then(x => {
    console.log(x.iface.markdownToHtml('- Ha'));
    console.log(x.iface.test1(
        true,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        'G'
    ));

    console.log(x.iface.testRecord( { a: "0", b: "11" }));
    console.log(x.iface.test2(["ab", "cd", null, "ef"]));


    console.log(x.iface.testResult(true));

    try {
        console.log(x.iface.testResult(false));
    } catch (e) {
        console.log("Caught error: ", e);
    }
    console.log(x.iface.testTuple([true], [false, "S1"], [true, "S2_JS", 50]));

    console.log(x.iface.testVariant({tag: 'a', val: 10}));
    console.log(x.iface.testVariant({tag: 'b', val: 20}));

    console.log(x.iface.testEnum("hot-pink"));
    console.log(x.iface.testEnum("lime-green"));

    console.log(x.iface.testFlags({a: true, b: true, c: true}));

    console.log("Testing...");
    x.test.test();
    console.log("Testing end...");
});