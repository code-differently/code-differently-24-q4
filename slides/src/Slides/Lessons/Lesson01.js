import htm from "htm";
import { createElement } from "react";
import { Lesson } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson01() {
    return html`
        <${Lesson} title="Getting to Know the IDE" lessonId="lesson_01" subtitle="Lesson 1">
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide28.png" alt="Slide 28" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide29.png" alt="Slide 29" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide30.png" alt="Slide 30" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide31.png" alt="Slide 31" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide32.png" alt="Slide 32" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide33.png" alt="Slide 33" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide34.png" alt="Slide 34" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide35.png" alt="Slide 35" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide36.png" alt="Slide 36" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide37.png" alt="Slide 37" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide38.png" alt="Slide 38" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide39.png" alt="Slide 39" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide40.png" alt="Slide 40" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide41.png" alt="Slide 41" />
            </section>
        <//>`;
}

export default Lesson01;