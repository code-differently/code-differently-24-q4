# Finding whether a number is a <u><strong><em>prime</em></strong></u> number
## Challenges ##
* Use <u><strong>TWO</strong></u> different coding languages to accomplish. I will be using *Python* and *C#*
* Explain <u>similarities</u> and <u>differences</u> of the implementations.
## Python implementation
there is TWO ways in python that i have found; yeilding the same result.
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
print(is_prime(24))   # Output: True
print(is_prime(179))  # Output: False

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
Just like Python, there is TWO ways to write the code. These two methods mimic the way it is solved in Python.
```c#
// Method 1
using System;

public class Program
{
    public static void Main(string[] args)
    {
        // Example usage
        Console.WriteLine(IsPrime(24));   // Output: False
        Console.WriteLine(IsPrime(179));  // Output: False
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
            
            Console.WriteLine($"{IsPrime(24)}");
            Console.WriteLine($"{IsPrime(179)}");
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

