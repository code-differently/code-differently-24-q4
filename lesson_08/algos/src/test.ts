function printPermutations(value: string, answer: string): void {
  if (value.length === 0) {
    console.log(answer);
    return;
  }

  for (let i = 0; i < value.length; i++) {
    const ch = value.charAt(i);
    const left = value.substring(0, i);
    const right = value.substring(i + 1);
    const rest = left + right;
    printPermutations(rest, answer + ch);
  }
}

function printPermutations(value: string, answer: string): void{
    if (value.length ===0){
        console.log(answer);
        return;
    }
    for (let i = 0; i < value.length; i++) {
        const ch = value.charAt(i);
        
    }

    }
}




function reverseString(input: string): string {
  if (input.length === 0) {
    return input;
  }

  const charArray = input.split('');

  for (let i = 0; i < charArray.length / 2; i++) {
    // Compute the corresponding index from the back of the string.
    const j = charArray.length - i - 1;
    swapCharacters(charArray, i, j);
  }

  return charArray.join('');
}
