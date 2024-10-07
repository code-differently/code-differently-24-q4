import type { Calculator } from "./calculator.js";
import { ExpressionCalculator } from "./expression_calculator.js";

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
    const result = (calculator as Calculator).add(1, 2);

    // Assert
    expect(result).toBe(3);
  });

  test("testMultiply_works", () => {
    // Act
    const result = (calculator as Calculator).multiply(1, 2);

    // Assert
    expect(result).toBe(2);
  });

  test("testDivide_works", () => {
    // Act
    const result = (calculator as Calculator).divide(1, 2);

    // Assert
    expect(result).toBeCloseTo(0.5);
  });

  test("testPow_works", () => {
    // Act
    const result = (calculator as Calculator).pow(2, 3);

    // Assert
    expect(result).toBe(8);
  });
});
