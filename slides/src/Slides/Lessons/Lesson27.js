import htm from "htm";
import { createElement } from "react";
import { CodeSlide, DemoSlide, Lesson, QuestionsSlide } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson27() {
    return html`
        <${Lesson} title="Integrating with Backend APIs" lessonId="lesson_27" subtitle="Lesson 27" titleFontSize="1.2em">
            <section>
                <p>Now that we know how to build a simple API, let’s connect the <em>frontend</em> to the <em>backend</em></p>
            </section>
            <section>
                <p>To do this, we’re going to need to use the <em>fetch</em> API</p>
            </section>
            <section>
                <p>The <em>fetch</em> API is the way we use JavaScript to make requests for resources over HTTP and receive responses</p>
            </section>
            <section>
                <p>But before we talk about <em>fetch</em>, we need to talk about <em>promises</em></p>
            </section>
            <section>
                <p>When we make we requests, we don’t actually know when we’re going to get a response (if we get one at all)</p>
            </section>
            <section>
                <p>This is what we call <em>asynchronous</em> communication (aka async).</p>
            </section>
            <section>
                <p>A <em>Promise</em> is an object that takes a callback function and calls it when the promise is <i>resolved</i></p>
            </section>
            <${CodeSlide} lang="typescript" lineNumbers="true" fontSize=".42em">
${`
function executeAsyncTask() {
   // Create a promise.
   const doWork = new Promise((resolve, reject) => {
       setTimeout(() => {
           resolve('done'); // Call \`resolve\` when done.
                            // (or \`reject\` if there's an error)
       }, 1000);
   });

   // Provide a callback function to print the result 
   // when the promise resolves.
   doWork.then((result) => {
       console.log(result); // Prints "done"
   });
}
`}
            <//>
            <${CodeSlide} lang="typescript" lineNumbers="true" fontSize=".42em">
${`
// This function now returns a promise.
async function executeAsyncTask() {
   // Create a promise.
   const doWork = new Promise((resolve, reject) => {
       setTimeout(() => {
           resolve('done');
       }, 1000);
   });

   // Provide a callback function to print the result 
   // when the promise resolves.
  const result = await doWork;
  console.log(result); // Prints 'done'.
}
`}
            <//>
            <section>
                <p>Ok, so why did we have to learn this?</p>
            </section>
            <section>
                <p>Because <em>fetch</em> uses <i>promises</i>!</p>
            </section>
            <${CodeSlide} lang="typescript" lineNumbers="true" fontSize=".35em">
${`
function getDataFromAPI(url) {
   const response$ = fetch(url); // Sends an HTTP GET request by default.
   return response$
       .then(response => {
           if (response.ok) {
               // Turn the response into JSON.
               return response.json();
           } else {
               return Promise.reject(new Error('Failed to load data'));
           }
       })
       .then(data => {
           // Return the data as the final result.
           return data;
       })
       .catch(error => {
           // Handle any errors.
           console.error("Couldn't load data", error);
       });
}
`}
            <//>
            <section>
                <p>Or, hear me out…use <em>async/await</em></p>
            </section>
            <${CodeSlide} lang="typescript" lineNumbers="true" fontSize=".35em">
${`
async function getDataFromAPI(url) {
 try {
   const response = await fetch(url); // Sends HTTP GET request by default.
   if (response.ok) {
     // Turn the response into JSON.
     const data = await response.json();
      return data;
   } else {
     throw new Error('Failed to load data', response.status);
   }
 } catch (error) {
   console.error("Couldn't load data", error);
 }
}
`}
            <//>
            <section>
                <p>Need to do a POST request? No problem!</p>
            </section>
            <${CodeSlide} lang="typescript" fontSize=".53em">
${`
const response = await fetch(url, { method: 'POST' });
`}
            <//>
            <${DemoSlide} />
            <${QuestionsSlide} />
        <//>`;
}

export default Lesson27;