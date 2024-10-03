## Javascript
``` javascript

function isPrime(num) {
  if (num < 2) {
    return false; // Numbers less than 2 are not prime
  }

  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false; 
    }
  }
  
  return true; 
}

console.log(isPrime(5)); //true
console.log(isPrime(1)); //false

```
## HTML 
``` html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manual Prime Number Checker</title>
</head>
<body>
    <h1>Prime Number Checker</h1>
    <form action="#" method="post">
        <label for="numberInput">Enter a number:</label>
        <input type="number" id="numberInput" name="numberInput" placeholder="Enter a number" required />
        <input type="submit" value="Check" />
    </form>

    <h2>List of Prime Numbers:</h2>
    <ul>
        <li>2</li>
        <li>3</li>
        <li>5</li>
        <li>7</li>
        <li>11</li>
        <li>13</li>
        <li>17</li>
        <li>19</li>
        <li>23</li>
        <li>29</li>
        <li>31</li>
        <li>37</li>
        <li>41</li>
        <li>43</li>
        <li>47</li>
        <li>53</li>
        <li>59</li>
        <li>61</li>
        <li>67</li>
        <li>71</li>
        <li>73</li>
        <li>79</li>
        <li>83</li>
        <li>89</li>
        <li>97</li>
    </ul>

    <h2>Result:</h2>
    <p>
        <!-- You can manually state whether a number is prime here based on user input -->
        To see if a number is prime, check the list above after submitting!
    </p>
</body>
</html>

```



## Explanation 

My JavaScript function checks if a number is prime by first returning `false` if the number is less than 2, since prime numbers are greater than 1. Then, it tests every number from 2 up to one less than the given number to see if any of them can divide it without leaving a remainder. If it finds one that can divide it evenly, it returns `false` ; if not, it returns `true`, meaning the number is prime.

My html implementation is your ‘we have mcdonalds at home’ type of function. Technically the code determines whether a number is a prime number, except it shows you the list and leaves it up to you as the user to check. 
Picture this page as if you're looking through a book that you consume the knowledge vs. technology that just gives it to you. 

###### 'Autonomy' in a way? Say the computer is independent in JS , while html it's influenced / gives the user control

