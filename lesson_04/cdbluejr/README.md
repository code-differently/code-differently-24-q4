## Java implementation

        int num = 29;
        int count = 0;
        for(int i=1; i<=num; i++) {
            if(num % i ==0) {
                count++;
            }
        }
        if(count==2) {
            System.out.println("Prime");
        } else {
            System.out.println("not Prime");   


## Basic implementation

100 rem find prime number
110 n =1
120 c=0
130 i=1
140 if i<=n or (n mod i)<>0 then 300  
145 if i=n and c=2 then 200
150 c=c+1
160 if i>n then 210
170 goto 130

200 Print n + “Prime"
210 c=0
220 n=n+1
230 if c>n then 120
240 goto 130

300 i=i+1
310 goto 140

## Explanation

The java implementation uses the counting system to only count to 2, to signify a prime number.

The basic implementation also uses the counting system to only count to 2, to signify a prime number.

### Differences

1. **Syntax**: 
   - In Java, it uses the fuctions Modelo function to determine if the reminder is zero to determine if the number is divisable evenly.
   - Basic uses the if then else function to determine if the number is prime or not.

3. **Function Calls**:
   - The ability to print for both programs are different, java uses System.out.println, while BASIC just uses the word print.
   