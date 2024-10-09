export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const sum = this.add(a, b);
    const product = this.multiply(sum, c);
    const expo = this.pow(d, e);
    // Implement your code here to return the correct value.
    return this.divide(product, expo);
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
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
}
