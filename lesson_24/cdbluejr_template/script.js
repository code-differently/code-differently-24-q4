const express = require("express")
const bodyParser = require('body-parser');
const app = express()
const port = 5500
const cors = require("cors")

app.use(bodyParser.urlencoded({extended:true}))
app.use(express.json())
app.use(cors())

app.get("/", async(req, res) => {
    res.send("this is working")
})

app.post('http://127.0.0.1:5502/submit', (req, res) => {
  console.log(req.body);  // This will show the data sent in the form
  const { firstName, middleInitial, lastName, suffix, email, information } = req.body;

  // Render the same form, but also display the submitted information
  res.send(`
    <h2>Information Submitted Successfully!</h2>
    <p><strong>Complete Name:</strong> ${firstName} ${middleInitial || ''} ${lastName} ${suffix || ''}</p>
    <p><strong>Email:</strong> ${email}</p>
    <p><strong>Additional Information:</strong> ${information || 'No additional information provided.'}</p>
    <br>
    <a href="/">Go Back</a>
  `);
});

app.listen(5500, () => {
    console.log(`Server is running on port ${port}`);
    console.log('Did this really work?')
})