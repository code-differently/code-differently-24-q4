export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    const sum = this.add(a, b);
    const product = this.multiply(sum, c);
    const exp = this.pow(d, e);
    const quotient = this.divide(product, exp);
    return quotient;
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
