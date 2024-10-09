export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const adding = this.add(a,b);
    const multiply = this.multiply(adding,c);
    const power = this.pow(d,e);
    const div = this.divide(multiply, power);
    return div;
  }
  pow(base: number, exponent: number): number {
    const power = Math.pow(base, exponent);
    return power;
  }
  add(num1: number, num2: number): number {
    const adding = num1 + num2;
    return adding;
  }
  multiply(numA: number, numB: number): number {
    const mult = numA * numB;
    return mult;
  }
  divide(intA: number, intB: number): number {
    const div = intA/intB;
    return div;
  }
}
//divide(multiply(add(a, b), c), pow(d, e))
