import htm from "htm";
import { createElement } from "react";
import { Lesson } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson26() {
    return html`
        <${Lesson} title="Web APIs using REST" lessonId="lesson_26" subtitle="Lesson 26">
            <section>
                <p>Now that we’ve spent some time on the <em>frontend</em>, it’s time to switch our focus to the <em>backend</em></p>
            </section>
            <section>
                <p>But first, we need to discuss <em>APIs</em></p>
            </section>
            <section>
                <p>In modern web applications, we break up into programs that handle what the user sees (frontend)...</p>
            </section>
            <section>
                <p>…and programs that handle interacting with data and business logic (backend)</p>
            </section>
            <section>
                <p>An <em>API</em> (Application Programming Interface) is what allows these programs to talk to each other</p>
            </section>
            <section>
                <p>Most APIs rely on the <i>protocol</i> of the web, <em>HTTP</em></p>
            </section>
            <section>
                <p>A <em>client</em> will make a request to an <em>API server</em> and wait for a response containing JSON, XML, CSV, or some other data interchange format</p>
            </section>
            <section>
                <p>This style of API is known as a <em>REST</em><span style=${{color: "red", "font-weight": "bold"}}>*</span> (Representational State Transfer)</p>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide842.png" alt="Slide 842" />
            </section>
            <section>
                <p><span style=${{color: "red", "font-weight": "bold"}}>Note:</span> Not really, hahahah. It’s really REST-like RPC, but that’s beyond the scope of this course</p>
            </section>
            <section>
                <p>In order to build a REST API, you need the following elements…</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>REST API elements</h3>
                <ul>
                    <li class="fragment">A URL scheme that identifies resources the API provides</li>
                    <li class="fragment">A set of HTTP methods you can conduct on each resource</li>
                    <li class="fragment">A consistent way to represent the resource (e.g. JSON, XML, CSV, etc)</li>
                </ul>
            </section>
            <section>
                <p>Suppose that we want to build an API for library books</p>
            </section>
            <section>
                <p>
                    On the web, we might host an API server that exposes books at the following url:<br />
                    http://codedifferently.com<em>/api/books</em>
                </p>
            </section>
            <section>
                <p>We might then support the following operations…</p>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide849.png" alt="Slide 849" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide850.png" alt="Slide 850" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide851.png" alt="Slide 851" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide852.png" alt="Slide 852" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide853.png" alt="Slide 853" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide854.png" alt="Slide 854" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide855.png" alt="Slide 855" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide856.png" alt="Slide 856" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide857.png" alt="Slide 857" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide858.png" alt="Slide 858" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide859.png" alt="Slide 859" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide860.png" alt="Slide 860" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide861.png" alt="Slide 861" />
            </section>
        <//>`;
}

export default Lesson26;