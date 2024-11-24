const express = require('express');
const morgan = require('morgan');
const bodyParser = require('body-parser');

const app = express();

app.use(morgan('dev'));

app.use(express.static('public'));

app.use(bodyParser.urlencoded({extended: true}));


const PORT = process.env.PORT || 3000;

app.post('/contact', (req, res) => {
    res.send(`First Name: ${req.body.fname}, Last Name: ${req.body.lname}, Email: ${req.body.email}, Message: ${req.body.message}`);
});

app.listen(PORT, () => {
    console.log(`Sever running on port ${PORT}`);
});
