export function findPermutationDifference(s: string, t: string): number {
    let charPositionMap = new Map<string, number>();
  
    let totalDifference = 0;
  
    for (let sIndex = 0; sIndex < s.length; sIndex++) {
      charPositionMap.set(s.charAt(sIndex), sIndex)
    }
      
    for (let tIndex = 0; tIndex < t.length; tIndex++) {
      let indexInS = charPositionMap.get(t.charAt(tIndex));
    
      if (indexInS != undefined) {
        totalDifference += Math.abs(indexInS - tIndex);
      }
    }
  
    return totalDifference;
}
