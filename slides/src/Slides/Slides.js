import htm from "htm";
import { createElement } from "react";
import TitleSlide from "./Layouts/TitleSlide.js";
import Lesson00 from "./Lessons/Lesson00.js";
import Lesson01 from "./Lessons/Lesson01.js";
import Lesson02 from "./Lessons/Lesson02.js";
import Lesson03 from "./Lessons/Lesson03.js";
import Lesson04 from "./Lessons/Lesson04.js";
import Lesson05 from "./Lessons/Lesson05.js";
import Lesson06 from "./Lessons/Lesson06.js";
import Lesson07 from "./Lessons/Lesson07.js";
import Lesson08 from "./Lessons/Lesson08.js";
import Lesson09 from "./Lessons/Lesson09.js";
import Lesson10 from "./Lessons/Lesson10.js";

const html = htm.bind(createElement);

function Slides() {
  return html`
    <div class="slides">
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide1.png" alt="Slide 1" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide2.png" alt="Slide 2" />
        </section>
        <${Lesson00} />
        <${Lesson01} />
        <${Lesson02} />
        <${Lesson03} />
        <${Lesson04} />
        <${Lesson05} />
        <${Lesson06} />
        <${Lesson07} />
        <${Lesson08} />
        <${Lesson09} />
        <${Lesson10} />
        <${TitleSlide} title="Data Structures: Strings & Arrays" slideId="lesson_11" subtitle="Lesson 11" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide320.png" alt="Slide 320" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide321.png" alt="Slide 321" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide322.png" alt="Slide 322" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide323.png" alt="Slide 323" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide324.png" alt="Slide 324" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide325.png" alt="Slide 325" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide326.png" alt="Slide 326" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide327.png" alt="Slide 327" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide328.png" alt="Slide 328" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide329.png" alt="Slide 329" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide330.png" alt="Slide 330" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide331.png" alt="Slide 331" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide332.png" alt="Slide 332" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide333.png" alt="Slide 333" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide334.png" alt="Slide 334" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide335.png" alt="Slide 335" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide336.png" alt="Slide 336" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide337.png" alt="Slide 337" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide338.png" alt="Slide 338" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide339.png" alt="Slide 339" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide340.png" alt="Slide 340" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide341.png" alt="Slide 341" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide342.png" alt="Slide 342" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide343.png" alt="Slide 343" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide344.png" alt="Slide 344" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide345.png" alt="Slide 345" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide346.png" alt="Slide 346" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide347.png" alt="Slide 347" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide348.png" alt="Slide 348" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide349.png" alt="Slide 349" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide350.png" alt="Slide 350" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide351.png" alt="Slide 351" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide352.png" alt="Slide 352" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide353.png" alt="Slide 353" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide354.png" alt="Slide 354" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide355.png" alt="Slide 355" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide356.png" alt="Slide 356" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide357.png" alt="Slide 357" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide358.png" alt="Slide 358" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide359.png" alt="Slide 359" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide360.png" alt="Slide 360" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide361.png" alt="Slide 361" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide362.png" alt="Slide 362" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide363.png" alt="Slide 363" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide364.png" alt="Slide 364" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide365.png" alt="Slide 365" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide366.png" alt="Slide 366" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide367.png" alt="Slide 367" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide368.png" alt="Slide 368" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide369.png" alt="Slide 369" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide370.png" alt="Slide 370" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide371.png" alt="Slide 371" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide372.png" alt="Slide 372" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide373.png" alt="Slide 373" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide374.png" alt="Slide 374" />
        </section>
        <${TitleSlide} title="Data Structures: Stacks & Queues" slideId="lesson_12" subtitle="Lesson 12" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide376.png" alt="Slide 376" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide377.png" alt="Slide 377" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide378.png" alt="Slide 378" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide379.png" alt="Slide 379" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide380.png" alt="Slide 380" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide381.png" alt="Slide 381" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide382.png" alt="Slide 382" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide383.png" alt="Slide 383" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide384.png" alt="Slide 384" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide385.png" alt="Slide 385" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide386.png" alt="Slide 386" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide387.png" alt="Slide 387" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide388.png" alt="Slide 388" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide389.png" alt="Slide 389" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide390.png" alt="Slide 390" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide391.png" alt="Slide 391" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide392.png" alt="Slide 392" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide393.png" alt="Slide 393" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide394.png" alt="Slide 394" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide395.png" alt="Slide 395" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide396.png" alt="Slide 396" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide397.png" alt="Slide 397" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide398.png" alt="Slide 398" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide399.png" alt="Slide 399" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide400.png" alt="Slide 400" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide401.png" alt="Slide 401" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide402.png" alt="Slide 402" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide403.png" alt="Slide 403" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide404.png" alt="Slide 404" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide405.png" alt="Slide 405" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide406.png" alt="Slide 406" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide407.png" alt="Slide 407" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide408.png" alt="Slide 408" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide409.png" alt="Slide 409" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide410.png" alt="Slide 410" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide411.png" alt="Slide 411" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide412.png" alt="Slide 412" />
        </section>
        <${TitleSlide} title="Data Structures: Maps & Sets" slideId="lesson_13" subtitle="Lesson 13" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide414.png" alt="Slide 414" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide415.png" alt="Slide 415" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide416.png" alt="Slide 416" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide417.png" alt="Slide 417" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide418.png" alt="Slide 418" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide419.png" alt="Slide 419" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide420.png" alt="Slide 420" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide421.png" alt="Slide 421" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide422.png" alt="Slide 422" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide423.png" alt="Slide 423" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide424.png" alt="Slide 424" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide425.png" alt="Slide 425" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide426.png" alt="Slide 426" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide427.png" alt="Slide 427" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide428.png" alt="Slide 428" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide429.png" alt="Slide 429" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide430.png" alt="Slide 430" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide431.png" alt="Slide 431" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide432.png" alt="Slide 432" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide433.png" alt="Slide 433" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide434.png" alt="Slide 434" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide435.png" alt="Slide 435" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide436.png" alt="Slide 436" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide437.png" alt="Slide 437" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide438.png" alt="Slide 438" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide439.png" alt="Slide 439" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide440.png" alt="Slide 440" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide441.png" alt="Slide 441" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide442.png" alt="Slide 442" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide443.png" alt="Slide 443" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide444.png" alt="Slide 444" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide445.png" alt="Slide 445" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide446.png" alt="Slide 446" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide447.png" alt="Slide 447" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide448.png" alt="Slide 448" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide449.png" alt="Slide 449" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide450.png" alt="Slide 450" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide451.png" alt="Slide 451" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide452.png" alt="Slide 452" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide453.png" alt="Slide 453" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide454.png" alt="Slide 454" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide455.png" alt="Slide 455" />
        </section>
        <${TitleSlide} title="Exception Handling" slideId="lesson_14" subtitle="Lesson 14" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide457.png" alt="Slide 457" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide458.png" alt="Slide 458" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide459.png" alt="Slide 459" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide460.png" alt="Slide 460" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide461.png" alt="Slide 461" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide462.png" alt="Slide 462" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide463.png" alt="Slide 463" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide464.png" alt="Slide 464" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide465.png" alt="Slide 465" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide466.png" alt="Slide 466" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide467.png" alt="Slide 467" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide468.png" alt="Slide 468" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide469.png" alt="Slide 469" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide470.png" alt="Slide 470" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide471.png" alt="Slide 471" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide472.png" alt="Slide 472" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide473.png" alt="Slide 473" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide474.png" alt="Slide 474" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide475.png" alt="Slide 475" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide476.png" alt="Slide 476" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide477.png" alt="Slide 477" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide478.png" alt="Slide 478" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide479.png" alt="Slide 479" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide480.png" alt="Slide 480" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide481.png" alt="Slide 481" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide482.png" alt="Slide 482" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide483.png" alt="Slide 483" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide484.png" alt="Slide 484" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide485.png" alt="Slide 485" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide486.png" alt="Slide 486" />
        </section>
        <section>
            <img class="r-stretch" src="images/the-mask.gif" alt="Slide 487" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide488.png" alt="Slide 488" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide489.png" alt="Slide 489" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide490.png" alt="Slide 490" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide491.png" alt="Slide 491" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide492.png" alt="Slide 492" />
        </section>
        <${TitleSlide} title="Test-Driven Development" slideId="lesson_15" subtitle="Lesson 15" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide494.png" alt="Slide 494" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide495.png" alt="Slide 495" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide496.png" alt="Slide 496" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide497.png" alt="Slide 497" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide498.png" alt="Slide 498" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide499.png" alt="Slide 499" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide500.png" alt="Slide 500" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide501.png" alt="Slide 501" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide502.png" alt="Slide 502" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide503.png" alt="Slide 503" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide504.png" alt="Slide 504" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide505.png" alt="Slide 505" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide506.png" alt="Slide 506" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide507.png" alt="Slide 507" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide508.png" alt="Slide 508" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide509.png" alt="Slide 509" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide510.png" alt="Slide 510" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide511.png" alt="Slide 511" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide512.png" alt="Slide 512" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide513.png" alt="Slide 513" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide514.png" alt="Slide 514" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide515.png" alt="Slide 515" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide516.png" alt="Slide 516" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide517.png" alt="Slide 517" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide518.png" alt="Slide 518" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide519.png" alt="Slide 519" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide520.png" alt="Slide 520" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide521.png" alt="Slide 521" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide522.png" alt="Slide 522" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide523.png" alt="Slide 523" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide524.png" alt="Slide 524" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide525.png" alt="Slide 525" />
        </section>
        <${TitleSlide} title="OOP Principles, Part I" slideId="lesson_16" subtitle="Lesson 16" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide527.png" alt="Slide 527" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide528.png" alt="Slide 528" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide529.png" alt="Slide 529" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide530.png" alt="Slide 530" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide531.png" alt="Slide 531" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide532.png" alt="Slide 532" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide533.png" alt="Slide 533" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide534.png" alt="Slide 534" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide535.png" alt="Slide 535" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide536.png" alt="Slide 536" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide537.png" alt="Slide 537" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide538.png" alt="Slide 538" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide539.png" alt="Slide 539" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide540.png" alt="Slide 540" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide541.png" alt="Slide 541" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide542.png" alt="Slide 542" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide543.png" alt="Slide 543" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide544.png" alt="Slide 544" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide545.png" alt="Slide 545" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide546.png" alt="Slide 546" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide547.png" alt="Slide 547" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide548.png" alt="Slide 548" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide549.png" alt="Slide 549" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide550.png" alt="Slide 550" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide551.png" alt="Slide 551" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide552.png" alt="Slide 552" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide553.png" alt="Slide 553" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide554.png" alt="Slide 554" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide555.png" alt="Slide 555" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide556.png" alt="Slide 556" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide557.png" alt="Slide 557" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide558.png" alt="Slide 558" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide559.png" alt="Slide 559" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide560.png" alt="Slide 560" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide561.png" alt="Slide 561" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide562.png" alt="Slide 562" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide563.png" alt="Slide 563" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide564.png" alt="Slide 564" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide565.png" alt="Slide 565" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide566.png" alt="Slide 566" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide567.png" alt="Slide 567" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide568.png" alt="Slide 568" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide569.png" alt="Slide 569" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide570.png" alt="Slide 570" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide571.png" alt="Slide 571" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide572.png" alt="Slide 572" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide573.png" alt="Slide 573" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide574.png" alt="Slide 574" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide575.png" alt="Slide 575" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide576.png" alt="Slide 576" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide577.png" alt="Slide 577" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide578.png" alt="Slide 578" />
        </section>
        <section>
            <img class="r-stretch" src="images/after-these-messages.gif" alt="Slide 579" />
        </section>
        <${TitleSlide} title="OOP Principles, Part II" slideId="lesson_17" subtitle="Lesson 17" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide581.png" alt="Slide 581" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide582.png" alt="Slide 582" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide583.png" alt="Slide 583" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide584.png" alt="Slide 584" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide585.png" alt="Slide 585" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide586.png" alt="Slide 586" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide587.png" alt="Slide 587" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide588.png" alt="Slide 588" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide589.png" alt="Slide 589" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide590.png" alt="Slide 590" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide591.png" alt="Slide 591" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide592.png" alt="Slide 592" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide593.png" alt="Slide 593" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide594.png" alt="Slide 594" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide595.png" alt="Slide 595" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide596.png" alt="Slide 596" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide597.png" alt="Slide 597" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide598.png" alt="Slide 598" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide599.png" alt="Slide 599" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide600.png" alt="Slide 600" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide601.png" alt="Slide 601" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide602.png" alt="Slide 602" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide603.png" alt="Slide 603" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide604.png" alt="Slide 604" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide605.png" alt="Slide 605" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide606.png" alt="Slide 606" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide607.png" alt="Slide 607" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide608.png" alt="Slide 608" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide609.png" alt="Slide 609" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide610.png" alt="Slide 610" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide611.png" alt="Slide 611" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide612.png" alt="Slide 612" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide613.png" alt="Slide 613" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide614.png" alt="Slide 614" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide615.png" alt="Slide 615" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide616.png" alt="Slide 616" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide617.png" alt="Slide 617" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide618.png" alt="Slide 618" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide619.png" alt="Slide 619" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide620.png" alt="Slide 620" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide621.png" alt="Slide 621" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide622.png" alt="Slide 622" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide623.png" alt="Slide 623" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide624.png" alt="Slide 624" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide625.png" alt="Slide 625" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide626.png" alt="Slide 626" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide627.png" alt="Slide 627" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide628.png" alt="Slide 628" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide629.png" alt="Slide 629" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide630.png" alt="Slide 630" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide631.png" alt="Slide 631" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide632.png" alt="Slide 632" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide633.png" alt="Slide 633" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide634.png" alt="Slide 634" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide635.png" alt="Slide 635" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide636.png" alt="Slide 636" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide637.png" alt="Slide 637" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide638.png" alt="Slide 638" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide639.png" alt="Slide 639" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide640.png" alt="Slide 640" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide641.png" alt="Slide 641" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide642.png" alt="Slide 642" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide643.png" alt="Slide 643" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide644.png" alt="Slide 644" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide645.png" alt="Slide 645" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide646.png" alt="Slide 646" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide647.png" alt="Slide 647" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide648.png" alt="Slide 648" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide649.png" alt="Slide 649" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide650.png" alt="Slide 650" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide651.png" alt="Slide 651" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide652.png" alt="Slide 652" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide653.png" alt="Slide 653" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide654.png" alt="Slide 654" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide655.png" alt="Slide 655" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide656.png" alt="Slide 656" />
        </section>
        <${TitleSlide} title="Computer Languages" slideId="lesson_21" subtitle="Lesson 21" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide658.png" alt="Slide 658" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide659.png" alt="Slide 659" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide660.png" alt="Slide 660" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide661.png" alt="Slide 661" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide662.png" alt="Slide 662" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide663.png" alt="Slide 663" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide664.png" alt="Slide 664" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide665.png" alt="Slide 665" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide666.png" alt="Slide 666" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide667.png" alt="Slide 667" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide668.png" alt="Slide 668" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide669.png" alt="Slide 669" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide670.png" alt="Slide 670" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide671.png" alt="Slide 671" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide672.png" alt="Slide 672" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide673.png" alt="Slide 673" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide674.png" alt="Slide 674" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide675.png" alt="Slide 675" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide676.png" alt="Slide 676" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide677.png" alt="Slide 677" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide678.png" alt="Slide 678" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide679.png" alt="Slide 679" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide680.png" alt="Slide 680" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide681.png" alt="Slide 681" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide682.png" alt="Slide 682" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide683.png" alt="Slide 683" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide684.png" alt="Slide 684" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide685.png" alt="Slide 685" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide686.png" alt="Slide 686" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide687.png" alt="Slide 687" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide688.png" alt="Slide 688" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide689.png" alt="Slide 689" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide690.png" alt="Slide 690" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide691.png" alt="Slide 691" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide692.png" alt="Slide 692" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide693.png" alt="Slide 693" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide694.png" alt="Slide 694" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide695.png" alt="Slide 695" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide696.png" alt="Slide 696" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide697.png" alt="Slide 697" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide698.png" alt="Slide 698" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide699.png" alt="Slide 699" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide700.png" alt="Slide 700" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide701.png" alt="Slide 701" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide702.png" alt="Slide 702" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide703.png" alt="Slide 703" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide704.png" alt="Slide 704" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide705.png" alt="Slide 705" />
        </section>
        <${TitleSlide} title="Building Applications" slideId="lesson_22" subtitle="Lesson 22" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide707.png" alt="Slide 707" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide708.png" alt="Slide 708" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide709.png" alt="Slide 709" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide710.png" alt="Slide 710" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide711.png" alt="Slide 711" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide712.png" alt="Slide 712" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide713.png" alt="Slide 713" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide714.png" alt="Slide 714" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide715.png" alt="Slide 715" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide716.png" alt="Slide 716" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide717.png" alt="Slide 717" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide718.png" alt="Slide 718" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide719.png" alt="Slide 719" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide720.png" alt="Slide 720" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide721.png" alt="Slide 721" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide722.png" alt="Slide 722" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide723.png" alt="Slide 723" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide724.png" alt="Slide 724" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide725.png" alt="Slide 725" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide726.png" alt="Slide 726" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide727.png" alt="Slide 727" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide728.png" alt="Slide 728" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide729.png" alt="Slide 729" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide730.png" alt="Slide 730" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide731.png" alt="Slide 731" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide732.png" alt="Slide 732" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide733.png" alt="Slide 733" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide734.png" alt="Slide 734" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide735.png" alt="Slide 735" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide736.png" alt="Slide 736" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide737.png" alt="Slide 737" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide738.png" alt="Slide 738" />
        </section>
        <${TitleSlide} title="Intro to HTML, CSS, and JS" slideId="lesson_23" subtitle="Lesson 23" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide740.png" alt="Slide 740" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide741.png" alt="Slide 741" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide742.png" alt="Slide 742" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide743.png" alt="Slide 743" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide744.png" alt="Slide 744" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide745.png" alt="Slide 745" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide746.png" alt="Slide 746" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide747.png" alt="Slide 747" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide748.png" alt="Slide 748" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide749.png" alt="Slide 749" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide750.png" alt="Slide 750" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide751.png" alt="Slide 751" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide752.png" alt="Slide 752" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide753.png" alt="Slide 753" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide754.png" alt="Slide 754" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide755.png" alt="Slide 755" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide756.png" alt="Slide 756" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide757.png" alt="Slide 757" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide758.png" alt="Slide 758" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide759.png" alt="Slide 759" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide760.png" alt="Slide 760" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide761.png" alt="Slide 761" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide762.png" alt="Slide 762" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide763.png" alt="Slide 763" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide764.png" alt="Slide 764" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide765.png" alt="Slide 765" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide766.png" alt="Slide 766" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide767.png" alt="Slide 767" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide768.png" alt="Slide 768" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide769.png" alt="Slide 769" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide770.png" alt="Slide 770" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide771.png" alt="Slide 771" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide772.png" alt="Slide 772" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide773.png" alt="Slide 773" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide774.png" alt="Slide 774" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide775.png" alt="Slide 775" />
        </section>
        <${TitleSlide} title="JavaScript Deep Dive" slideId="lesson_24" subtitle="Lesson 24" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide777.png" alt="Slide 777" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide778.png" alt="Slide 778" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide779.png" alt="Slide 779" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide780.png" alt="Slide 780" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide781.png" alt="Slide 781" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide782.png" alt="Slide 782" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide783.png" alt="Slide 783" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide784.png" alt="Slide 784" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide785.png" alt="Slide 785" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide786.png" alt="Slide 786" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide787.png" alt="Slide 787" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide788.png" alt="Slide 788" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide789.png" alt="Slide 789" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide790.png" alt="Slide 790" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide791.png" alt="Slide 791" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide792.png" alt="Slide 792" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide793.png" alt="Slide 793" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide794.png" alt="Slide 794" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide795.png" alt="Slide 795" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide796.png" alt="Slide 796" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide797.png" alt="Slide 797" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide798.png" alt="Slide 798" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide799.png" alt="Slide 799" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide800.png" alt="Slide 800" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide801.png" alt="Slide 801" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide802.png" alt="Slide 802" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide803.png" alt="Slide 803" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide804.png" alt="Slide 804" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide805.png" alt="Slide 805" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide806.png" alt="Slide 806" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide807.png" alt="Slide 807" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide808.png" alt="Slide 808" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide809.png" alt="Slide 809" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide810.png" alt="Slide 810" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide811.png" alt="Slide 811" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide812.png" alt="Slide 812" />
        </section>
        <${TitleSlide} title="Intro to React" slideId="lesson_25" subtitle="Lesson 25" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide814.png" alt="Slide 814" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide815.png" alt="Slide 815" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide816.png" alt="Slide 816" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide817.png" alt="Slide 817" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide818.png" alt="Slide 818" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide819.png" alt="Slide 819" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide820.png" alt="Slide 820" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide821.png" alt="Slide 821" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide822.png" alt="Slide 822" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide823.png" alt="Slide 823" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide824.png" alt="Slide 824" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide825.png" alt="Slide 825" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide826.png" alt="Slide 826" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide827.png" alt="Slide 827" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide828.png" alt="Slide 828" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide829.png" alt="Slide 829" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide830.png" alt="Slide 830" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide831.png" alt="Slide 831" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide832.png" alt="Slide 832" />
        </section>
        <${TitleSlide} title="Web APIs using REST" slideId="lesson_26" subtitle="Lesson 26" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide834.png" alt="Slide 834" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide835.png" alt="Slide 835" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide836.png" alt="Slide 836" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide837.png" alt="Slide 837" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide838.png" alt="Slide 838" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide839.png" alt="Slide 839" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide840.png" alt="Slide 840" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide841.png" alt="Slide 841" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide842.png" alt="Slide 842" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide843.png" alt="Slide 843" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide844.png" alt="Slide 844" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide845.png" alt="Slide 845" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide846.png" alt="Slide 846" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide847.png" alt="Slide 847" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide848.png" alt="Slide 848" />
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
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide862.png" alt="Slide 862" />
        </section>
        <${TitleSlide} title="Integrating with Backend APIs" slideId="lesson_27" subtitle="Lesson 27" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide864.png" alt="Slide 864" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide865.png" alt="Slide 865" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide866.png" alt="Slide 866" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide867.png" alt="Slide 867" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide868.png" alt="Slide 868" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide869.png" alt="Slide 869" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide870.png" alt="Slide 870" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide871.png" alt="Slide 871" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide872.png" alt="Slide 872" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide873.png" alt="Slide 873" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide874.png" alt="Slide 874" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide875.png" alt="Slide 875" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide876.png" alt="Slide 876" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide877.png" alt="Slide 877" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide878.png" alt="Slide 878" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide879.png" alt="Slide 879" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide880.png" alt="Slide 880" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide881.png" alt="Slide 881" />
        </section>
        <${TitleSlide} title="Intro to Databases" slideId="lesson_28" subtitle="Lesson 28" />
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide883.png" alt="Slide 883" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide884.png" alt="Slide 884" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide885.png" alt="Slide 885" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide886.png" alt="Slide 886" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide887.png" alt="Slide 887" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide888.png" alt="Slide 888" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide889.png" alt="Slide 889" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide890.png" alt="Slide 890" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide891.png" alt="Slide 891" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide892.png" alt="Slide 892" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide893.png" alt="Slide 893" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide894.png" alt="Slide 894" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide895.png" alt="Slide 895" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide896.png" alt="Slide 896" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide897.png" alt="Slide 897" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide898.png" alt="Slide 898" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide899.png" alt="Slide 899" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide900.png" alt="Slide 900" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide901.png" alt="Slide 901" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide902.png" alt="Slide 902" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide903.png" alt="Slide 903" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide904.png" alt="Slide 904" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide905.png" alt="Slide 905" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide906.png" alt="Slide 906" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide907.png" alt="Slide 907" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide908.png" alt="Slide 908" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide909.png" alt="Slide 909" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide910.png" alt="Slide 910" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide911.png" alt="Slide 911" />
        </section>
        <section>
            <img class="r-stretch" src="images/24q4-slides/Slide912.png" alt="Slide 912" />
        </section>
    </div>`;
}

export default Slides;
