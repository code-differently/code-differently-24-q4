## Javascript
```javascript
function findPrimes() { // A machine that helps find prime numbers
    let primeNumbers = [];  // Use 'let' and an empty array for prime numbers

    for (let numberToCheck = 2; numberToCheck <= 100; numberToCheck++) { // Here is a loop that starts at 2 and keeps going until 100
        let isPrime = true; //I am starting this out with assuming the number is true 

        for (let factor = 2; factor <= Math.floor(numberToCheck / 2); factor++) { //this is another loop but it checks to see if the number is divisible by other numbers.
            if (numberToCheck % factor === 0) { // this is checking to see if the number can divide evenly and if so then it is not a prime number
                isPrime = false; // states that the number is not prime if it comes out as 0 (should have a remainder)
                break; //states that it can STOP the loop once it finds a 0, no need to keep going through
            } //this is closing the loop
        }

        if (isPrime) { //if said number is still true that means that we did not find any number that is divided evenly so it is prime
            primeNumbers.push(numberToCheck);  // Push primes into the array box above []
        } 
      }  //closing the loop from 2 to 100


    //Output the prime numbers
    console.log("Prime numbers from 1 to 100 are:"); // telling the comuter to print it out what is in " "
    console.log(primeNumbers.join(", ")); // show the prime numbers that we found
} //will fill in all the numbers that are prime

// Call the function to find and print primes
findPrimes();

// credit from Coding with John youtube video https://www.youtube.com/watch?v=I9-3drnfyp0 
```


## Python
```python
def find_primes(): # this is a function that will help us find all the prime numbers
    prime_numbers = [] # this is an empty list for now until we run the test for all the prime numbers we find

    for number_to_check in range(2, 101): # checking numbers from 2 to 100
        is_prime = True # I am saying that it is a prime until I find out it is not 

        for factor in range(2, number_to_check // 2 + 1): # checks to see if the number can be divided by a smaller number evenly
            if number_to_check % factor == 0: # trying to see if there is a remainder after the divison and if it is equal to zero
                is_prime = False # if it is equal to zero it is flase meaning it is not prime
                break # again it means STOP
        if is_prime: # after checking all 
            prime_numbers.append(number_to_check)  # Add prime numbers

    print("Prime  numbers from 1 to 100 are:")
    # type out what is in the " "
    print(", ".join(map(str, prime_numbers))) # put all the prime numbers split by a commma
find_primes() #tells the computer to go ahead and run the function
```
## Explanation 
My first thought was to use Javascript and html because those were the 2 languages that I was familiar with. I did some research and quickly came to the realization that html would not be the most effective. That's when I found out that I should use Python and Javascript.
Python is known for how easy it is to read and how simple it is. But is super space indentation sensitive. Whereas Javascript is a little more complex because it uses different characters, which makes it a little harder to understand.

Similarities: Both Javascript and Python are finding prime numbers between 2 and 100 even though in pyton it says 101. That is becuase we did not plug in 101 we stopped right before it.

Diffreneces: A diffrence that Javascript uses let for declaring variables while python uses simplier words becuase you do  not need a keyword

