```python 
# takes input from console and sets it to integer
number = int(input(Enter the number: "))
#when no number input=false
flag = false
##check to see if numbers divide by 2,if true it breaks function.
for i in range (2, number):
    if (number % i ==0):
        flag = true
        break
##entered number is not prime and will return it
if flag:
    print("Entered number {} is not a prime number".format(number))
    ##entered number is a prime number
else:
    print("Entered number {} is a prime number".format(number))       
```
number = int(input("Enter a whole number: "))


```javascript
// the function will be calling an n that it will output.
function isprime(n) {
  // if the output n is 1, it will be false 
    if (n <=1)
        return false;
// i will be a number that will loop from 2 to the square root of n. 
    for (let i = 2; i < n;i++) {
        if(n % i ===0) {
            return false;
        }
    }
    return true;

}

console.log(isprime(5))

## Explanation

/*Python function uses the i as variable if. If the variable gets divided by 2 and it results in 0, then it is true and the code will not run/break.
*/

/* In javaScript the function will be calling an n that it will output. if the output n is 1, it will be false. i will be a number that will loop from 2 to the square root of n. 
*/

/*Differences
when using python, the language will use `if` keyword, to deteremine if the number will be an interger. Whereas, in Javascript, the language being used will be called a `function`. 
*/

/*Type coercion
Python is particular when it comes to the input the variable and can have different outputs. 
Javascript is easier to write but if it not input correctly,it can affect the code.
*/

/*Function calls
Syntax to call the fucntion for python is 
number = int().
Syntax for Javascript is console.log().
*/

/*Citations
Python
https://www.youtube.com/watch?v=J-5swSZj_iI

Javascript
https://www.youtube.com/watch?v=cmco9fi3xnA
*/