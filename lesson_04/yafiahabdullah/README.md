## Javascript isPrimeNumber

```javascript
function isPrimeNumber(number){
    let result = "not prime number";
        if(number <= 1){
        return result;
    }
    let n = 0;
    for(let i = 2; i < number; i++ ){
        if(number % i == 0){
        n= n+1;
        }
    }
    if(n === 2 ){
    result = "prime number";
    }else{
        result = "not prime number";
    }
}
# Example usage:
console.log(isPrimeNumber(4))  # Output: false
console.log(isPrimeNumber(7))  # Output: true
```

## Explanation

    Javascript implemenation I start with 

## Java isPrimeNumber implementation

```java
public class PrimeChecker {
 public static String isPrimeNumber(int number) {
   if (number <= 1) {
    return "not prime number";
  }
    for (int i = 2; i < number ; i++) {
        if (number % i == 0) {
        return "not prime number";
        }
  }
  return "prime number";
 }
}
# Example usage:
console.log(isPrimeNumber(4))  # Output: false
console.log(isPrimeNumber(7))  # Output: true
```



## Explanation

    Javascript implemenation