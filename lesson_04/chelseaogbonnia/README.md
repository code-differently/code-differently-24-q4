# Prime Number Finder (Python and JavaScript) #

This project demonstrates how to find prime numbers between 1 and 100 using two programming languages: Python and JavaScript. Each function uses a for loop to check whether a number is prime, and both include inline comments to explain the code step by step. Additionally, there are detailed explanations after each function.

## Prime Number Finder in Python ##
```
# Function to find prime numbers between 1 and 100 in Python
def find_prime_num_py():

    # Loop through numbers from 2 to 100
    for num in range(2, 101):
        is_prime = True # Assume the number is prime

        # Check if num is divisible by any number between 2 and its square root
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                is_prime = False # If divisible, not a prime number
                break # Exit the loop early

        # If is_prime is still true, num is a prime number
        if is_prime:
            print(num) # Output the prime number

# Call the Python function
find_prime_num_py()
```
### Python Explanation: ###
The Python function, find_prime_num_py, uses a for loop to iterate through the numbers between 2 and 100. The is_prime variable is set to True for each number. Inside the inner loop, we check if the number is divisible by any integer between 2 and the square root of the number. If the number is divisible, it is marked as not prime, and we break out of the inner loop to stop further unnecessary checks. The square root limit ensures better performance. When the number is confirmed to be prime, it is printed to the console.


## Prime Number Finder in JavaScript ##
```
// Function to find prime numbers between 1 and 100 in JavaScript
function findPrimeNumberJS() {

    // Loop through numbers from 2 to 100
    for (let num = 2; num <= 100; num++) {
        let isPrime = true; // Assume the number is prime

        // Check if num is divisible by any number between 2 and its square root
        for (let i = 2; i <= Math.sqrt(num); i++) {
            if (num % i === 0) {
                isPrime = false; // If divisible, not a prime number
                break; // Exit the loop early
            }
        }

        // If isPrime is still true, num is a prime number
        if (isPrime) {
            console.log(num); // Output the prime number
        }
    }
}

// Call the JavaScript function
findPrimeNumberJS();
```

### JavaScript Explanation: ###
In this JavaScript function, findPrimeNumberJS, we use a for loop to iterate over the numbers from 2 to 100. The isPrime variable initially assumes that each number is prime. For each number num, we check if it is divisible by any number from 2 to the square root of num. If the number is divisible, it is marked as not prime by setting isPrime to false, and we break out of the inner loop to save time. If the number remains prime after the check, it is printed to the console. The square root check ensures we minimize the number of iterations for efficiency.
