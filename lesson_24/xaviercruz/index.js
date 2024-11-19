const express = require('express');
const morgan = require('morgan');
const bodyParser = require('body-parser');

const app = express();

app.use(morgan('dev'));

app.use(express.static('public'))

app.use(bodyParser.urlencoded({ extended: true }));

const PORT = process.env.PORT || 3000;


app.post('/pages/contact', (req, res) => {
  res.send(`First Name: ${req.body.fname}, Last Name: ${req.body.lname}, Feedback: ${req.body.feedback}`)
})

app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}`);
});