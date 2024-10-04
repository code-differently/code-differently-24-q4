## JavaScript Implementation

```javascript
// Function to check if a number is prime
function isPrime(number) {
    // A prime number must be greater than 1
    if (number <= 1) {
        return false;
    }

    // Check if the number has any divisors other than 1 and itself
    for (let i = 2; i <= Math.sqrt(number); i++) {
        // If the number is divisible by i, it's not prime
        if (number % i === 0) {
            return false;
        }
    }

    // If no divisors were found, the number is prime
    return true;
}

// Example usage
let num = 77;
if (isPrime(num)) {
    console.log(num + " is a prime number.");
} else {
    console.log(num + " is not a prime number.");
}
```
## Java Implementation 

```java 
// Prime Number Checker in Java
public class PrimeChecker {

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        // A prime number must be greater than 1
        if (number <= 1) {
            return false;
        }

        // Check if the number has any divisors other than 1 and itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by i, it's not prime
            if (number % i == 0) {
                return false;
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        int num = 77;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
```
## Explanation
For JavaScript, I created a fuction using chatgpt that would determine whether a number is prime or not. If a number is less than or equal to 1, then the output of the function would determine the number to be false. This is due to the fact that any number less than or equal to 1 is not a prime number. Any number that is greater than 1 would simply return the output of the function to be true or false, depending on if it is or isn't a prime number. I then included a variable that would mathematically verify if any given number has any divisors others than the number 1 and itself. If the number is divisible by i, then it's not prime. It would only be prime if there were no divisors found.

For Java, it was a similar process, but with more structure in the data types. I also used chat gpt to help me understand this process as well.
## Differences
In regards to the syntax and structure, Java was more strict with its rules while JavaScript was more loose. In other words, Java had a 11pm curfew while JavaScript could go out and come back at whatever time it pleases. The data type in Java required explicit commands whereas JavaScript had more leniency towards its data types.