
export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
   calculate(a: number, b: number, c: number, d: number, e: number): number {
   
   // add (a + b) calling the function
   const sum= this.add(a,b);
   // multiply sum * c calling the multiply fuuction
   const multiply = this.multiply(sum,c);
   // d to the power of e using pow
   const expo = this.pow(d,e);
   // dividing multiply total and expo
   const division = this.divide(multiply,expo);
 
   return division;
  
   
   }

   // add function
    add(a: number, b: number): number {
    return a + b;
  }
    // mutiply function
    multiply(a: number, b: number): number {
    return a * b;
  }
    // divide function
   divide(a: number, b: number): number {
    return a / b;
  }
   // expo function
  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }

  
}
