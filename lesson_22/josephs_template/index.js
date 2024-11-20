const morgan = require("morgan"); // Get morgan
const path = require("path"); // Get path
var debug = require('debug')('myapp:server'); // Get debug logger
const bodyParser = require('body-parser');
const express = require("express") // Get express

const PORT = process.env.PORT || 5500; // Setup port
const app = express() // Create express app

app.use(morgan("dev")); // Setup morgan middleware
app.use(express.static(path.join(__dirname, "public"))); // Setup static files
app.use(bodyParser.urlencoded({ extended: true}));


// app.listen('/pageWStuff.html', (req, res) =>{
//     console.log("gi");
//     req.send(`<div>this is more text</div>`);
// });
app.post('/signUp.html', (req, res) =>{
    res.status(200).send(`
        <title>Sign Up Page</title>
        <div>
            <div id="grid">
                <div id="holder">
                <form action="/signUp2.html" method="POST">
                    <input name="nameInput" id="myInput" type="text" placeholder="Enter Full Name" required>
                    <input name="emailInput" type="email" placeholder="Email Address">
                        <button>
                            Submit Form
                        </button>
                        </form>
                        <form action="index.html" method="GET">
                        <button>
                            Back to main page
                        </button>
                </form>
                </div>
            </div>
        </div>

        <style>
            body {
                background-color: #880808;
            }
            form{
                display: flex;
                flex-direction: column;
                justify-content: center;
                align-items: center;
            }

            #grid{
                display: grid;
                grid-template-columns: 33.3% 33.3% 33.3%;
                grid-template-rows: 50% 50% 50%;
            }

            #holder{
                grid-column-start: 2;
                grid-row-start: 2;
            }
                
            input{
                text-align: center;
                padding: 1em 1.5em;
                border-radius: 9em;
                background: linear-gradient(to left, #333, #333 50%, #eee 100%, #333 85%);
                font: 700 1.5em / 1.25 ubuntu, sans-serif;
                text-transform: uppercase;
                margin: 10px;
            }
            button:hover{
                cursor: pointer;
            }

            button{
                text-align: center;
                padding: 1em 1.5em;
                border-radius: 9em;
                background: linear-gradient(to left, #333, #333 50%, #eee 100%, #333 85%);
                font: 700 1.5em / 1.25 ubuntu, sans-serif;
                text-transform: uppercase;
            }
        </style>
        `);
});
app.post('/signUp2.html', (req, res) => {
    const nameInput = req.body.nameInput;
    console.log(nameInput);
    const emailValue = req.body.emailInput;
    res.status(200).send(`
        <title>Retrieval Page</title>
        <div style="display: flex; justify-content: center; ">
            <form action="signUp.html" method="POST">
                <br>
                <button>
                    Return back to page
                </button>
            </form>
        </div>
        <div style="display: flex; flex-direction: column; padding:0px" >
            <h1>You have submitted good job <br/>
            The information you put in: <br/> ${nameInput}<br/> ${emailValue}</h1>
        </div>
        <style>
            h1{
                text-align: center;
                background-color: gray;
            }
            body{
                background-color: #880808;
            }

            button{
                display: grid;
                grid-auto-flow: column;
                grid-gap: .5em;
                padding: 1em 1.5em;
                border-radius: 9em;
                background: linear-gradient(to left, #333, #333 50%, #eee 100%, #333 85%);
                font: 700 1.5em / 1.25 ubuntu, sans-serif;
                text-transform: uppercase;
            }
                
            button:hover{
                cursor: pointer;
            }
        </style>
        `);
})
// Start the server

app.listen(PORT, () => {
    console.log(PORT);
 debug(`Server listening on http://localhost:${PORT}`);
});
