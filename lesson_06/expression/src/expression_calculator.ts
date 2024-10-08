export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const adding = this.add(a,b);
    const multiply = this.mult(adding,c);
    const power = this.pow(d,e);
    const divide = multiply/power;
    return divide;
  }
  pow(base: number, exponent: number): number {
    const power = Math.pow(base, exponent);
    return power;
  }
  add(num1: number, num2: number): number {
    const adding = num1 + num2;
    return adding;
  }
  mult(numA: number, numB: number): number {
    const multiply = numA * numB;
    return multiply;
  }
}
//divide(multiply(add(a, b), c), pow(d, e))
