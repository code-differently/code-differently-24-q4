const express = require('express');
const morgan = require('morgan');
const path = require('path');
const bodyParser = require('body-parser');

const app = express();

app.use(morgan('dev'));
app.use(express.static(path.join(__dirname, 'public')));
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

const PORT = process.env.PORT || 3000;

app.post('/contact', async (req, res) => {
    const { name, email, feedback } = req.body;
    res.send(`
        <h1>Form Submitted</h1>
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Feedback:</strong> ${feedback}</p>
        <a href="/contact">Go back to the form</a>
    `);
});

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});