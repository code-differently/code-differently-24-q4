const express = require("express");
const path = require("path");
const app = express();
const port = 4000;
const cors = require("cors"); 

app.use(express.urlencoded({extended: true}));
app.use(express.json());
app.use(express.static(path.join(__dirname, 'public')));
app.use(cors());

app.get("/", async (req, res) => {
    res.send("This is working")
});



app.listen(port, () => {
    console.log('Listening at http://localhost:${port}');
})

app.post('/contact', express.urlencoded({ extended: true}), (req, res) => {
    const userInput = req.body; 
    res.json({ message: 'Form submitted successfully!', data:
        userInput });
});

app.post('/results.html', (req, res) => {
    res.status(200).send('<div> One moment please...</div>');
});