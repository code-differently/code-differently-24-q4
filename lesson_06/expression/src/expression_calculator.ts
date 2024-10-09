export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const sum = this.add(a, b);
    const product = this.multiply(sum, c);
    const expo = this.pow(d, e);
    const quotion = this.divide(product, expo);
    return quotion;
  }
  // Implement your code here to return the correct value.
  // fuction called add a&b are numbers that will return a number
  add(a: number, b: number): number {
    return a + b;
  }
  multiply(a: number, b: number): number {
    return a * b;
  }
  divide(a: number, b: number): number {
    return a / b;
  }
  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}
