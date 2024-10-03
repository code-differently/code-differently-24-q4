## Python implementation

```python
def is_prime(num): 
# uses the function is_prime and takes the argument num
    if num > 1: 
# gets rid of numbers 1 and lower as the first prime number is 2
        for i in range(2, (num // 2) + 1):
# tells the computer to look at all numbers between 2 and half of the value of num rounded up to the next nearest value using floor division
            if(num % i) == 0: 
# then divides the num value, using modulo division, by every number in the range of two to +infinity 
            return False 
# if the remainder in equivalent to 0 then the number is not prime and returns False
        else:
            return True 
# if the remaineder is not equivalent to 0 then the terminal will return True     
    else:
        return False
# for all other real numbers that arent prime the terminal will reurn False

print(is_prime(19)) #Output: True
print(is_prime(9)) #Output: False
```

## Ruby implementation

```ruby
def isPrime(n) 
#uses the function isPrime and takes the argument n
    return false if n <= 1 
#the computer will reurn false for all numbers less than or equal to zero
    return true if n == 2 || n == 3 
#tells the computer to return true if the n is equivalent to 2 or 3

    return false if n % 2 == 0 || n % 3 == 0 
#returns false if n is divisible by two or 3

    i = 5 
#defines i  starting value as 5
    while i * i <= n 
#while n is greater than or equal to 25
        return false if n % i == 0 || n % (i + 2) == 0 
#return false if n is divisible by 5 or 7
        i += 6 
#adds 6 to the value of i if n is not divisible by 5 or 7 and runs the loop again
    end    
    true 
#returns true for all numbers that arent divisible by 2, 3, 5, or 7
end
puts isPrime(17) #Output: true
puts isPrime(24) #Output: false
```

## Explanation

The Python implementation uses a function named `is_prime` that takes a single argument `num`. It returns `False` if the number is 1 or less or divisible by any number from two to half the value of `num` (i.e., when the remainder of the division of the number by 2 is zero), otherwise, it returns `True` and returns any possible other values as false.

The Ruby implementation uses a function named `isPrime` that also takes a single argument `n`. It returns `true` if the number is equivalent to 2 or 3 and if the number is not divisible by 2 or 3 and 5 or 7 if the number is over 25 and `false` if otherwise.

### Differences

1. **Syntax**: 
   - Python uses `True` and `False` for boolean values, while Ruby uses `true` and `false`.
   - The formatting for `if` statements are also different between the two. In Python, `if` statements have the initial statement and then on the next line the command to run if the variable falls under the `if` statement. In Ruby the formatting is completely different, the command comes first and after that the `if` statement comes in on the same line
   - In Python, a colon(`:`) is used to close function statements, whereas in Ruby there is nothing closing the function statements.
   - Ruby can return true or false without a return statement.  In contrast Python requires a return statement or will return with `None`.
   - Ruby has to be closed in `end` after loops or an error will appear and the code won't run. Python, on the other hand doesn't need anything and will return with `None` instead of an error if not given further instructions.
   - The syntax for calling functions and printing to the console/output is different. Python uses `print()`, while Ruby uses `puts()`.

<!-- Used code from geeksforgeeks.org to assist in creating assignment -->