
import htm from "htm";
import { createElement } from "react";

const html = htm.bind(createElement);

function DemoSlide() {
    return html`
        <section>
            <p><i>Demo</i></p>
        </section>`;
}

export default DemoSlide;