import htm from "htm";
import { createElement } from "react";
import { DemoSlide, Lesson } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Supplemental1() {
    return html`
        <${Lesson} title="Content Management Systems" lessonId="supplemental_1" subtitle="Supplemental 1" titleFontSize="1.2em">
            <section class="ml-bullet-slide">
                <h3>Let's review:</h3>
                <ul style=${{"font-size": ".95em"}}>
                    <li class="fragment"><i>Lesson 22</i> - Building Applications</li>
                    <li class="fragment"><i>Lesson 23</i> - Intro to HTML, CSS, and JS</li>
                    <li class="fragment"><i>Lesson 28</i> - Intro to Databases</li>
                </ul>
            </section>
            <section>
                <p>An <em>application</em> is a program that fulfills a purpose for some user</p>
            </section>
            <section>
                <p>Software applications are usually a combination of <i>programs</i> and <i>services</i> that work together in a <em>software system</em></p>
            </section>
            <section>
                <p>Let's talk about what you need to build an <em>app</em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Anatomy of an Application</h3>
                <ul>
                    <li class="fragment custom em no-em">User interface</li>
                    <li class="fragment custom em no-em">Services</li>
                    <li class="fragment custom em no-em">Storage</li>
                    <li class="fragment custom em">Configuration</li>
                </ul>
            </section>
            <section>
                <p>Now, let's talk about CMS systems</p>
            </section>
            <section>
                <p>Not everyone wants to write <em>HTML</em> and <em>CSS</em> to run websites and applications</p>
            </section>
            <section>
                <p>A <em><i>Content Management System (CMS)</i></em> is a software system that allows users to publish content (web pages, blogs, articles) without code</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Use cases</h3>
                <ul>
                    <li class="fragment">Blogs and personal websites</li>
                    <li class="fragment">Company websites</li>
                    <li class="fragment">E-commerce stores</li>
                    <li class="fragment">Community forums and membership sites</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Popular <em>CMS</em> platforms</h3>
                <ul>
                    <li class="fragment">WordPress (<i>43.7% of the web</i>)</li>
                    <li class="fragment">Drupal</li>
                    <li class="fragment">Joomla</li>
                    <li class="fragment">Squarespace</li>
                    <li class="fragment">Wix</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Common features include</h3>
                <ul>
                    <li class="fragment"><em>WYSIWYG</em> editor</li>
                    <li class="fragment">Theme editing</li>
                    <li class="fragment">Media management (<i>images & video</i>)</li>
                    <li class="fragment">User management</li>
                    <li class="fragment">Plugin functionality</li>
                    <li class="fragment">Usage analytics</li>
                </ul>
            </section>
            <section>
                <iframe width="100%" height="500px" style=${{"box-shadow": "0 2px 8px 0 rgba(63,69,81,0.16)", "border-radius": "15px"}} allowtransparency="true" allowfullscreen="true" scrolling="no" title="Embedded DrawSQL IFrame" frameborder="0" src="https://drawsql.app/teams/morgan-latimer-llc/diagrams/wordpress-mysql/embed"></iframe>
            </section>
            <${DemoSlide} />
        <//>`;
}

export default Supplemental1;