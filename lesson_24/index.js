const express = require("express");
const morgan = require("morgan"); 
const path = require("path");
var debug = require('debug')('myapp:server');

const app = express(); 

app.use(morgan("dev"));
app.use(express.static(path.join(__dirname, "zion_template_copy")));

const PORT = process.env.PORT || 33049; 

app.use(express.urlencoded({expected: true}));


app.listen(PORT, () => { 
    debug(`Server listening on http://localhost:${PORT}`);
})