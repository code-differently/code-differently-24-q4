# Finding whether a number is a <u><strong><em>prime</em></strong></u> number
## Challenges ##
* Use <u><strong>TWO</strong></u> different coding languages to accomplish. I will be using *Python* and *C#*
* Explain <u>similarities</u> and <u>differences</u> of the implementations.
## Python implementation
there is TWO ways in *Python* that i have found; yeilding the same result.
```python
# Method 1
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

# Example usage:
print(is_prime(24))   # Output: False
print(is_prime(179))  # Output: True
```
```python
# Method 2
def is_prime(n):
    """Check if a number is prime."""
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

print(is_prime(24))   # Output: False
print(is_prime(179))  # Output: True
```
## C# implementation
Just like *Python*, there is TWO ways to write the code. These two methods mimic the way it is solved in *Python* but using different numbers to test.
```c#
// Method 1
using System;

namespace test
{
    public class Test
    {
        public static void Main(string[] args)
        {
            // Example usage
            Console.WriteLine(IsPrime(199));   // Output: False
            Console.WriteLine(IsPrime(36));  // Output: True
        }

        public static bool IsPrime(int n)
        {
            if (n <= 1)
                return false;
            
            for (int i = 2; i <= Math.Sqrt(n); i++)
            {
                if (n % i == 0)
                    return false;
            }
            return true;
        }
    }
}
```
```c#
// Method 2
using System;

namespace test
{
    public class Test
    {
        public static void Main(string[] args)
        {
            
            Console.WriteLine($"{IsPrime(199)}");    // Output: False
            Console.WriteLine($"{IsPrime(36)}");   // Output: True
        }

        public static bool IsPrime(int n)
        {
            // Basic checks
            if (n <= 1) return false;
            if (n <= 3) return true;
            if (n % 2 == 0 || n % 3 == 0) return false;

            // Check for factors from 5 to sqrt(n)
            for (int i = 5; i * i <= n; i += 6)
            {
                if (n % i == 0 || n % (i + 2) == 0)
                    return false;
            }
            return true;
        }
    }
}
```
## Explanation

Both *Python* implementations uses a function named `is_prime` that takes a single argument `n`. It returns `True` if the number is a prime number, otherwise, it returns `False`. In the example I used `24` and `179` to test the outputs. When I used the `print()`function to output both numbers used in the `is_prime` function.The result was...
```python
False
True
```
The *C#* implementations use a function named `isPrime` that also takes a single argument `int n`. It returns `true` if the number is a prime number (using the same logic as the Python function in both methods) and `false` otherwise. In this example I used `199` and `36` to test the outputs. When I used the `Console.WriteLine($"{IsPrime()}");` fuction to print both function tests. 
The result was...
```c#
True
False
```
### Differences

 **Syntax & Function Calls**: 
   - In *Python*, functions are defined using the `def` keyword and use `print()` to display output in the terminal, whereas in *C#*, `public static bool` keyphrase is used to specifically make it a boolean then uses `Console.WriteLine();` to display output to the terminal. On top of that in *Python* you have to define the function `is_prime` before/above you can `print()` the result while in *C#* it is common practice to put the `Console.WriteLine();` above defining the function `IsPrime` and works normally.
   - There is a slight difference in uses of "or" syntax where *Python* uses `or` and *C#* uses `||`. Another small difference is that *Python* uses `:` and indentation to keep the code for the inside the function while *C#* uses `{}` to do the same. The indentation does not seem to matter on functionality but keeps the code organized if you do. One last difference is that *C#* ended its statements with `;` while *Python* does not have anything at the end of the statement.

 **Workspace Setup**:
   - I noticed in *Python* that you can make a document you can go straight into defining the function `is_prime` and testing it by calling with `print()` but C# setup needs `public static void Main(string[] args)` where it usually houses the `Console.WriteLine();` function that calls `IsPrime` within the `{}`. While `public static bool IsPrime()` houses the workspace for the function `IsPrime` itself within the `{}`.