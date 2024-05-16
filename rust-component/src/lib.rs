use pulldown_cmark::{html, Parser};
use exports::component_model::example::{
    ui::{Guest as UIGuest, Shape, Color, Modifiers},
    markdown::{Guest as MarkdownGuest}
};

wit_bindgen::generate!({
    path: "wit",
    exports: {
      "component-model:example/ui": UI,
      "component-model:example/markdown": Markdown,
    },
});

struct UI;
struct Markdown;

impl UIGuest for UI {
    fn create_button(
        label: String,
        shape: Shape,
        color: Color,
        modifiers: Option<Modifiers>
    ) {
        println!("\nCreating button:");
        println!("      label: {label}");
        println!("      shape: {:?}", shape);
        println!("      color: {:?}", color);
        println!("  modifiers: {:?}", modifiers);
    }

    fn create_html_text_area(html: String) {
        println!("\nCreating HTML text area:");
        println!("{html}");
    }
}

impl MarkdownGuest for Markdown {
    fn convert_markdown_to_html(input: String) -> String {
        let parser = Parser::new(&input);
        let mut html_output = String::new();
        html::push_html(&mut html_output, parser);
        html_output
    }
}

