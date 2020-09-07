/*Given 2 int arrays, a and b, return a new array length 2 containing, 
as much as will fit, the elements from a followed by the elements from b. 
The arrays may be any length, including 0, but there will be 2 or more 
elements available between the 2 arrays.*/

public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  
  if(a.length == 0) {
    arr[0] = b[0];
    arr[1] = b[1];
  }
  else if(a.length == 1) {
    arr[0] = a[0];
    arr[1] = b[0];
  }
  else {
    arr[0] = a[0];
    arr[1] = a[1];
  }
  return arr;
}

//With while loop.
public int[] make2(int[] a, int[] b) {
  int[] arr = new int[2];
  int count = 0;
  int i = 0;
  
  while(i < a.length && count < 2) {
    arr[count] = a[i];
    i ++;
    count++;
  }
  
  i = 0;
  while(i < b.length && count < 2) {
    arr[count] = b[i];
    i ++;
    count++;
  }
  return arr;
}