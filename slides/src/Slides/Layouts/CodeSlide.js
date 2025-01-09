import htm from "htm";
import { createElement } from "react";
import CodeBlock from "./CodeBlock.js";

const html = htm.bind(createElement);

function CodeSlide({title, lang, badge, fontSize, style, lineNumbers, children}) {
    return html`
        <section class="ml-code-slide">
            ${title && html`<h3>${title}</h3>`}
            <${CodeBlock} lang=${lang} fontSize=${fontSize} lineNumbers=${lineNumbers} style=${style}>
${children}
            <//>
            ${badge && html`<div class="badge">${badge}</div>`}
        </section>`;
}

export default CodeSlide;