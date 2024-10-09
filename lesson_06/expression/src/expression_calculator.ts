export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    return this.divide(this.multiply(this.add(a, b), c), this.pow(d, e));
  }

  add(a: number, b: number): number {
    return a + b;
  }

  multiply(value: number, c: number): number {
    return value * c;
  }

  divide(value: number, d: number): number {
    return value / d;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}
