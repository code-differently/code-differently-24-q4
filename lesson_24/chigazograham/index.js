const express = require('express');
const morgan = require('morgan');
const path = require('path');

const app = express();

app.use(morgan('dev'));
app.use(express.static(path.join(__dirname, 'public')));

const PORT = process.env.PORT || 3000;

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});


app.post('/results.html', (req, res) => {
    const currentTime = new Date().toISOString();
    res.status(200).send(`<div> Not Ready Yet!!! ${currentTime}</div>`)
});