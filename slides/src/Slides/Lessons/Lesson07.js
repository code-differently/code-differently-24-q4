import htm from "htm";
import { createElement } from "react";
import { Lesson, QuestionsSlide } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson07() {
    return html`
        <${Lesson} title="Control Flow" lessonId="lesson_07" subtitle="Lesson 7">
            <section>
                <p>Sometimes, we only want statements to run under <em>certain conditions</em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Conditional code</h3>
                <ul>
                    <li class="fragment"><em><i>Only if something is true</i></em> (show a banner if the player won the game)</li>
                    <li class="fragment"><em><i>Only a certain number of times</i></em> (allow three wishes)</li>
                    <li class="fragment"><em><i>Only while true</i></em> (while the user has money, then take a dollar)</li>
                </ul>
            </section>
            <section>
                <p>But first, we need a special type of expression called a <em><i>boolean expression</i></em></p>
            </section>
            <section>
                <p><i>Boolean expressions</i> test whether something is <em>true</em> or <em>false</em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3><i>Boolean Expressions</i></h3>
                <pre>
                    <code data-trim data-noescape>
true // This is a TRUE expression
false // This is a FALSE expression
                    </code>
                </pre>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide169.png" alt="Slide 169" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide170.png" alt="Slide 170" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide171.png" alt="Slide 171" />
            </section>
            <section>
                <p>How do you say this?</p>
                <pre><code style=${{"text-align": "center", "font-size": "1.5em"}}>!(val ${'>'} 0 && val ${'<'} 10)</code></pre>
            </section>
            <section>
                <p>Is it NOT true that <em>val</em> is greater than 0 AND that <em>val</em> is less than 10?</p>
                <pre><code style=${{"text-align": "center", "font-size": "1.5em"}}>!(val ${'>'} 0 && val ${'<'} 10)</code></pre>
            </section>
            <section>
                <p>Can we simplify?</p>
                <pre><code style=${{"text-align": "center", "font-size": "1.5em"}}>!(val ${'>'} 0 && val ${'<'} 10)</code></pre>
            </section>
            <section>
                <p>Yup. Flip the <em>operators</em></p>
            </section>
            <section>
                <pre><code style=${{"text-align": "center", "font-size": "1.5em"}}>!(val ${'>'} 0 && val ${'<'} 10)</code></pre>
                <p>is equivalent to</p>
                <pre><code style=${{"text-align": "center", "font-size": "1.5em"}}>!(val ${'<='} 0 || val ${'>='} 10)</code></pre>
            </section>
            <section>
                <p>Now let's talk about <em>control flow</em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>if..else</em> statement</h3>
                <p>Used when we want to run code only when a condition is true.</p>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide179.png" alt="Slide 179" />
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>if..else</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
if (student.getSchoolName() === "Code Differently") {
     console.log("You winnin!");
     student.setEmployed(true);
     student.setSalary(100000);
} else {
     console.log("Too bad!");
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>if..else</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
if (pivotValue === target) {
     return pivotIndex;
} else if (pivotValue ${'<'} target) {
     return binarySearch(arr, pivot + 1, arr.length - 1, target);
} else {
     // How does pivotValue relate to target here???
     return binarySearch(arr, 0, pivot - 1, target);
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>if..else</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
if (pivotValue === target) {
     return pivotIndex;
} else if (pivotValue ${'<'} target) {
     return binarySearch(arr, pivot + 1, arr.length - 1, target);
} else {
     // pivotValue is GREATER THAN target
     return binarySearch(arr, 0, pivot - 1, target);
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>for</em> statement</h3>
                <ul>
                    <li>Used to run code a certain number of times</li>
                    <li>Usually used when going through (iterating) a collection of elements</li>

                </ul>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide184.png" alt="Slide 184" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide185.png" alt="Slide 185" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide186.png" alt="Slide 186" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide187.png" alt="Slide 187" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide188.png" alt="Slide 188" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide189.png" alt="Slide 189" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide190.png" alt="Slide 190" />
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide191.png" alt="Slide 191" />
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>if..else</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
for (let i = 0; i ${'<'} 10; i++) {
     console.log("Hello for index " + i);
}
console.log("Done!");

// Hello for index 0
// Hello for index 1
// ...
// Hello for index 9
// Done!
                    </code>
                </pre>
            </section>
            <section>
                <p>We really like using for loops with <em>arrays</em></p>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>for</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
const evenNumbers = [2, 4, 6, 8, 10];
for (let i = 0; i ${'<'} evenNumbers.length; i++) {
  console.log(evenNumbers[i]);
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>for</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
for (;;) {
     // Will run until the computer gets tired
     me.love(myNeighbor);
}
                    </code>
                </pre>
            </section>
            <section>
                <img class="r-stretch" src="images/24q4-slides/Slide196.png" alt="Slide 196" />
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>while</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
while (account.hasFunds()) {
     account.withdraw(1, Currency.USD);
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>while</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
while (true) {
     // Will run until the computer gets tired
     me.love(myNeighbor);
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>while</em> statement</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
while (false) {
     // Will never run
     me.punch(randomStranger);
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>break</em> keyword</h3>
                <ul>
                    <li>Use it when you need a break <span class="fragment">(that means the loop needs to stop early)</span></li>
                    <li class="fragment">When it comes to loops, it's your safe word</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>break</em> keyword</h3>
                <pre>
                    <code data-trim data-noescape class="language-typescript">
while (true) {
     // Will run until the computer gets tired...
     me.studyAt(university);

     // ...just kidding, get me out of here
     break;
}
                    </code>
                </pre>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>continue</em> keyword</h3>
                <ul>
                    <li>Use it when you need to skip doing work for certain conditions</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>The <em>continue</em> keyword</h3>
                <pre style=${{"font-size": "0.5em"}}>
                    <code data-trim data-noescape class="language-typescript">
for (let i = 0; i ${'<'} 10; i++) {
   if (i % 2 === 0) {
      continue; // will jump to the incrementation step for even values
   }
   console.log("Hello for index " + i);
}
console.log("Done!");

// Hello for index 1
// Hello for index 3
// Hello for index 5
// Hello for index 7
// Hello for index 9
// Done!
                    </code>
                </pre>
            </section>
            <${QuestionsSlide} />
        <//>`;
}

export default Lesson07;