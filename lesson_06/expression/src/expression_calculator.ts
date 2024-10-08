export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.

    //PEMDAS order -> expected : //((a + b) * c) / d^e
    // Caculate addition with an add function '(a + b)'
      const originalSum =  this.add(a,b);
    // caculate multiplication '(add * c)' and  'd^e' so d * (e times)
      const MultiplyMySum = this.multiply(originalSum, c)
    // caculate division with divide function which is different variables of the multiplication values '(add * c)' and  'd^e' so d * (e times)
      const FinalResult = this.divide(MultiplyMySum, d ^ e);
    // needs caculate something...

    return FinalResult;
  }

  add(x: number , y: number){
    return x + y;
  }

   multiply(x: number , y: number){
    return x * y;
  }

   divide(x: number, y: number){
    return x / y;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  } 
}

//npm run compile = update code
//npm start = check your code 
//npm run check = check it;