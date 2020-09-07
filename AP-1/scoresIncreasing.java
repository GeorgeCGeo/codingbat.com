/*Given an array of scores, return true if each score is 
equal or greater than the one before. The array will 
be length 2 or more.*/

public boolean scoresIncreasing(int[] scores) {
  boolean greater = false;
  for(int i = 0; i < scores.length-1; i++) {
    if(scores[i] <= scores[i+1])
      greater = true;
    else {
      greater = false;
      break;
    }
  }
  return greater;
}