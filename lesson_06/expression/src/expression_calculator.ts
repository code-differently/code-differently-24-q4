export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    return this.mult(this.add(a, b), c) / this.pow(d, e);
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
  add(x: number, y: number): number {
    return x + y;
  }
  mult(X: number, Y: number): number {
    return X * Y;
  }
}
