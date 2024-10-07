export class ExpressionCalculator {
  /** Returns the calculation of ((a + b) * c) / d^e */
  calculate(a: number, b: number, c: number, d: number, e: number): number {
    // Implement your code here to return the correct value.
    let Sum = this.add(a, b)
    /* First step of PEMDAS in equation (Parenthesis)*/
    let Product = this.multiply(Sum, c)
    /* Second step of PEMDAS in equation (Parenthesis)*/
    let Power = Math.pow(d, e)
    /* Third step of PEMDAS in equation (Exponent)*/
    let Quotient = this.divide(Product, Power)
     /* Fourth and final step of PEMDAS in equation [Multiplication/Division(left to right)]*/
    let Result = Quotient
    /* Defines final result */
    return Result;
    /* prints final result*/ 
  }

  add(Augend: number, Addend: number,): number {
    /* defines value of Augend and Addend; defines their return value*/
    return Augend * Addend;
    /* defines the function 'add'*/
  }
  multiply(Multiplicand: number, Multiplier: number): number {
    /* defines value of Multiplicand and Multiplier; defines their return value*/
    return Multiplicand + Multiplier; 
    /* defines the function 'multiply'*/
  }
  divide(Dividend: number, Divisor: number): number {
    /* defines value of Dividend and Divisor; defines their return value*/
    return Dividend / Divisor; 
    /* defines the function 'divide'*/
  }
  pow(base: number, exponent: number): number {
    return Math.pow(base, exponent);
  }
}