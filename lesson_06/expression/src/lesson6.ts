import * as readline from "readline";
import { ExpressionCalculator } from "./expression_calculator.js";

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const askQuestion = (question: string): Promise<number> => {
  return new Promise((resolve) => {
    rl.question(question, (answer) => {
      resolve(parseInt(answer, 10));
    });
  });
};

const main = async () => {
  const a = await askQuestion("\nEnter a value for variable 'a': ");
  const b = await askQuestion("Enter a value for variable 'b': ");
  const c = await askQuestion("Enter a value for variable 'c': ");
  const d = await askQuestion("Enter a value for variable 'd': ");
  const e = await askQuestion("Enter a value for variable 'e': ");

  rl.close();

  console.log(
    `\nNow computing the value of ((${a} + ${b}) * ${c}) / ${d}^${e}`,
  );

  const calculator = new ExpressionCalculator();
  const result = calculator.calculate(a, b, c, d, e);

  console.log(`The result is: ${result}`);
};

main();
