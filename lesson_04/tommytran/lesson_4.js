   
    //declare integers in function: sample numbers
    let a = 1;
    let b = 9;
    let c = 17;
{    
function Prime(n) {
    if (n < 2) {
        return false; // Numbers less than 2 are not prime
    }
    if (n === 2) {
        return true; // 2 is the only even prime number
    }
    if (n % 2 === 0) {
        return false; // numbers divisible by 2 are not prime
    }
    // loop that checks every odd number up until square root of n
    for (let i = 3; i <= Math.sqrt(n);i +=2) {
        if (n % i === 0) {
            return false; // n is divisible by i, so it's not prime 
        }
    }
    return true; // n is prime
}
//return string of whether or not int is a prime number
console.log(`Is ${a} a prime number? ${Prime(a)}`);
console.log(`Is ${b} a prime number? ${Prime(b)}`);
console.log(`Is ${c} a prime number? ${Prime(c)}`);
}