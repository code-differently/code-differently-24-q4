export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const add = this.add(a, b);
    const multiply = this.multiply(add, c);
    const pow = this.pow(d, e);
    const total = this.divide(multiply, pow);
    return total;
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
  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}
