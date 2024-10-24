export function findPermutationDifference(s: string, t: string): number {
  const stringS = new Map<string, number>();
  for (let i = 0; i < s.length; i++) {
    stringS.set(s.charAt(i), i);
  }

  const stringT = new Map<string, number>();
  for (let i = 0; i < t.length; i++) {
    stringT.set(t.charAt(i), i);
  }

  return compareMaps(stringS, stringT);
}

function compareMaps(map1: Map<string, number>, map2: Map<string, number>): number {
  let diffSum = 0;
  for (const key of map1.keys()) {
    if (map2.has(key)) {
      // eslint-disable-next-line @typescript-eslint/no-non-null-assertion
      const value1 = map1.get(key)!; // Non-null assertion because we checked with has()
      // eslint-disable-next-line @typescript-eslint/no-non-null-assertion
      const value2 = map2.get(key)!; // Non-null assertion
      const difference = Math.abs(value1 - value2);
      diffSum += difference;
    }
  }
  return diffSum;
}