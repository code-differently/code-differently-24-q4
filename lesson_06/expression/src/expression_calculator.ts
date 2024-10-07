export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    function addHere(a:number,b:number){
      const add = a + b;
    };

    function multiplyHere(addHere:number, c: number){
       const multi = addHere * c; 
    };

    function divideHere(d: number, e: number) {
        const divi = multiplyHere / d^e;
    };
 
    //For this assignment, you will need to implement the functions and logic required to calculate a mathematical expression.
    // After implementing the add, divide, and multiply functions, you will combine these functions to compute the final result.

    return (addHere * multiplyHere) / divideHere;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  } 
}

//npm run compile = update code
//npm start = check your code 
//npm run check = check it;