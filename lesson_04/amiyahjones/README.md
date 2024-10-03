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
``` ruby
number_guess_ = 90

if number_guess_ <= 1
  puts "Not a prime number"
if number_guess == 2
  puts 
else 

```



## Explanation 

My JavaScript function checks if a number is prime by first returning `false` if the number is less than 2, since prime numbers are greater than 1. Then, it tests every number from 2 up to one less than the given number to see if any of them can divide it without leaving a remainder. If it finds one that can divide it evenly, it returns `false` ; if not, it returns `true`, meaning the number is prime.

My html implementation is your ‘we have mcdonalds at home’ type of function. Technically the code determines whether a number is a prime number, except it shows you the list and leaves it up to you as the user to check. 
Picture this page as if you're looking through a book that you consume the knowledge vs. technology that just gives it to you. 

###### 'Autonomy' in a way? Say the computer is independent in JS , while html it's influenced / gives the user control

