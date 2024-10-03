## Explanation


First I declared 3 variables to use to test my function a,b, and c. I then assigned 3 integers to these variables to test this function. I created a function by the name of prime that contained an if else statement and a for loop. I then created several rules for the the if statement. The first rule determined whether the number was less than 2 then it was considered not a prime number. The second rule was that the number 2 would return true as it is the only even prime number. the third rule was that any number that was divided by 2 would not leave a remainder a 0. If none of those conditions were satisfied then a for loop would activate starting from the number 3. The loop would check all numbers starting at number #3 and must be less than or equal to the square root of (n). The loop would then increase integer by 2 to check every odd number between 3 and the square root. If any number that was determined (n) to be divisible by (i) then it was false and not a prime number. If there was no odd divisble numbers then the statement would return true. Afterwards I would test the function by inputting a console.log command in the terminal to print a string that determined whether or not the number in each variable was a prime number or not.


### Similiarities and Differences


1. **Syntax**: 
   - to print messages in the console in javascript you would do console.log
   - to print messages in the console in Java you would use the System.out.println command
   - although they are different they ultimately perform the same action and the function's are built in a very similar order/pattern.

2. ** Variables
   - In javascript you can declare a variablle using let and achieve a more broader scope of defined objects whereas in Java you have to be more specific with the data type as an int,double,string,etc.