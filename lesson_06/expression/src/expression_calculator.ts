export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const P = this.add(a, b);
    const E = this.pow(d, e);
    const M = this.mult(P, c);
    const D = this.div(M, E);
    return D;
    //const expression = this.mult(this.add(a, b), c) / this.pow(d, e);
    //return expression;
  }

  pow(base: number, exponent: number): number {
    const expo = Math.pow(base, exponent);
    return expo;
  }
  add(x: number, y: number): number {
    const addition = x + y;
    return addition;
  }
  mult(X: number, Y: number): number {
    const multiply = X * Y;
    return multiply;
  }
  div(x: number, y: number): number {
    const divide = x / y;
    return divide;
  }
}
