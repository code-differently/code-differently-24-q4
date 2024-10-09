export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.

    // Caculate addition with an add function '(a + b)'
    const originalSum = this.add(a, b);
    // caculate multiplication '(add * c)'
    const MultiplyMySum = this.multiply(originalSum, c);
    //Specify the exponent 'd^e'
    const myExponent = this.pow(d, e);
    // caculate division 'multiply / exponent'
    const DivideSum = this.divide(MultiplyMySum, myExponent);
    // needs caculate it all...
    const calculate = DivideSum;
    return calculate;

  }

  add(x: number, y: number) {
    return x + y;
  }

  multiply(x: number, y: number) {
    return x * y;
  }

  divide(x: number, y: number) {
    return x / y;
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}

