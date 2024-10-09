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
## Ruby  
###### Tutorial used : https://www.youtube.com/watch?v=33pLqGvk-PM
``` ruby
def prime?(n)
# '2..n-1' checks all the numbers from 2 up to less than 'n'.
# 'none' -> sees if none of these numbers can divide 'n' evenly.
  (2..n-1).none? {|divisor| n % divisor == 0}
# If none of these numbers divide 'n' without a remainder,
# then 'n' is a prime number. Otherwise, it's not.
end

p prime? 5 # prints 'true'
p prime? 6 # prints 'false'
p prime? 7 # also 'true'
```


## Explanation 

My JavaScript implementation uses a function named ```isPrime``` that checks if a number is prime by first returning `false` if the number is less than 2, since prime numbers are greater than 1. Then, it tests every number from 2 up to one less than the given number to see if any of them can divide it without leaving a remainder. If it finds one that can divide it evenly, it returns `false` ; if not, it returns `true`, meaning the number is prime.

The ruby implementation has a function named ```prime?``` that also looks at all the numbers from 2 up to one less than the number given. Same rules apply: If none of those numbers can divide it evenly, then it prints ```true```. For example, it tells us if 5 and 7 are prime (they are!) and if 6 is prime (it’s not!).

### Differences
1. Instead of ```function``` used to define what your function is in javascript, Ruby use ```def```
2. Ruby is much more simple - where tthe ```if``` and ```else``` statement is simply in one line
3. Ruby simply 'prints' the result of its functions rather than ```console.log();``` 


