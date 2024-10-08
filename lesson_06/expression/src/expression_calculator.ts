export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    
    return (this.mult(this.add(a, b), c) / this.pow(d, e));
  }

  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
  add(num1: number, num2: number): number {
    return (num1 + num2);
  }
  mult(numA: number, numB: number): number {
    return (numA * numB);
  }
  
}
//div(mul(add(a,b),c),pow(d,e))
//calculate.add(arg1, arg2);
//this.calculate(div(mul(add(a,b),c),pow(d,e)))
//div(base: number, exponent: number, num1: number, num2: number, num3: number): number {
    //return div((mult(add(num1 + num2) * num3) / Math.pow(base, exponent)));
