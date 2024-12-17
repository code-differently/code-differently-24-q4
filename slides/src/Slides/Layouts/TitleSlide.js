import htm from "htm";
import { createElement } from "react";

const html = htm.bind(createElement);

function TitleSlide({title, slideId, subtitle, titleFontSize}) {
  return html`
    <section id="${slideId}" class="ml-title-slide">
        <h1 style=${{"font-size": titleFontSize}}>${title}</h1>
        <h2>${subtitle}</h2>
        <div class="about">
            <img class="avatar" src="images/instructor.jpg" alt="Instructor" />
            <div class="info">
                <p style=${{"font-size": ".6em", "font-style": "normal"}}>Anthony D. Mays</p>
                <p>Founder & Career Coach | <em>Morgan Latimer Consulting</em></p>
                <p>Ex-Google Software Engineer</p>
            </div>
        </div>
        <div class="socials">
            <img class="logo" src="images/twitter-logo.png" alt="Twitter logo" />
            <img class="logo" src="images/linkedin-logo.png" alt="Twitter logo" />
            <img class="logo facebook-logo" src="images/facebook-logo.png" alt="Twitter logo" style=${{width: "43px", height: "67px"}} />
            <p>anthonydmays<em>[.com]</em></p>
        </div>
    </section>`;
}

export default TitleSlide;