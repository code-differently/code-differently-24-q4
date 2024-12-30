import htm from "htm";
import { createElement } from "react";
import { CodeSlide, Lesson, QuestionsSlide } from "../Layouts/index.js";

const html = htm.bind(createElement);

function Lesson10() {
    return html`
        <${Lesson} title="Libraries" lessonId="lesson_10" subtitle="Lesson 10">
            <section>
                <p>Developers <i>almost never</i> write every single line of code needed to build an application.</p>
            </section>
            <section>
                <p>We <i>liberally</i> borrow and use <em>pre-existing</em> tools and frameworks to build more complex systems</p>
            </section>
            <section>
                <p>This is why we rely on <em>libraries</em>.</p>
            </section>
            <section>
                <p>A library contains <em>data types</em> and <em>functions</em> for a programming language that let us leverage code that already solves our problems.</p>
            </section>
            <section>
                <p>Node itself provides a standard library that we can use for the most common stuff.</p>
            </section>
            <section>
                <p>Node applications organizes <i>all code</i>, including its library of data types, into <em>modules</em>.</p>
            </section>
            <section>
                <p>Here are some common modules used in Node</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Core Node library modules</h3>
                <ul>
                    <li class="fragment"><em><i>http</i></em> - Stuff for starting web servers.</li>
                    <li class="fragment"><em><i>util</i></em> - A bunch of useful functions for general programming</li>
                    <li class="fragment"><em><i>fs</i></em> - Functions for interacting with data outside of our application (files, directories, etc).</li>
                </ul>
            </section>
            <section>
                <p>Java has the same concept as modules, but they're called <em>packages</em>.</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>Core Java library packages</h3>
                <ul style=${{"font-size": ".9em"}}>
                    <li class="fragment"><em><i>java.util</i></em> - A bunch of data types and collections.</li>
                    <li class="fragment"><em><i>java.math</i></em> - Data types and functions for doing mathematics</li>
                    <li class="fragment"><em><i>java.io</i></em> - Stuff for interacting with data outside of our application (user input and output, files, etc).</li>
                </ul>
            </section>
            <section class="ml-bullet-slide">
                <h3>Core Java library packages</h3>
                <ul>
                    <li class="fragment"><em><i>java.time</i></em> - Stuff for dealing with dates and times.</li>
                    <li class="fragment"><em><i>java.security</i></em> - Stuff that helps keeps us safe from h4ck3rz.</li>
                </ul>
            </section>
            <section>
                <p>To use something from a package in Java, you have to use an <em><i>import</i></em> statement.</p>
            </section>
            <${CodeSlide} lang="java" badge="Java" fontSize=".37em" lineNumbers="1|3-4|6|8,10,15">
package com.codedifferently; // Declare our package

import java.time.Instant;    // Import some stuff we want to use
import java.util.Date;

public class Person {        // This class is PUBLIC outside our package
   private String name;
   private Date birthDate;   // Use the imported Date class

   public Person(String name, Date birthDate) {
       this.name = name;
       if (birthDate != null) {
           this.birthDate = birthDate;
       } else {
           this.birthDate = Date.from(Instant.now());
       }
   }
}
            <//>
            <section>
                <p><span style=${{"color": "red"}}>IMPORTANT!</span><br />We only have to import stuff that's <i>NOT</i> in our package.</p>
            </section>
            <section>
                <p>Here's a similar example in TypeScript…</p>
            </section>
            <${CodeSlide} lang="typescript" badge="TypeScript" fontSize=".37em" lineNumbers="1|6-7,12">
export class Person { // Public outside of the file module.

   private name: string;
   private birthDate: Date;

   // Date is globally available and doesn't need importing.
   constructor(name: string, birthDate: Date) {
       this.name = name;
       if (birthDate != null) {
           this.birthDate = birthDate;
       } else {
           this.birthDate = new Date();
       }
   }
}
            <//>
            <section>
                <p>We can also <em>import</em> stuff built by other developers. For that, we use special tools that let us add <em>dependencies</em> to their packages or modules.</p>
            </section>
            <section>
                <p>For this class, we use <em>NPM</em> in TypeScript and <em>Gradle</em> in Java for managing external dependencies...</p>
            </section>
            <${CodeSlide} lang="json" fontSize=".37em">
// package.json

{
 ...
 "devDependencies": {
   "ts-node-dev": "^2.0.0",
   "typescript": "^5.3.3",
   "nodemon": "^3.0.3"
 },
 "dependencies": {
   "react": "^18.2.0",
 }
}

            <//>
            <${CodeSlide} lang="kotlin" fontSize=".37em">
// build.gradle.kts file, this is NOT Java. 👌🏾

dependencies {
   // Use JUnit Jupiter for writing unit test code.
   testImplementation("org.junit.jupiter:junit-jupiter:5.9.1")

   // Include some packages from Google's Guava library.
   implementation("com.google.guava:guava:31.1-jre")
}
            <//>
            <section>
                <p>Here are a few super important Java libraries you should know…</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>A few popular Java libraries</h3>
                <ul style=${{"font-size": ".9em"}}>
                    <li class="fragment"><em><i>JUnit</i></em> - A library for creating unit tests</li>
                    <li class="fragment"><em><i>Spring</i></em> - A framework for building professional, complex Java applications</li>
                    <li class="fragment"><em><i>Lombok</i></em> - A great library that automatically generates code for you.</li>
                </ul>
            </section>
            <section>
                <p>And, of course, here are some for TypeScript/JS</p>
            </section>
            <section class="ml-bullet-slide">
                <h3>A few popular JS/TS libraries</h3>
                <ul style=${{"font-size": ".9em"}}>
                    <li class="fragment"><em><i>Jest</i></em> - A library for creating unit tests</li>
                    <li class="fragment"><em><i>NextJS</i></em> - A framework for building professional, complex web applications</li>
                    <li class="fragment"><em><i>React</i></em> - A library for building web components (think custom HTML tags).</li>
                </ul>
            </section>
            <${QuestionsSlide}/>
        <//>`;
}

export default Lesson10;