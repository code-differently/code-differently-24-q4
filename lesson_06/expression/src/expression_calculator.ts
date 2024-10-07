export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.

    return this.divide(this.multiply(this.add(a, b), c), this.pow(d, e));
  }

  add(a: number, b: number): number {
    return a + b;
  }

  multiply(add: number, c: number): number {
    return add * c;
  }

  divide(multiply: number, d: number): number {
    return multiply / d;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}

/*      onst add = a + b;
        const multiply = add * c;
        const divide = multiply / this.pow(d, e);*/
/**     (a + b) * c) / this.pow(d, e) */
