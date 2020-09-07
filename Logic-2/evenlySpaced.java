/*Given three ints, a b c, one of them is small, one is medium 
and one is large. Return true if the three values are evenly 
spaced, so the difference between small and medium is the same 
as the difference between medium and large.*/

public boolean evenlySpaced(int a, int b, int c) {
  int max = Math.max(Math.max(a,b), c);
  int min = Math.min(Math.min(a,b), c);
  int med = 0;
  
  if(max == a) {
    if(min == b)
      med =c;
    else 
      med = b;
  }
  
  if(max == b) {
    if(min == a)
      med = c;
    else
      med = a;
  }
  
  if(max == c) {
    if(min == a)
      med = b;
    else
      med = a;
  }
  
  return (max - med == med - min);
}

//With an array.
public boolean evenlySpaced(int a, int b, int c) {
  int[] arr = new int[] {a, b, c};
  
  Arrays.sort(arr);
  if(arr[2] - arr[1] == arr[1] - arr[0])
    return true;
  return false;
}