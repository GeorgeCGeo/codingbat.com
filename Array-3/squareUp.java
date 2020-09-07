/*Given n>=0, create an array length n*n with the following pattern, shown 
here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} 
(spaces added to show the 3 groups).*/

public int[] squareUp(int n) {
  int[] arr = new int[n*n];
  int pos = 0;
  
  for(int i = 1; i <= n; i ++) {
    pos = n*i - 1;
    for(int j = 1; j <= i; j++, pos--)
      arr[pos] = j;
  }
  return arr;
}