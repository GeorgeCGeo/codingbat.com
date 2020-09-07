/*Given two arrays of ints sorted in increasing order, outer and inner, return true if 
all of the numbers in inner appear in outer. The best solution makes only a single 
"linear" pass of both arrays, taking advantage of the fact that both arrays are already 
in sorted order.*/

public boolean linearIn(int[] outer, int[] inner) {
  int outIndex = 0;
  int inIndex = 0;
  
  while(outIndex < outer.length && inIndex < inner.length) {
    if(outer[outIndex] == inner[inIndex]) {
      outIndex ++;
      inIndex ++;
    }
    else
      outIndex ++;
  }
  if(inIndex == inner.length)
    return true;
  return false;
}