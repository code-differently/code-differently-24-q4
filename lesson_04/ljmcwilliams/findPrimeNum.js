const readline = require('readline'); //"require()" imports the readline module which will process the user input
const read = readline.createInterface({
    input: process.stdin, //this acts as an input scanner
    output: process.stdout //this works like a normal console.log combined with a user's input
});
let isConditionMet = false;

/* When looking at the Node.js docs, it states '.question()' displays the query (in this case the user prompt).
It waits for an input and uses it as the first argument in a callback function (here I am using a arrow function). */
read.question("Enter a number: ", (answer) => {
    for (let i = 2; i < answer; i++) {
            if ((answer / i) == parseInt(answer / i)) { //similar to the "(int)" statement in java, parseInt converts doubles to ints
                console.log(answer + " is not a prime number.");
                isConditionMet = true;
                read.close(); //this works similar to a break statement in java and ends the program
            }
        } if (!isConditionMet) {
            console.log(answer + " is a prime number.");
            read.close();
        }
})