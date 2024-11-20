const express = require("express");
const morgan = require("morgan");
const path = require("path");
//const debug = require('debug')('myapp:server');

const app = express();
const bodyParser = require('body-parser')

app.use(morgan("dev"));
app.use(express.static(path.join(__dirname, "public")))

app.get(/public\.html/, function (req, res) {
    res.sendFile('path_to_public.html');   
});

//app.use(express.static('public'));

const PORT = process.env.PORT || 3002;

app.listen(PORT, () => {
    console.log(`Server is listening on port ${PORT}`);
});
