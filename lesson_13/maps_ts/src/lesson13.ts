export function findPermutationDifference(s: string, t: string): number {
  const stringS = new Map<string, number>();
  const stringT = new Map<string, number>();
  let diffSum = 0;
  for (let i = 0; i < t.length; i++) {
    stringS.set(s.charAt(i), i);
    stringT.set(t.charAt(i), i);
  }
  for (const key of stringS.keys()) {
    if (stringT.has(key)) {
      const value1 = stringS.get(key)!; // Non-null assertion because we checked with has()
      const value2 = stringT.get(key)!; // Non-null assertion 
      const difference = Math.abs(value1 - value2);
      diffSum += difference;
    }
  }
  return diffSum;
}