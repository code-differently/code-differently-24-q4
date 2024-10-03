```python 
number = int(input(Enter the number: "))

flag = false

for i in range (2, number):
    if (number % i ==0):
        flag = true
        break

if flag:
    print("Entered number {} is not a prime number".format(number))
else:
    print("Entered number {} is a prime number".format(number))       
```

```javascript
function isprime(n) {
    
    if (n <2)
        return `${n} is not a prime`

    for (let i = 2; i < n; i++) {
        if(n % i ===0 {
            return '${n} is not a prime number'
        }
    }
    return '${n} is a prime number'

}
## 
