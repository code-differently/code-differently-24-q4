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
``` jsx
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

My JavaScript function checks if a number is prime by first returning `false` if the number is less than 2, since prime numbers are greater than 1. Then, it tests every number from 2 up to one less than the given number to see if any of them can divide it without leaving a remainder. If it finds one that can divide it evenly, it returns `false` ; if not, it returns `true`, meaning the number is prime.

Now for my React implementation, it is definelty a LOT. But it's an app that checks if a number is prime, which means it can only be divided evenly by 1 and itself (as a reminder). You type a number into a box and click a button, and the app looks to see if any smaller numbers can divide it evenly. If it finds one, it says the number is not prime; if not, it says it is prime. It also gives a message if you enter an invalid number. So it's like a bonus!



