import htm from "htm";
import { createElement } from "react";
import { CodeSlide, DemoSlide, Lesson, QuestionsSlide } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson25() {
    return html`
        <${Lesson} title="Intro to React" lessonId="lesson_25" subtitle="Lesson 25">
            <section>
                <p>In our last lesson, we built a web server and worked with HTML, CSS, and JavaScript to build a simple application</p>
            </section>
            <section>
                <p>However, there are some downsides to the approach we used…</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Things to consider</h3>
                <ul>
                    <li class="fragment">Handcrafting HTML and CSS is a pain</li>
                    <li class="fragment">Not easy to figure out code reuse</li>
                    <li class="fragment">Lack of type-safety painful for large teams</li>
                    <li class="fragment">Lots of boilerplate</li>
                </ul>
            </section>
            <section>
                <p>Let's make some <em>upgrades</em>…</p>
            </section>
            <section>
                <p>First, we're going to use a library called <em>React</em> for creating web components</p>
            </section>
            <section>
                <p>A <em>web component</em> is custom HTML element that encapsulates its own style and behavior</p>
            </section>
            <section>
                <p>Web components are designed to be <em>reusable</em> and <em>flexible</em> building blocks for modern web applications</p>
            </section>
            <section>
                <p>In addition, we'll upgrade our language from JavaScript to <em>TypeScript</em></p>
            </section>
            <section>
                <p><em>TypeScript</em> is a <i>superset</i> of JavaScript. It has all of the JavaScript <i>features</i> with the added benefit of type-safety (like Java)</p>
            </section>
            <section>
                <p>Also, we're going to upgrade from plain CSS to <em>SASS</em></p>
            </section>
            <section>
                <p><em>SASS</em> enables us to write CSS with more modern features and syntax.</p>
            </section>
            <section>
                <p>Lastly, we're going to upgrade from just using a plain Node server to using <em>Vite</em></p>
            </section>
            <section>
                <p><em>Vite</em> (pronounced "veet") is a development web server that supports conveniences designed to speed up development</p>
            </section>
            <section>
                <p>And the best part is that we can get all of this setup with two commands…</p>
            </section>
            <${CodeSlide} lang="bash" badge="Step 1" textAlign="center" fontSize="1em" style=${{ "text-wrap": "wrap", "text-align": "center" }}>
${`
$ npm create vite@latest -- --template react-ts
`}
            <//>
            <${CodeSlide} lang="bash" badge="Step 2" textAlign="center" fontSize="1em" style=${{ "text-wrap": "wrap", "text-align": "left" }}>
${`
$ cd {your project name}
$ npm install -D sass
`}
            <//>
            <section>
                <p>
                    Now we can install everything using<br />
                    <em>$ npm install</em><br />
                    and run the new server with<br />
                    <em>$ npm run dev</em>
                </p>

            </section>
            <${DemoSlide} />
            <${QuestionsSlide} />
        <//>`;
}

export default Lesson25;