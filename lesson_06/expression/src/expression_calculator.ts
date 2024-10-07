
export class ExpressionCalculator{
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    const additionResult : number = this.add(a, b);
    const multiplyResult : number = this.multiply(additionResult, c);
    const exponentResult : number = this.pow(d, e);
    const finalResult : number = this.divide(multiplyResult,exponentResult);
    return finalResult;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }

  add(firstNumber: number, secondNumber: number): number{
     return firstNumber + secondNumber;
  }
  multiply(firstNumber: number, secondNumber: number): number{
     return firstNumber * secondNumber;
  }

  divide(firstNumber: number, secondNumber: number): number{
     return firstNumber / secondNumber;
  }

}
