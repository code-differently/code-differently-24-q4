## Javascript
``` javascript

function isPrime(num) {
  if (num < 2) {
    return false; // Numbers less than 2 are not prime
  }

  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false; 
    }
  }
  
  return true; 
}

console.log(isPrime(5)); //true
console.log(isPrime(1)); //false

```

## React
``` react
// src/App.js

import React, { useState } from 'react';

function isPrime(num) {
  if (num < 2) {
    return false; // same thing from JS
  }

  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false; 
    }
  }
  
  return true; 
}

function App() {
  const [guesses, setGuesses] = useState([]); //stores the guesses made by the user
  const [result, setResult] = useState(''); //stores message whether its a prime number or not
};
 const handleChange = (e) => {
    setNumber(e.target.value); // Update the number state when the user changes their "input"
  };

  const handleSubmit = (e) => {
    const num = parseInt(number, 10); // Convert input to a number (since usually it's a string when typing your answer)
    if (!isNaN(num)) { // Check if input is a prime number
      setResult(isPrime(num) ? `${num} is a prime number.` : `${num} is not a prime number.`); 
    } else {
      setResult('Please enter a valid number.'); // Error message for invalid input
    }
  };

  return (
    <div>
      <h1>Prime Number Checker</h1>
      <form onSubmit={handleSubmit}>
        <input 
          type="number" 
          value={number} 
          onChange={handleChange} 
          placeholder="Enter a number" 
        />
        <button type="submit">Check</button>
      </form>
      {result && <p>{result}</p>} {/* Display the result if it exists */}
    </div>
  );
}

export default App;

```


## Explanation 

My Javascript implementation checks if a number is prime by doing the following:
1. if the number is less than 2 , it returns ```false``` since prime numbers have to be greater than 1.
2. Then, it looks at every number starting from 2 up to one less than your number (i = the number you enter to check with) to see if any of these can divide your number just fine (without any remainders / leftovers) 
3. If it finds any number that divides evenly, it returns ```false```
4. If it doesn't find any number that can divide it, the function returns ```true```.

Now for my React implementation, it is definelty a LOT. It's basically code to make an app where you can type any number into a box and click a button. It goes through the same steps as javascript, checking if the number is prime by looking at all the numbers below it to see if any can divide it evenly. If it finds one, it tells you that the number is not prime. If it doesn’t find any, it says the number is prime. It also lets you know if you didn’t type in a valid number. So it's like a bonus!



