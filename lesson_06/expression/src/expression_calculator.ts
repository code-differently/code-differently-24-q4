export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    return this.divide(this.multiply(this.add(a, b), c), this.pow(d, e));
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
  add(addendA: number, addendB: number): number {
    return addendA + addendB;
  }
  divide(dividend: number, divisor: number): number {
    return dividend / divisor;
  }
  multiply(factorA: number, factorB: number): number {
    return factorA * factorB;
  }
}

//divide(multiply(add(a, b), c), pow(d, e))
