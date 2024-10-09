export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    const sumOfNumber = this.add(a,b);
    const product = this.multiply(sumOfNumber,c);
    const exponent=this.pow(d,e);
    const quotient = this.divide(product, exponent);
    return quotient;
  }
  add(a: number, b: number): number {
     return a + b;
   }

   divide(a: number, b: number): number {
     return a / b;
   }

   multiply(a: number, b: number): number {
     return a * b;
   }




  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}
