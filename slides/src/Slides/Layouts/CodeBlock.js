import htm from "htm";
import { createElement } from "react";

const html = htm.bind(createElement);

function CodeBlock({lang, fontSize, style, lineNumbers, children}) {
    return html`
        <pre style=${{"font-size": fontSize}}>
            <code data-trim data-noescape data-line-numbers=${lineNumbers} class="language-${lang}" style=${style}>
                <script type="text/template">
${children}
                </script>
            </code>
        </pre>`;
}

export default CodeBlock;