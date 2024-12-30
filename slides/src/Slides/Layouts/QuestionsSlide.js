
import htm from "htm";
import { createElement } from "react";

const html = htm.bind(createElement);

function QuestionsSlide() {
    return html`
        <section>
            <p><i>Questions<em>?</em></i></p>
        </section>`;
}

export default QuestionsSlide;