function isprime(n) {
  // if the output n is 2, it will be false 
    if (n <2)
        return false;
// i will be a number that will loop from 2 to the square root of n. 
    for (let i = 2; i <= Math.sqrt(n);i++) {
        if(n % i ===0) {
            return false;
        }
    }
    return true;

}

console.log(isprime(5))
