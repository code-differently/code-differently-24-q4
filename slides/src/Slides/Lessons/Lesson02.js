import htm from "htm";
import { createElement } from "react";
import { Lesson, QuestionsSlide } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson02() {
    return html`
        <${Lesson} title="Exploring the Terminal" lessonId="lesson_02" subtitle="Lesson 2">
            <section>
                <p>Developers do <em>a lot</em> of typing</p>
            </section>
            <section>
                <p>And we don't like <em>switching</em> between keyboard and mouse…</p>
            </section>
            <section>
                <p>And making graphical user interfaces is <em>hard</em> and sometimes <em>ambiguous</em></p>
            </section>
            <section>
                <p>So we prefer <em>the terminal</em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3 style=${{'font-size': '1em'}}>Things we do from <em>the terminal</em></h3>
                <ul>
                    <li class="fragment">Install and run programs needed for the dev workflow</li>
                    <li class="fragment">Navigate files and source code</li>
                    <li class="fragment">Manipulate files quickly</li>
                    <li class="fragment">Automate repetitive tasks</li>
                </ul>
            </section>
            <section>
                <p>⌘ + Spacebar, "terminal"</p>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide49.png" alt="Slide 49" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide50.png" alt="Slide 50" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide51.png" alt="Slide 51" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide52.png" alt="Slide 52" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide53.png" alt="Slide 53" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide54.png" alt="Slide 54" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide55.png" alt="Slide 55" />
            </section>
            <section class="ml-bullet-slide">
                <h3 style=${{'font-size': '1em'}}>Navigating files & directories</h3>
                <p class="fragment"><em>pwd</em> - print working directory</p>
                <p class="fragment"><em>ls</em> - list files in directory</p>
                <p class="fragment"><em>cd</em> - change directories</p>
            </section>
            <section class="ml-bullet-slide">
                <h3 style=${{'font-size': '1em'}}>Adding and removing files & dirs</h3>
                <p class="fragment"><em>touch</em> - make a new file</p>
                <p class="fragment"><em>mkdir</em> - make a new directory</p>
                <p class="fragment"><em>mv</em> - moves a file or directory</p>
                <p class="fragment"><em>cp</em> - copy a file or directory</p>
                <p class="fragment"><em>rm</em> - remove a file or directory</p>
            </section>
            <section class="ml-bullet-slide">
                <h3 style=${{'font-size': '1em'}}>Finding stuff</h3>
                <p class="fragment"><em>find</em> - find files matching a pattern</p>
                <p class="fragment"><em>grep</em> - find files based on content</p>
            </section>
            <section class="ml-bullet-slide">
                <h3 style=${{'font-size': '1em'}}>Actin all powerful and stuff</h3>
                <p class="fragment"><em>sudo</em> - run something as admin</p>
                <p class="fragment"><em>chmod</em> - change permissions on file/dir</p>
            </section>
            <section class="ml-bullet-slide">
                <h3 style=${{'font-size': '1em'}}>Viewing and editing files</h3>
                <p class="fragment"><em>cat</em> - dump contents of a file</p>
                <p class="fragment"><em>tail</em> - view the last several lines of a file</p>
                <p class="fragment"><em>nano</em> - lightweight file editor</p>
            </section>
            <section class="ml-bullet-slide">
                <h3 style=${{'font-size': '1em'}}>Special operators</h3>
                <p class="fragment"><em>&&</em> - chain commands together</p>
                <p class="fragment"><em>|</em> - (pipe) feed output of one to another</p>
                <p class="fragment"><em>&</em> - run command in the background</p>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide62.png" alt="Slide 62" />
            </section>
            <${QuestionsSlide} />
        <//>`;
}

export default Lesson02;