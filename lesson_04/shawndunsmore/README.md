## Java Method
```java

if (number <= 1){
    return false;
}

for (int i = 2; <= Math.sqrt(number); i ++){
    if (number % i == 0){
        return false;
    }
}

return true;

```

## Python Method
```Python
def is_prime(number):
    if number <= 1:
        return False

    for i in range(2, int(math.sqrt(number)) + 1):
        if number % i == 0:
            return False

    return True
```
## Explanation
    We start off with both methods making sure the input number is less then or equal to one. Then it redirects down to see if the number comes back as false. Once checked with i to see if the number can be divided by one its checked through with are % operator. Once are loop is complete if it tracks no false numbers then it'll return true.


## Differences
* Both functions are called differently (`java: system.out.print` `Python print`)

* Both languages import math differently (`java: import java.lang.Math`; `Python: import math`)
## Similarities
* Both languages use `math.sqrt` equally to find the square root of the number. (well if you wanna be technical "java" has it start with a capital M but come on man.)

* In both methods Java and Python still use if statements to make choices in the code.