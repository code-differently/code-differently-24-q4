
import htm from "htm";
import { createElement, useEffect, useRef } from "react";
import Reveal from "../dist/reveal.esm.js";
import RevealHighlight from "../plugin/highlight/highlight.esm.js";
import RevealMarkdown from "../plugin/markdown/markdown.esm.js";
import RevealNotes from "../plugin/notes/notes.esm.js";
import RevealSearch from "../plugin/search/search.esm.js";
import RevealZoom from "../plugin/zoom/zoom.esm.js";
import { Slides } from "./Slides/index.js";

const html = htm.bind(createElement);

function App() {
    const deckDivRef = useRef(null); // reference to deck container div
    const deckRef = useRef(null); // reference to deck reveal instance

    const RevealTag = () => createElement('div', {ref: deckDivRef, className: 'reveal'},
        createElement(Slides)
    );

    useEffect(() => {
        // Prevents double initialization in strict mode
        if (deckRef.current) return;

        deckRef.current = new Reveal(deckDivRef.current, {
            width: 960,
            height: 540,
            transition: 'none',
            slideNumber: 'c',
            // other config options
            plugins: [
                RevealMarkdown,
                RevealHighlight,
                RevealNotes,
                RevealSearch,
                RevealZoom
            ]
        });

        deckRef.current.initialize();

        return () => {
            try {
                if (deckRef.current) {
                    deckRef.current.destroy();
                    deckRef.current = null;
                }
            } catch (e) {
                console.warn("Reveal.js destroy call failed.");
            }
        };
    }, []);


  return html`<${RevealTag}/>`;
}

export default App;
