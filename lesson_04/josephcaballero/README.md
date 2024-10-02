## Javascript Implementation
```javascript
const prime = (num) => {
    if(num <2){console.log(num + " is not a prime number")}
    else{
        for(let i = 2; i<=10; i++){
            if(num%i !== 0){
                if(i ===10){
                    console.log(num + " is a prime number")
                    break;
                }
                else{
                    continue;
                }
            }
            else if(num%i===0 && num !==i){
                    console.log(num + " is not a prime number")
                    break;
            }
            else if(num===2){
                console.log(num + " is a prime number")
                break;
            }
        }
    }
}
prime(2) // output: 2 is a prime number
prime(11) // output: 11 is a prime number
prime(12) // output: 12 is not a prime number
```
## Python Implementation
```python

def prime(num):
    if(num <2):
        print(num , " is not a prime number")
    else:
        for i in range(2,11):
            if num % i != 0:
                if i ==10:
                    print(num , " is a prime number")
                    break
                
                else:
                    continue
                
            
            elif num%i==0 and num !=i:
                print(num , " is not a prime number")
                break
            
            elif num==2:
                print(num , " is a prime number")
                break
            else:
                continue
                
prime(2) # output: 2 is a prime number
prime(11) # output: 11 is a prime number
prime(113) # output: 113 is a prime number
```

## Explanation
My codes both use a function called prime with a parameter of num (num is to be filled with a number). The function is comprised of an if statement first with a condition that checks that the number entered isnt a number less than 2 (due to the fact that any number below 2 is not prime). Next is an else statement for when the number that was given in the parameter is not less than 2. After that is a for loop nested (meaning inside) in the else statement to iterate over a set group of numbers which in my case are 2-10 (because if a number is divided by these numbers and reaches 0 it is not a prime number, in the code it is shown as 2,11 however the digit on the right does not get reached and thus goes up to 10). Then if loops to meet certain conditions, in these if loops I use the percentage sign % which is modulator (mod for short) which checks if there is a remainder after division, be it 10/2 "which is 0" or 13/2 "which is 1" if there is a remainder it is prime and if there is not it is not prime(after all iterations). I used the code to take the number given to me and then checked if every number between 2-10 that was %(modded) by the given number did not meet 0 because if it did that would not be a prime number. To bypass the question of "what if the number you input gets iterated over in the for loop", i set a parameter that skips over that iteration by simply making use of the else loop so that any other iteration would be looked at and not that duplicate numbered one.

In python I did this using the def prime(): code "prime being the function name"

In javascript i did the exact same thing however I made a constant function which is just easier to debug. by doing const prime = (condition) => {code}

### Difference
1. **Syntax**: 
- In python the syntax feels much more friendly by looking at it however is is alot scarier when you delve deep into it as you can make loops and function just by using if(condition): or for i in range(): as long as you are matching line indents, not to mention no ; which is alot more responsibility on the programmer
- In javascript it feels much more safer but cluttered, the {} help show where exactly everything is in a more contained way but takes up space, and the ; are nice however they are an extra character, it is a give some take some scenario between these two languages
2. **Different Signs**:
- In Python you use different signs , like the print statement itself, how the statement is structured with a comma, and no parenthesis between most things that javascript would have
- In Javascript the equivalent of print is console.log(), also in the log you put + to combine two values even if they arent the same to yield a log displayed in the console, and there are many more parenthesis like in the  conditional statements
