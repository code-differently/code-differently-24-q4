const express = require("express");
const morgan = require("morgan");
const path = require("path");
var debug = require('debug')('myapp:server');

const app = express();

app.use(morgan("dev"));
app.use(express.static(path.join(__dirname, "public")));

const PORT = process.env.PORT || 5500;

app.post('/results.html', (req, res) => {
res.send('<div>Thank You For Submitting, We Will Contact You Soon!').status(200);
});

app.listen(PORT, () => {
    debug(`Server listening on http://localhost:${PORT}`);
});