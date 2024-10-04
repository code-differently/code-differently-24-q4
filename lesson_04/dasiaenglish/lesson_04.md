```Javascript
#Javascript

const readline = require(`readline`);

const rl =readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function findPrimes(numberToCheck) { // A machine that helps find prime numbers

    if (numberToCheck <=1){
        return `${numberToCheck} is not a prime number.`; //any number that is less or equal to 1 it is NOT a prime number
    }
    let isPrime = true; //I am start with assuming the number is prime 


        for (let factor = 2; factor <= Math.floor(numberToCheck / 2); factor++) { //this is another loop but it checks to see if the number is divisible by other numbers.
            if (numberToCheck % factor === 0) { // this is checking to see if the number can divide evenly and if so then it is not a prime number
                isPrime = false; // states that the number is not prime if it comes out as 0 (should have a remainder)
                break; //states that it can STOP the loop once it finds a 0, no need to keep going through
            } //this is closing the loop
        }

        if (isPrime) { //if said number is still true that means that we did not find any number that is divided evenly so it is prime
            return `${numberToCheck} is a prime number.`; //if the numbe is prime it will say^^
        } else{
            return `${numberToCheck} is not a prime number.`; // if it is NOT prime it will say so
        }
} //closing the loop of if it is a prime number or not 

rl.question(`Enter a number to check if it\'s prime:`, (input)=>{
    let number = parseInt(input);

    if (isNaN(number)) {
        console.log("Please enter a valid number.");
    } else {
        console.log(findPrimes(number));
    }
});
// credit from Coding with John youtube video https://www.youtube.com/watch?v=I9-3drnfyp0 and Chatgpt for a explanation of things I still might have been confused about 
```

```python
# Python
# this is a function that will help us find all the prime numbers
def find_primes(number_to_check):
    if number_to_check <= 1:  # this is an empty list for now until we run the test for all the prime numbers we find
        return f"{number_to_check} is not a prime number."

    is_prime = True  # I am saying that it is a prime until I find out it is not

        # checks to see if the number can be divided by a smaller number evenly
    for factor in range(2, number_to_check // 2 + 1):
        if number_to_check % factor == 0:  # trying to see if there is a remainder after the divison and if it is equal to zero
                is_prime = False  # if it is equal to zero it is flase meaning it is not prime
                break  # again it means STOP
    if is_prime:  # after checking all
        return f"{number_to_check} is a prime number."
    else:
        return f"{number_to_check} is not a prime number."

number = int(input("Enter a number to check to see if its prime: "))
print(find_primes(number))

```

## Explanation 
My first thought was to use Javascript and html because those were the 2 languages that I was familiar with. I did some research and quickly came to the realization that html would not be the most effective. That's when I found out that I should use Python and Javascript.
Python is known for how easy it is to read and how simple it is. But is super space indentation sensitive. Whereas Javascript is a little more complex because it uses different characters, which makes it a little harder to understand.

Similarities: Both Javascript and Python are finding prime numbers between 2 and 100 even though in pyton it says 101. That is becuase we did not plug in 101 we stopped right before it.

Diffreneces: A diffrence that Javascript uses let for declaring variables while python uses simplier words becuase you do  not need a keyword

