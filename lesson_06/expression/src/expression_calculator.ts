export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    return this.mult(this.add(a, b), c) / this.pow(d, e);
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
  add(num1: number, num2: number): number {
    return num1 + num2;
  }
  mult(numA: number, numB: number): number {
    return numA * numB;
  }
}
