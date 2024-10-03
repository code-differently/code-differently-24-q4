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

// If the number is a prime , return true. Else = false
```


## Explanation 

My Javascript implementation uses a for loop to determine whether the number is prime. A prime number can only be divided by itself and 1 without any remainders. It has a single 'if' argument on whether the number is prime based on the whether the results are exactly as expected of a prime number. If not, then the 'else' statement will return false since it's outside of those few numbers. 
