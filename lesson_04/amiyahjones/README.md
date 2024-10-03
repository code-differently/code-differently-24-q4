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

My Javascript implementation checks if a number is prime by doing the following:
1. if the number is less than 2 , it returns ```false``` since prime numbers have to be greater than 1.
2. Then, it looks at every number starting from 2 up to one less than your number (i = the number you enter to check with) to see if any of these can divide your number just fine (without any remainders / leftovers) 
3. If it finds any number that divides evenly, it returns ```false```
4. If it doesn't find any number that can divide it, the function returns ```true```.
