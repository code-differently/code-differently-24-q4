In this lesson, I explored the differences between Java and JavaScript. Despite their similar names, these languages have distinct features.

- ## Key Differences
- ### Document Preparation:

    - Java requires preparation before defining variables and functions.
JavaScript has more flexibility with variable definitions.

- ### User Input:

    - In Java, I used the Scanner class to prompt the user for number input.
This required importing Java's Scanner class.
In JavaScript, there is no built-in Scanner class, so I used Node.js as a workaround.
With Node.js, I utilized process.stdin for input and process.stdout for output (similar to console.log).

- ### Loop Control:

    - Both languages allow for loops to be exited early, but the methods differ:
In Java, using a break statement within the loop will terminate it.
In JavaScript, I opted for read.close(), which achieves a similar effect.

- ### Variable Declaration:

    - Java requires explicit declaration of variable types.
JavaScript automatically assigns variable types.
- ## Loop Behavior
Both languages share similarities in loop functionality:

- **For Loops**:
    - Take three expressions.

- **If Statements**:
    - Accept a condition and can be nested.

- **Java Example**
```java
for (int i = 2; i < userInput; i++) {
            if ((userInput / i) == (int) (userInput / i)) {
                System.out.println(userInput + " is not a prime number.");
                isConditionMet = true;
                break;
            }
        } if (!isConditionMet) {
            System.out.println(userInput + " is a prime number.");
        }
```
- **JavaScript Example**
```javascript
for (let i = 2; i < answer; i++) {
            if ((answer / i) == parseInt(answer / i)) {
                console.log(answer + " is not a prime number.");
                isConditionMet = true;
                read.close();
            }
        } if (!isConditionMet) {
            console.log(answer + " is a prime number.");
            read.close();
        }
```