const morgan = require("morgan")
const path = require("path");
var debug = require('debug')('myapp:server');
const bodyParser = require('body-parser');
const express = require("express") 

const PORT = process.env.PORT || 5500; 
const app = express() 
app.set("view engine", "ejs");

app.use(morgan("dev")); 
app.use(express.static(path.join(__dirname, "public")));
app.use(bodyParser.urlencoded({ extended: true}));

app.post('/signUp', (req, res) =>{
    res.status(200);
    res.render('signUp');
});

app.post('/retrieval', (req, res) => {
    const nameInput = req.body.nameInput;
    const emailValue = req.body.emailInput;
    console.log("hi")
    res.render('retievalPage', {emailValue, nameInput});
})

app.listen(PORT, () => {
    console.log(PORT);
 debug(`Server listening on http://localhost:${PORT}`);
});
