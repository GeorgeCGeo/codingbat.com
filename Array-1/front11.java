/*Given 2 int arrays, a and b, of any length, 
return a new array with the first element of each array. 
If either array is length 0, ignore that array.*/

public int[] front11(int[] a, int[] b) {
  if(a.length == 0 && b.length == 0) {
    return new int[0];
  }
  if(a.length == 0) {
    int[] arr = new int[] {b[0]};
    return arr;
  }
  if(b.length == 0) {
    int[] arr = new int[] {a[0]};
    return arr;
  }
  int[] arr = new int[] {a[0], b[0]};
  return arr;
}

public int[] front11(int[] a, int[] b) {
  int[] arr;
  
  if(a.length > 0 && b.length > 0) {
    arr = new int[] {a[0], b[0]};
    return arr;
  }
  else if(a.length > 0) {
    arr = new int[] {a[0]};
    return arr;
  }
  else if(b.length > 0) {
    arr = new int[] {b[0]};
    return arr;
  }
  return new int[0];
}