const express = require("express");
const morgan = require("morgan");
const bodyParser = require("body-parser");

const app = express(); 

app.use(morgan("dev")); 
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static("public")); 

const PORT = process.env.PORT || 3000; 

app.get("/", (req, res) => {
  res.sendFile(__dirname + "/public/index.html"); 
});

app.post("/contact", (req, res) => {
  const { "first-name": firstName, "last-name": lastName, email, message } = req.body;
  
  console.log("Form submitted:", { firstName, lastName, email, message });

  res.send(`
    <h1>Form Submitted Successfully!</h1>
    <p><strong>Full Name:</strong> ${firstName} ${lastName}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>Message:</strong> ${message}</p>
  `);
});

app.listen(PORT, () => {
  console.log(`Server listening on http://localhost:${PORT}`);
});

