export function findPermutationDifference(s: string, t: string): number {
  const indexMap = new Map<string, number>();

  for (let i = 0; i < t.length; i++) {
    indexMap.set(t.charAt(i), i);
  }

  let result = 0;
  for (let i = 0; i < s.length; i++) {
    result += Math.abs(i - (indexMap.get(s.charAt(i)) ?? -1));
  }

  return result;
}