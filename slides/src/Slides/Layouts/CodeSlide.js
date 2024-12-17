import htm from "htm";
import { createElement } from "react";

const html = htm.bind(createElement);

function CodeSlide({title, lang, badge, fontSize, lineNumbers, children}) {
    return html`
        <section class="ml-code-slide">
            ${title && html`<h3>${title}</h3>`}
            <pre style=${{"font-size": fontSize}}>
                <code data-trim data-noescape data-line-numbers=${lineNumbers} class="language-${lang}">
                    <script type="text/template">
${children}
                    </script>
                </code>
            </pre>
            ${badge && html`<div class="badge">${badge}</div>`}
        </section>`;
}

export default CodeSlide;