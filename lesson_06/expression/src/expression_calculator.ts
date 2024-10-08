export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */

  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    const sum = this.add(a, b);
    const product = this.multiply(sum, c);
    const exponent = this.pow(d, e);
    const result = this.divide(product, exponent);
    return result;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }

  add(a: number, b: number): number {
    return a + b;
  }

  multiply(a: number, b: number): number {
    return a * b;
  }

  divide(a: number, b: number): number {
    return a / b;
  }
}
