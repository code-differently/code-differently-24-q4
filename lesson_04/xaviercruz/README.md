## Java Implementation

```java

public static void main(String[] args){

    System.out.println(isEven(4)); // Output: true
    System.out.println(isEven(7)); // Output: false

}

public static boolean isEven(int number){
    return (number % 2 == 0);
}


```

## Python Implementation

```python

def is_even(number: int) -> int:
    return number % 2 == 0

print(is_even(4))  # Output: true
print(is_even(7))  # Output: false

```

## Explanation

The Java implementation uses a method called isEven that takes a single parameter called number. The method returns `True` if the number divided by 2 has a remainder of 0. If the quotient has a remainder of anything other than 0 the method returns `False`.

