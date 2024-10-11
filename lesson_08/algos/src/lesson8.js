var Lesson8 = /** @class */ (function () {
  function Lesson8() {}
  Lesson8.prototype.run = function () {
    console.log("The permutations of 'abc' are:");
    Lesson8.printPermutations('abc', '');
    console.log();
    console.log("The reverse of 'abc' is: " + Lesson8.reverseString('abc'));
  };
  /**
   * Prints all the permutations of a string.
   *
   * @param value The string to permute.
   * @param answer The current permutation.
   */
  Lesson8.printPermutations = function (value, answer) {
    if (value.length === 0) {
      console.log(answer);
      return;
    }
    for (var i = 0; i < value.length; i++) {
      var ch = value.charAt(i);
      var left = value.substring(0, i);
      var right = value.substring(i + 1);
      var rest = left + right;
      Lesson8.printPermutations(rest, answer + ch);
    }
  };
  /**
   * Reverses a string by swapping the front half of the characters with the back half.
   *
   * @param input The string to reverse.
   * @return The reversed string.
   */
  Lesson8.reverseString = function (input) {
    if (input.length === 0) {
      return input;
    }
    var charArray = input.split('');
    for (var i = 0; i < charArray.length / 2; i++) {
      // Compute the corresponding index from the back of the string.
      var j = charArray.length - i - 1;
      Lesson8.swapCharacters(charArray, i, j);
    }
    return charArray.join('');
  };
  /**
   * Swaps the characters in the provided character array.
   *
   * @param charArray
   * @param i
   * @param j
   */
  Lesson8.swapCharacters = function (charArray, i, j) {
    var temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
  };
  return Lesson8;
})();
// Run the main method
var lesson = new Lesson8();
lesson.run();
