export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    const add = this.add(a, b);
    const multiply = this.multiply(add, c);
    const divide = this.divide(multiply, this.pow(d, e));

    return divide;
  }

  add(num1: number, num2: number): number {
    return num1 + num2;
  }
  multiply(num1: number, num2: number): number {
    return num1 * num2;
  }
  divide(num1: number, num2: number): number {
    return num1 / num2;
  }
  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}
