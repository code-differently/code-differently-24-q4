class Lesson8 {
  run(): void {
    console.log("The permutations of 'abc' are:");
    Lesson8.printPermutations('abc', '');

    console.log();
    console.log("The reverse of 'abc' is: " + Lesson8.reverseString('abc'));
  }

  /**
   * Prints all the permutations of a string.
   *
   * @param value The string to permute.
   * @param answer The current permutation.
   */
  static printPermutations(value: string, answer: string): void {
    if (value.length === 0) {
      console.log(answer);
      return;
    }

    for (let i = 0; i < value.length; i++) {
      const ch = value.charAt(i);
      const left = value.substring(0, i);
      const right = value.substring(i + 1);
      const rest = left + right;
      Lesson8.printPermutations(rest, answer + ch);
    }
  }

  /**
   * Reverses a string by swapping the front half of the characters with the back half.
   *
   * @param input The string to reverse.
   * @return The reversed string.
   */
  static reverseString(input: string): string {
    if (input.length === 0) {
      return input;
    }

    const charArray = input.split('');

    for (let i = 0; i < charArray.length / 2; i++) {
      // Compute the corresponding index from the back of the string.
      const j = charArray.length - i - 1;
      Lesson8.swapCharacters(charArray, i, j);
    }

    return charArray.join('');
  }

  /**
   * Swaps the characters in the provided character array.
   *
   * @param charArray
   * @param i
   * @param j
   */
  private static swapCharacters(
    charArray: string[],
    i: number,
    j: number,
  ): void {
    const temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
  }
}

// Run the main method
const lesson = new Lesson8();
lesson.run();
