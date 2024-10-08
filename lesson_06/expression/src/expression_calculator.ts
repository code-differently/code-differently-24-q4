function add(a: number, b: number): number {
  return a + b;
}
function divide(a: number, b: number): number {
  return a / b;
}
function multiply(a: number, b: number): number {
  return a * b;
}
function pow(base: number, exponent: number): number {
  return Math.pow(base, exponent);
}
export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    let result = add(a, b);
    result = multiply(result, c);
    result = divide(result, pow(d, e));
      return result;
  }
}
