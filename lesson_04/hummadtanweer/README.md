

```Java
static boolean checkPrime(int num) {
      boolean prime = false;
        if (num == 0 || num == 1) {
            prime = true;
        }
        for (int i = 2; i <= num / 2; i++) {
          if (num % i == 0) {
            prime = true;
            break;
          }git 
        }
      return !prime;
   }

# Example usage:
print(checkPrime(4))  # Output: false
print(checkPrime(7))  # Output: true

## JavaScript implementation

```javascript
function checkPrime(num) {
    let prime = false;
    if (num === 0 || num === 1) {
        prime = true;
    }
    for (let i = 2; i <= num / 2; i++) {
        if (num % i === 0) {
            prime = true;
            break;
        }
    }
    return !prime;
}
// Example usage:
console.log(checkPrime(4)); // Output: false
console.log(checkPrime(7)); // Output: true


## Explanation

The Javascript implementation uses a function named `checkPrime` that takes a single argument `number`. It returns `True` if the number is prime, otherwise, it returns `False`.

The Java implementation uses a function named `checkPrime` that also takes a single argument `int number`. It returns `true` if the number is Prime and `false` otherwise.

Java uses `true` and `talse` for boolean values and JavaScript uses `true` and `false`.

### Differences

 **Function Calls**:
   - The syntax for calling functions and printing to the console/output is slightly different. Java uses `print()`, while JavaScript uses `console.log()`.

**Citation
https://www.programiz.com/java-programming/online-compiler/?ref=8039b165git 