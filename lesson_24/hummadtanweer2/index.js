const express = require('express');
const morgan = require('morgan');
const path = require('path');
const bodyParser = require('body-parser');
const app = express();


app.use(bodyParser.urlencoded({extended:true}));

app.use(morgan('dev'));
app.use(express.static(path.join(__dirname,'public')));

const PORT = process.env.PORT || 3002;


app.listen(PORT, () => {
    console.log(`Sever running on port ${PORT}`);
});

app.post('/contact.html',(req,res)=>{
    const firstname = req.body.firstname;
    const lastname = req.body.lastname;
    const message = req.body.message;
    const email = req.body.email;
    console.log(req.body);
    res.status(200).send(
        `<div>Thank you for visting Code Differently
         <p> First Name : ${firstname}</p>
         <p> First Name : ${lastname}</p>
         <p> First Name : ${message}</p>
         <p> First Name : ${email}</p>
        </div>`
    )
});

