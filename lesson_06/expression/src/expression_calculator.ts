export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const addition = this.add(a, b);
    const multi = this.multiply(addition, c);
    const exponent = this.pow(d, e);
    const division = this.divide(multi, exponent);
    const mytotal = division;
    return mytotal;
  }
  // Implement your code here to return the correct value.
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
