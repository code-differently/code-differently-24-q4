export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    const sum = this.add(a, b);
    const pro = this.mul(sum, c);
    const expo = this.pow(d, e);
    const quo = this.div(pro, expo);

    return quo;
  }

  add(a: number, b: number): number {
    const result = a + b;
    return result;
  }
  mul(a: number, b: number): number {
    const prod = a * b;
    return prod;
  }
  div(a: number, b: number): number {
    const quot = a / b;
    return quot;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}
