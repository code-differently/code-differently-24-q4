const express = require ('express');
const morgan = require ('morgan');
const path = require('path');
const app = express();

app.use(morgan('dev'));
app.use(express.static(path.join(__dirname,'public')));

const PORT = process.env.PORT || 3000;

app.use(express.urlencoded({ extended: true }));

app.post('/signup', (req, res) => {
  const signupData = {
    name: req.body.name,
    email: req.body.email,
    password: req.body.password,
    confirmPassword: req.body['confirm-password']
  };

   if (signupData.password !== signupData.confirmPassword) {
    return res.status(400).send('Passwords do not match.');
  } 
  // Redirect to a new page, passing data via query string
  res.redirect(`/welcome?name=${encodeURIComponent(signupData.name)}&email=${encodeURIComponent(signupData.email)}`);
});

app.get('/welcome', (req, res) => {
  const name = req.query.name;
  const email = req.query.email;

  // Render the welcome page with the signup information
  res.send(`
    <h1>Welcome,${name}</h1>
    <p>Your email: ${email}</p>
    <p>Your password is processed</p>
    `);
});

app.listen (PORT, ()=>{
   console.log(`Server is running on port ${PORT}`);
}
);
