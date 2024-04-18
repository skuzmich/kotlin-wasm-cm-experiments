use pulldown_cmark::{html, Parser};

wit_bindgen::generate!({
    path: "wit",
    exports: {
      "cm:example/iface": Component
    },
});

struct Component;

impl exports::cm::example::iface::Guest for Component {
    fn markdown_to_html(input: String) -> String {
        let parser = Parser::new(&input);
        let mut html_output = String::new();
        html::push_html(&mut html_output, parser);
        html_output
    }

    fn test1(p1: bool, p2: i8, p3: i16, p4: i32, p5: i64, p6: u8, p7: u16, p8: u32, p9: u64, p10: char) -> String {
        return format!("{p1}, {p2}, {p3}, {p4}, {p5}, {p6}, {p7}, {p8}, {p9}, {p10}")
    }

    fn test2(x: Vec<Option<String>>) -> Vec<String> {
        let mut  result: Vec<String> = Vec::new();
        for s in x {
            match s {
                None => result.push("-".to_string()),
                Some(s) => result.push(s.repeat(2))

            }
        }
        result.clone()
    }

    fn test3(x: Option<Option<Option<i32>>>) -> i32 {
        match x {
            None => 0,
            Some(y) => match y {
                None => 1,
                Some(z) => match z {
                    None => 2,
                    Some(z2) => z2
                }
            }
        }
    }

    fn test_record(x: exports::cm::example::iface::Ab) -> exports::cm::example::iface::Ab {
        return exports::cm::example::iface::Ab {
            a: x.a.repeat(2),
            b: x.b.repeat(2),
        }
    }

    fn test_result(x: bool) -> Result<i32, i32> {
        if x {
            Ok(10)
        } else {
            Err(20)
        }
    }

    fn test_tuple(
        x1: (bool,),
        x2: (bool, String),
        x3: (bool, String, i32),
    ) -> (
        bool,
        bool,
        String,
        bool,
        String,
        i32,
    ) {
        (x1.0, x2.0, x2.1, x3.0, x3.1, x3.2)
    }

    fn test_variant(x: exports::cm::example::iface::V) -> exports::cm::example::iface::V {
        match x {
            exports::cm::example::iface::V::A(x) => exports::cm::example::iface::V::A(x + 1),
            exports::cm::example::iface::V::B(x) => exports::cm::example::iface::V::B(x - 1.0),
        }
    }

    fn test_enum(x: exports::cm::example::iface::Color) -> i32 {
        match x {
            exports::cm::example::iface::Color::HotPink => 0,
            exports::cm::example::iface::Color::LimeGreen => 1,
            exports::cm::example::iface::Color::NavyBlue => 2,
        }
    }
    fn test_flags(x: exports::cm::example::iface::Fg) -> String {
        format!("{}", x.bits())
    }
}
