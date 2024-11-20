const express = require("express");
const app = express();
const port = 3002;
const cors = require("cors");

app.use(express.urlencoded({extended: true}));
app.use(express.json());
app.use(cors());

app.post("/submit", cors(), async (req, res) => {
    const {name, email, message} = req.body;
    res.send(`Contact information received: Name - ${name},   Email - ${email},   Message - ${message}`);
});

app.listen(port, () => {
    console.log(`Listening at http://localhost:${port}`)
});