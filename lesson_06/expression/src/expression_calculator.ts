export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    const add = caculateFormula(a ,b);
    const expo = d^e;
    const multi = add * c;
    const divi = multi / expo;

    const caculate = divi;

    //For this assignment, you will need to implement the functions and logic required to calculate a mathematical expression.
    // After implementing the add, divide, and multiply functions, you will combine these functions to compute the final result.

    return caculate;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  } 
}

//npm run compile = update code
//npm start = check your code 
//npm run check = check it;