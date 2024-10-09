export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  add(a: number, b: number): number {
    return a + b;
  }
  divide(a: number, b: number): number {
    return a / b;
  }
  multiply(a: number, b: number): number {
    return a * b;
  }
  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.

    let result = this.add(a, b);
    result = this.multiply(result, c);
    result = this.divide(result, this.pow(d, e));
    return result;
  }
}
