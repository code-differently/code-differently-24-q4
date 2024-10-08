export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const divide = this.mult(this.add(a, b), c)/this.pow(d, e);
    return divide;
  }
  pow(base: number, exponent: number): number
  {
    const power = Math.pow(base, exponent);
    return power;
  }
  add(num1: number, num2: number): number
  {
    const adding = num1 + num2
    return adding;
  }
  mult(numA: number, numB: number): number
  {
    const multiply = numA * numB;
    return multiply
  }
}
//divide(multiply(add(a, b), c), pow(d, e))
