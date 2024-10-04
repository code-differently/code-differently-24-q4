## Java Implementation

```java
if (n <= 1) {
    System.out.println(n + " is not a prime number.");
} else if (n == 2) {
    System.out.println(n + " is a prime number.");
} else if (n % 2 == 0) {
    System.out.println(n + " is not a prime number.");
//ChatGPT helped me to complete the code from this point.// 
} else { 
    boolean isPrime= true;
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
        if (n % i == 0) {
            isPrime = false;
            break;
        }
    }
    if (isPrim) {
        System.out.println(n + " is a prime number.");
    } else { 
        System.out.println(n + " is not a prime number.");
    }
}

# Example Usage:
Input: n = 7
Output: if (7 <= 1) // Result: No, 7 is not less than or equal to 1
        else if (7 == 2) // Result: No, 7 is not equal to 2
        else if (7 % 2 == 0) // Result: No, 7 mod 2=1, 7 is not even
        else 
            boolean isPrime = true // Initialize a boolean variable to true to check for odd factors
        for (int i = 3; i <= Math.sqrt(7; i += 2) // Result: √7 ≈ 2.645, 3<=2.645, Answer: No, so isPrime is true
        Print Result: 7 is a prime number.
```

## C++ Implementation

```c++
// C++ code created and explained with the help of ChatGPT and Google Search
bool isPrime(int number) {
    // Handle special cases
    if (number <= 1) return false; // 0 and 1 are not prime numbers
    if (number <= 3) return true; // 2 and 3 are prime numbers

    // Check for even numbers greater than 2
    if (number % 2 == 0) return false;

    // Check for factors from 3 to the square root of the number
    for (int i = 3; i * i <= number; i += 2) {
        if (number % == 0) return false; // Found a factor
    }

    return true; // No factors found, number is prime
}

int main() {
    int num;
    std::cout << "Enter a number: ";
    std::cin >> num;

    if (isPrime(num)) {
        std::cout << num << " is a prime number." << std::endl;
    } else {
        std::cout << num << " is not a prime number." << std::endl;
    }

    return 0;
}
 
# Example Usage:
Input: isPrime(7)
Output: if (7 <= 1) return false // Result: 7 is not less than or equal to 1
        if (7 <= 3) return true // Result: 7 is greater than 3
        if (7 % 2 == 0) return false // Result: 7%2=1
        for (int i = 3; i * i <= 7; i += 2) // Result: i starts at 3, 3 * 3 <= 7, 9 <= 7, false 
        return true // Result: No factors found
Print Result: Since isPrime(7) returned true: 7 is a prime number.
```


## Explanation 

### Thought Process

I chose to use the programming languages Java and C++. I chose Java because I have been introduced to it before through Codio and have an introductory level understanding of some concepts. I chose C++ because after understanding what a prime number is and its uses, I found that it is a crucial part of cryptography. The difficulty of factoring large prime numbers makes it ideal for creating secure encryption algorithms. Due to its high performance, control over memory management, and ability to optimize code for speed, especially for complex algorithms and time sensitive situations, C++ has the title of being one of the best programming languages for creating encryption algorithms. (Source: Google search, AI) 

### Implementation

The Java implementation determines if a number is a prime number by:

- Understanding what a prime number is (a number that is greater than 1 and is only divisible by 1 and itself), then setting up the logic.

- Use a boolean variable `isPrime` in an if/else conditional statement. If `isPrime` returns false, n is not a prime number. If `isPrime` returns true, n is a prime number.

The C++ implementation determines if a number is a prime number by:

- Using a conditional statement within a function.

- The `main` function takes user input and uses the `isPrime` function to determine if a number is a prime number. If `isPrime` returns true, n is a prime number. If `isPrime` returns false, n is not a prime number.

### Similarities

- Both programming languages used conditional statements with true/false values to determine if a number is a prime number.

- Similar syntax: `isPrime`

- Similar code operation: Start with special cases `n<=1, n<=3`, then check for even numbers greater than 2, loop to check factors before coming to the output.

### Differences

1. **Syntax**: 
- In Java, the true/false value is called `boolean`, whereas in C++ the true/false value is called `bool`.
- C++ uses a `main` function to take user input during the output process, while in Java it is assumed that the `isPrime` starts off as true until proved false.

2. **Function Calls**:
- The syntax for printing to the console/output is different. Java uses `System.out.println()`, while C++ uses `std::cout << "insert string" << std::endl;`.
`(Source: ChatGPT, Google Search, Codio notes)`
