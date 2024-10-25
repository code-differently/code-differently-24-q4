
export function findPermutationDifference(s: string, t: string): number {
  const map = new Map<string,number>();
    for (let i = 0; i < s.length; i++) {
      map.set(s.charAt(i), i);
    }
    let permDifferences = 0;
    for (const key of map.keys()) {
      const indexInT = t.indexOf(String(key));
       permDifferences += Math.abs(s.indexOf(key) - indexInT);
    }
    return permDifferences;
  }

