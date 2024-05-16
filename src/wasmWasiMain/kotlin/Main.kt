import Ui.Color
import Ui.Modifiers
import Ui.Rgb
import Ui.Shape
import Ui.createButton
import Ui.createHtmlTextArea

object RunExportsImpl : RunExports {
    override fun run() {
        createButton(
            label = "example",
            shape = Shape.ROUNDED,
            color = Color.Rgb(Rgb(r = 177u, g = 37u, b = 234u)),
            modifiers = Modifiers(
                outlined = true,
                shadow = false,
            )
        )

        val markdown = """
            # Kotlin/Wasm and Component Model
            - [Learn more about Kotlin/Wasm](https://kotl.in/wasm)
            - [Learn more about Wasm Component Model](https://component-model.bytecodealliance.org/introduction.html)
        """.trimIndent()

        val html = Markdown.convertMarkdownToHtml(markdown)

        createHtmlTextArea(html)
    }
}