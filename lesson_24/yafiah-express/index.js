const express = require("express");
const cors = require("cors");
const path = require("path");

const app = express();
const port = 4000;

// Middleware
app.use(cors());
app.use(express.urlencoded({ extended: true }));
app.use(express.json());

// Serve static files from the "yafiahabdullah" folder
app.use(express.static(path.join(__dirname, "yafiahabdullah")));

// Serve the index.html on the root route
app.get("/", (req, res) => {
    res.sendFile(path.join(__dirname, "yafiahabdullah", "index.html"));
});

// Handle form submission on POST /submit
app.post("/submit", (req, res) => {
    const formData = req.body;
    console.log("Form Data Received:", formData);
    res.send("Form submitted successfully!");
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running at http://localhost:${port}`);
});


