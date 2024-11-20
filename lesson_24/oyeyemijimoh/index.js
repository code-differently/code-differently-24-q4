const express = require('express');
const morgan = require('morgan');
const path = require('path');
const bodyParser = require('body-parser');
const app = express();
app.use(bodyParser.urlencoded({extended:true}))

app.use(morgan('dev'));
app.use(express.static(path.join(__dirname,'public')));
const PORT =process.env.PORT || 3005;

app.listen(PORT, ()=>{
    console.log(`Server is running on port ${PORT}`);
});


app.post('/contact.html',(req,res)=>{
    const q = req.body;
    const firstname = q.firstname;
    const lastname = q.lastname;
    const email = q.email;
    console.log(req.body);
    res.status(200).send(
        `<div> Thank you for completing the contact us form
            <p>First Name : ${firstname} </p> 
            <p> Last Name : ${lastname} </p>
            <p> Email Address : ${email} </p>
            <p> <a href="index.html">Home</a></p>
        </div>`);
});