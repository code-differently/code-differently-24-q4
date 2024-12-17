import htm from "htm";
import { createElement } from "react";
import { Lesson, QuestionsSlide } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson04() {
    return html`
        <${Lesson} title="How to be a Great SWE" lessonId="lesson_04" subtitle="Lesson 4">
            <section>
                <p>There are <em>5 things</em> you need to be a great engineer</p>
            </section>
            <section>
                <p>1. Stay curious. Ask the <em><i>dumb questions</i></em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3>How to be curious</h3>
                <ul>
                    <li class="fragment">Be humble</li>
                    <li class="fragment">Don't stop at how, ask <em>why</em></li>
                    <li class="fragment">Think about the <em>"what if's…"</em></li>
                    <li class="fragment">Get <em>specific</em> and <i>drill deep</i> on something. There's always more to learn.</li>
                </ul>
            </section>
            <section>
                <p>Speaking of learning…</p>
            </section>
            <section>
                <p>2. Learn <em>how to learn</em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Ways to learn</h3>
                <ul style=${{"font-size": ".9em"}}>
                    <li class="fragment"><em><i>Topic-oriented learning</i></em> (YouTube, Books, Courses, Tutorials, MDN, Java docs)</li>
                    <li class="fragment"><em><i>Question-based learning</i> </em>(Stack Overflow, Quora, Google search, ChatGPT, Gemini)</li>
                    <li class="fragment"><em><i>Simulation-based learning</i></em> (tutorials, build it yourself)</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>What kind of learner are you?</h3>
                <ul>
                    <li class="fragment"><em><i>Kinesthetic</i></em> (requires physical activity)</li>
                    <li class="fragment"><em><i>Visual</i></em> (needs to watch something)</li>
                    <li class="fragment"><em><i>Auditory</i></em> (needs to hear it)</li>
                    <li class="fragment"><em><i>Read/write</i></em> (note takers and book readers)</li>
                </ul>
            </section>
            <section>
                <p>You should do them <em><i>all</i></em></p>
            </section>
            <section>
                <p>3. <em>Read and write</em> tons of code.<br/>Code every day.</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Ways to get your reps in</h3>
                <ol>
                    <li class="fragment">Tutorials</li>
                    <li class="fragment">Code memorization exercises</li>
                    <li class="fragment">Personal projects</li>
                    <li class="fragment">Get a job</li>
                    <li class="fragment">Volunteer</li>
                </ol>
            </section>
            <section>
                <p>4. Practice <em>effective</em> problem-solving skills</p>
            </section>
            <section>
                <p>This requires <i>discipline</i>, <i>rigor</i>, and <i>tenacity</i>.</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>The Six Steps</h3>
                <ol style=${{"font-size": ".9em"}}>
                    <li class="fragment">Repeat the question out loud</li>
                    <li class="fragment">Clarify assumptions and ask questions</li>
                    <li class="fragment">Work through examples</li>
                    <li class="fragment">Brainstorm multiple solutions</li>
                    <li class="fragment">Implement</li>
                    <li class="fragment">Test</li>
                </ol>
            </section>
            <section class="ml-bullet-slide">
                <h3>REACTO</h3>
                <ul>
                    <li>R: <em>Repeat</em> the question</li>
                    <li>E: Work through <em>examples</em></li>
                    <li>A: State an <em>approach</em></li>
                    <li>C: Implement (<em>code</em>)</li>
                    <li>T: <em>Test</em></li>
                    <li>O: <em>Optimize</em></li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>UMPIRE</h3>
                <ul>
                    <li>U - <em>Understand</em> the question</li>
                    <li>M - <em>Match</em> to other known problems</li>
                    <li>P - <em>Plan</em> a solution</li>
                    <li>I - <em>Implement</em></li>
                    <li>R - <em>Review</em> the code (test)</li>
                    <li>E - <em>Evaluate</em> the performance</li>
                </ul>
            </section>
            <section>
                <p>5. <em>(Over)</em>communicate</p>
            </section>
            <section>
                <p>To over-communicate, you must first learn how to <em>communicate well</em>.</p>
            </section>
            <section>
                <p>Once you know how to communicate well, do it <em><i>frequently</i></em>.</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>How SWE's communicate</h3>
                <ul>
                    <li class="fragment">Code</li>
                    <li class="fragment">Emails</li>
                    <li class="fragment">Design docs</li>
                    <li class="fragment">Bug reports</li>
                    <li class="fragment">Presentations</li>
                    <li class="fragment">Memes</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Let's review</h3>
                <ul>
                    <li>Be curious</li>
                    <li>Learn how to learn</li>
                    <li>Code constantly</li>
                    <li>Be a tenacious problem solver</li>
                    <li>Over-communicate</li>
                </ul>
            </section>
            <section>
                <p>Let's learn together…</p>
            </section>
            <${QuestionsSlide}/>
        <//>`;
}

export default Lesson04;