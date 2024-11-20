const express = require("express"); // Get express
const morgan = require("morgan"); // Get morgan
const bodyParser = require('body-parser');

const app = express(); // Create express app

app.use(morgan("dev")); // Setup morgan middleware
app.use(bodyParser.urlencoded({extended:true}))
app.use(express.static('public')); // Setup static files

const PORT = process.env.PORT || 3000; // Setup port

// Start the server
app.listen(PORT, () => {
 debug(`Server listening on http://localhost:${PORT}`);
});

app.post("/contact", (req, res) => {
    res.send(`
        <h1>Form Submitted Successfully!</h1>
        <p><strong>Full Name:</strong> ${req.body.firstname} ${req.body.lastname}</p>
        <p><strong>Email:</strong> ${req.body.email}</p>
        <p><strong>Message:</strong> ${req.body.message}</p>
    `);
});