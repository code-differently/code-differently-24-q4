const morgan = require('morgan');
const express = require('express');
const path = require('path');

const app = express();

app.use(morgan('dev'));

app.use(express.static(path.join(__dirname, 'public')));

const PORT = process.env.PORT || 2400;




app.listen(PORT, () => {
    console.log(`Listen at http://localhost:${PORT}`)
})