## Javascript
``` javascript
function isPrimeNumber(n) {
  var copycat = n;
  if (n % 1 == copycat && n % copycat == 1) {
    return true;
  } else{
    return false; 
  }
}



//prime number: a number that can only be divided by itself and 1 without remainders
// If the number is a prime , return true. Else = false
```


## Explanation 

My Javascript implementation uses a for loop to determine whether the number is prime. It thats a single 'if' argument on whether the number is prime. If not, then the 'else' statement will return false since it's outside of those few numbers. 
