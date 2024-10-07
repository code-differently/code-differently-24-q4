export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.

    const add = a + b;
    const multiply = add * c;
    const divide = multiply / this.pow(d, e);

    return divide;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}

/**(a + b) * c) / this.pow(d, e) */
