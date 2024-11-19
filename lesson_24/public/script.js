const express = require("express"); // Get express
const morgan = require("morgan"); // Get morgan
const path = require("path"); // Get path
var debug = require('debug')('myapp:server'); // Get debug logger

const app = express(); // Create express app

app.use(morgan("dev")); // Setup morgan middleware
app.use(express.urlencoded({ extended: true }));
app.use(express.static(path.join(__dirname, "public"))); // Setup static files

app.get("/", (req, res) => {
    res.send(`
        <form action="/submit" method="POST">
            <label for="first-name">Full Name</label>
            <div class="input-group">
                <input type="text" id="first-name" name="first-name" placeholder="First Name" required>
                <input type="text" id="last-name" name="last-name" placeholder="Last Name" required>
            </div>

            <label for="email">Email</label>
            <input type="email" id="email" name="email" placeholder="Enter your email" required>

            <label for="message">Message</label>
            <textarea id="message" name="message" rows="4" placeholder="Your message here..." required></textarea>

            <button type="submit">Send</button>
        </form>
        `);
});

app.post("/submit", (req, res) => {
    const { 'first-name': firstName, 'last-name': lastName, email, message } = req.body;
    console.log('Form Data:', firstName, lastName, email, message);

    res.send(`
        <h1>Form Submitted Successfully!</h1>
        <p><strong>Full Name:</strong> ${firstName} ${lastName}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Message:</strong> ${message}</p>
    `);
});

const PORT = process.env.PORT || 3000; // Setup port

// Start the server
app.listen(PORT, () => {
 debug(`Server listening on http://localhost:${PORT}`);
});
