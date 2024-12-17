import htm from "htm";
import { createElement } from "react";

const html = htm.bind(createElement);

function CodeSlide({title, lang, badge, children}) {
    return html`
        <section class="ml-code-slide">
            ${title && html`<h3>${title}</h3>`}
            <pre>
                <code data-trim data-noescape class="language-${lang}">
${children}
                </code>
            </pre>
            ${badge && html`<div class="badge">${badge}</div>`}
        </section>`;
}

export default CodeSlide;