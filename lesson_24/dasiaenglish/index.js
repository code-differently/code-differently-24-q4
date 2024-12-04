const express = require("express");
const morgan = require("morgan");
const path = require("path");
var debug = require('debug')('myapp:server');

const app = express();

app.use(morgan("dev"));
app.use(express.static(path.join(__dirname, "public")));

const PORT = process.env.PORT || 3000;


app.post('/resut.html',(req, res) => {
    res.send("This is working!").status(200);
});

app.listen(PORT, () => {
    debug(`Server listening on http://localhost:${PORT}`);
});
