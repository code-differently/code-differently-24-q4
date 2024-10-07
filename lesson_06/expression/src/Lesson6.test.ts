import { ExpressionCalculator } from "./Lesson6.js";

describe("Lesson6Test", () => {
  let calculator: ExpressionCalculator;

  beforeEach(() => {
    calculator = new ExpressionCalculator();
  });

  test("testCalculate", () => {
    // Arrange
    const a = 1;
    const b = 2;
    const c = 3;
    const d = 4;
    const e = 5;
    const expected = ((a + b) * c) / Math.pow(d, e);

    // Act
    const actual = calculator.calculate(a, b, c, d, e);

    // Assert
    expect(actual).toBeCloseTo(expected);
  });

  test("testAdd_works", () => {
    // Act
    const result = (calculator as ICalculator).add(1, 2);

    // Assert
    expect(result).toBe(3);
  });

  test("testMultiply_works", () => {
    // Act
    const result = (calculator as ICalculator).multiply(1, 2);

    // Assert
    expect(result).toBe(2);
  });

  test("testDivide_works", () => {
    // Act
    const result = (calculator as ICalculator).divide(1, 2);

    // Assert
    expect(result).toBeCloseTo(0.5);
  });

  test("testPow_works", () => {
    // Act
    const result = (calculator as ICalculator).pow(2, 3);

    // Assert
    expect(result).toBe(8);
  });
});

interface ICalculator {
  calculate(a: number, b: number, c: number, d: number, e: number): number;
  add(a: number, b: number): number;
  multiply(a: number, b: number): number;
  divide(a: number, b: number): number;
  pow(base: number, exponent: number): number;
}
