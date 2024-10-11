## Java Implementation
```Java
public class Main {
    public static void main(String[]args){
        int num = 19;
        boolean isPrime = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
    }
        if (isPrime){
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is not a Prime number.");
        }
    }
}
//Had help from Chat GPT to help me understand how to make one and break it down step by step//
```
## Python Implementation
``` Python
def is_prime(num):
    if num <= 1:
        return False

    for i in range(2, num):
        if num % i == 0:
            return False

    return True
num = 19
if is_prime(num):
    print(f"{num} is a Prime number.")
else:
    print(f"{num} is Not a Prime number.")

##  I Had Chat GPT convert this from the Java equation ##
```
## Explanation
Here i have the equations to find prime numbers in both Java and Python, however it is hard coded which means that if you wanted to figure out that another number was a prime number you would need to change the value in the variable num.

## Differences
- Java uses curly braces with `else`, while python uses a colon with `else` to define the blocks of code.
- Java has to use `public static boolean` to define the method, as in this Python equation does not use any class to define its method since it does not have one in this case, but instead uses a function with the keyword `def` to declare it.
- Java and Python both use a `for` loop however Python uses `range` to create the sequence of numbers from 2 till num and in the Java code `for (int i = 2; i < num; i++)` you have to initialize, then have the condition, and lastly increment.
## Similarities
- Both Codes print out whether or not the number is prime, if you would like to find another number you just need to change the value from the variable num.
- They both use some type of print to output what the solution of your value is to know whether or not your number that is inputted is prime.