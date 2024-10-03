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




## Explanation 

My JavaScript function checks if a number is prime by first returning `false` if the number is less than 2, since prime numbers are greater than 1. Then, it tests every number from 2 up to one less than the given number to see if any of them can divide it without leaving a remainder. If it finds one that can divide it evenly, it returns `false` ; if not, it returns `true`, meaning the number is prime.


> [!NOTE]
> Javascript and React are related in a way. But React is easier (or so I'm told) , and has everything in one spot.

### Differences

1. 
