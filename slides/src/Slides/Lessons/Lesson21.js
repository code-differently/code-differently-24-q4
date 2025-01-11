import htm from "htm";
import { createElement } from "react";
import { CodeSlide, Lesson } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson21() {
    return html`
        <${Lesson} title="Computer Languages" lessonId="lesson_21" subtitle="Lesson 21">
            <section>
                <p>We're going to explore a few new <em>languages</em></p>
            </section>
            <section>
                <p>But before we do, let's discuss how we classify languages</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li class="fragment">Programming</li>
                    <li class="fragment">Markup</li>
                    <li class="fragment">Data</li>
                    <li class="fragment">Query</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li><em>Programming</em></li>
                    <li>Markup</li>
                    <li>Data</li>
                    <li>Query</li>
                </ul>
            </section>
            <section>
                <p><em>Programming languages</em> are used to instruct the computer <i>how</i> to do something (imperative)</p>
            </section>
            <section>
                <p>There are three popular <em>paradigms</em> of programming languages: <i>object oriented</i>, <i>scripting</i>, and <i>functional</i></p>
            </section>
            <section>
                <p><em>Object-oriented programming</em> languages primary use OOP principles for organizing code</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Object-oriented languages</h3>
                <ul>
                    <li class="fragment">Java</li>
                    <li class="fragment">C#</li>
                    <li class="fragment">C++</li>
                    <li class="fragment">Python</li>
                    <li class="fragment">Rust</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Pros of OOP</h3>
                <ul>
                    <li class="fragment">Great for representing complex, real-world concepts</li>
                    <li class="fragment">Can be used by large teams and organizations effectively</li>
                    <li class="fragment">Optimal for code reuse and common patterns</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Cons of OOP</h3>
                <ul>
                    <li class="fragment">TONS of boilerplate</li>
                    <li class="fragment">Most OOP languages need to be compiled before they can be executed</li>
                    <li class="fragment">Typically only used on the backend</li>
                </ul>
            </section>
            <section>
                <p><em>Scripting languages</em> are designed for automating tasks and are typically lighter than OOP languages</p>
            </section>
            <section>
                <p>They often don't need to be compiled before being run. Instead, they are <em>interpreted</em> line-by-line</p>
            </section>
            <section>
                <p>Scripting languages are way more chill, featuring conveniences like dynamic typing, weak typing, and first-class functions</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Scripting languages</h3>
                <ul>
                    <li class="fragment">JavaScript</li>
                    <li class="fragment">Python</li>
                    <li class="fragment">Bash</li>
                    <li class="fragment">Powershell</li>
                </ul>
            </section>
            <section data-background-image="images/jackie-chan-meme.gif" data-background-size="contain" data-background-opacity="0.5">
                <p>Isn't Python an OOP language?</p>
            </section>
            <section>
                <p>Some languages are multi-paradigm, and can be used as OOP, scripting, or functional languages</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Pros of Scripting Languages</h3>
                <ul>
                    <li class="fragment">Less boilerplate</li>
                    <li class="fragment">Can usually run code anywhere quickly</li>
                    <li class="fragment">Useful for automating anything</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Cons of Scripting Languages</h3>
                <ul>
                    <li class="fragment">Since many are weakly typed, it can be harder to catch some bugs</li>
                    <li class="fragment">Harder to use in large teams</li>
                    <li class="fragment">Typically slower to execute than OOP languages</li>
                </ul>
            </section>
            <section>
                <p>Lastly, there are <em>functional</em> programming languages, called so because they rely on functions to describe the world</p>
            </section>
            <section>
                <p>Usually, functions are first-class citizens that can be used like any other data type, and functions are often composed of other functions</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Functional languages</h3>
                <ul>
                    <li class="fragment">Lisp</li>
                    <li class="fragment">Scheme</li>
                    <li class="fragment">Closure</li>
                    <li class="fragment">JavaScript</li>
                    <li class="fragment">Python</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Pros of functional languages</h3>
                <ul>
                    <li>Often chill like scripting languages</li>
                    <li>Prizes immutability and pure functions, which can minimize bugs and simplify logic</li>
                    <li>Great for math applications and AI</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Cons of functional languages</h3>
                <ul>
                    <li>Higher learning curve than OOP and scripting languages</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li><em>Programming</em></li>
                    <li>Markup</li>
                    <li>Data</li>
                    <li>Query</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li>Programming</li>
                    <li><em>Markup</em></li>
                    <li>Data</li>
                    <li>Query</li>
                </ul>
            </section>
            <section>
                <p>Instead of describing how to do something, <em>markup languages</em> describe <i>what</i> to do and let's the computer do the rest (declarative)</p>
            </section>
            <section>
                <p>These languages are great for specifying user interface elements and styling</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Markup languages</h3>
                <ul>
                    <li>HTML (HyperText Markup Language)</li>
                    <li>CSS (Cascading Style Sheets)</li>
                </ul>
            </section>
            <${CodeSlide} title="HTML" lang="html" fontSize=".7em">
${`
<table border="1">
    <tr>
        <td>6.38</td>
        <td>Conagra Brands</td>
        <td><b>David's Original</b></td>
        <td>5.25</td>
        <td>OZ</td>
    </tr>
</table>
`}
            <//>
            <${CodeSlide} title="CSS" lang="css" fontSize=".7em">
${`
td {
    font-style: italic;
    text-align: center;
    padding: 0 10px;
}
`}
            <//>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li>Programming</li>
                    <li><em>Markup</em></li>
                    <li>Data</li>
                    <li>Query</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li>Programming</li>
                    <li>Markup</li>
                    <li><em>Data</em></li>
                    <li>Query</li>
                </ul>
            </section>
            <section>
                <p><em>Data languages</em> are useful for describing data in a structured way. They are also tend to be declarative</p>
            </section>
            <section>
                <p>These languages annotate data to provide more semantic meaning</p>
            </section>
            <section>
                <p>
                    <pre>
$6.38
Conagra Brands
David's Original
5.25
OZ
                    </pre>
                </p>
            </section>
            <${CodeSlide} title="XML" lang="xml" fontSize=".7em">
${`
<product>
    <price>6.38</price>
    <supplier>Conagra Brands</supplier>
    <name>David's Original<name>
    <weight>5.25</weight>
    <units>OZ</units>
<product>
`}
            <//>
            <${CodeSlide} title="JSON" lang="json" fontSize=".7em">
${`
{
    "type": "product",
    "price": "$6.38"
    "supplier": "Conagra Brands"
    "name": "David's Original"
    "weight": 5.25
    "units": "OZ"
}
`}
            <//>
            <${CodeSlide} title="YAML" lang="yaml" fontSize=".7em">
${`
- product:
  price: $6.38
  supplier: Conagra Brands
  name: David's Original
  weight: 5.25
  units: OZ
`}
            <//>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li>Programming</li>
                    <li>Markup</li>
                    <li><em>Data</em></li>
                    <li>Query</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Types of languages</h3>
                <ul>
                    <li>Programming</li>
                    <li>Markup</li>
                    <li>Data</li>
                    <li><em>Query</em></li>
                </ul>
            </section>
            <section>
                <p>As with data languages, <em>query languages</em> are useful for working with data and both often work hand-in-hand</p>
            </section>
            <section>
                <p>These languages are almost always used with database applications for retrieving or updating data</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Query languages</h3>
                <ul>
                    <li class="fragment">SQL (Structured Query Language)</li>
                    <li class="fragment">XPath (XML Path Language)</li>
                    <li class="fragment">NoSQL</li>
                </ul>
            </section>
            <${CodeSlide} title="SQL" lang="sql" fontSize=".7em">
${`
SELECT
    price,
    supplier,
    name,
    weight,
    units
FROM Products;
`}
            <//>
            <${CodeSlide} title="SQL" lang="sql" fontSize=".7em">
${`
UPDATE 
    Products
SET 
    price = "$0.99"
WHERE 
    name = "David's Original";
`}
            <//>
        <//>`;
}

export default Lesson21;