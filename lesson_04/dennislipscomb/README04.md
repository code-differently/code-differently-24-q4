## Javascript
```Javascript

function isPrime (num) {
 /* first condtion is checking if 7 is less than or equal to 1. */ 
if (num <= 1) return false;
/*checking if the number has a remainder or 0 if divided 2 */
for (let i = 2; i < num; i++) {
if (num% i === 0)
return false;
}
return true;}


console.log(isPrime (7))
```

## Java
```Java

public class PrimeChecker {

    public static boolean isPrime(int num) {
        // First condition: check if num is less than or equal to 1
        if (num <= 1) return false;

        // Check for factors from 2 to num - 1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(11)); // Test the function
    }
}
```

## Explination

In javascript, the function "isPrime" is checking if the number is less than or equal to 1. if so the fuction will fail. If it passes it will run the next fuction to see if the input has a remainder of 0 if divided by 2.

In Java, the function "isPrime(int num)" is checking if the number is less than or equal to 1. if the number is indeed greater than or less than it will return false. if true the function will run through a for loop to determine if divided by 2 will the remainder be 0.


### Differences

Java and Javascript have numerous similarites but arent related. Java runs a more strict ruleset with certain elements such capital vs lower case letters where as javascript is more lenient in its functionality. In javascript the print out to test the fuction is console.log where as in Java the print out is system.out.println 


#### Citing

I got my Javascript code from a youtube video https://www.youtube.com/watch?v=ZdoiS_qUOSE I took that code and pasted it into https://playcode.io/ to test if the code worked. I had to make a few changes through trial and error. Once i got the correct code, i asked chatGPT to convert the javascript into java.

