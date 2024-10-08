export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    let divide = this.multiply(this.add(a, b), c) / this.pow(d, e)
    return divide;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }

  add(a: number, b: number){
    let sum = a + b;
    return sum;
  }

  divide(a: number, b: number){
    let sum = a / b;
    return sum;
  }

  multiply(a: number, b: number){
    let sum = a * b;
    return sum;
  }
  
  }