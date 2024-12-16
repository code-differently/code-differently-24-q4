
import htm from "htm";
import { createElement } from "react";
import TitleSlide from "./TitleSlide.js";

const html = htm.bind(createElement);

function Lesson({ title, subtitle, lessonId, children }) {
    return html`
        <section>
            <${TitleSlide}
                title=${title}
                subtitle=${subtitle}
                slideId=${lessonId}
            />
            ${children}
        </section>`;
}

export default Lesson;