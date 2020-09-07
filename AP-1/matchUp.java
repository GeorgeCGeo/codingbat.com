/*Given 2 arrays that are the same length containing strings, compare the 1st 
string in one array to the 1st string in the other array, the 2nd to the 2nd 
and so on. Count the number of times that the 2 strings are non-empty and start 
with the same char. The strings may be any length, including 0.*/

public int matchUp(String[] a, String[] b) {
  int count = 0;
  
  for(int i = 0; i < a.length; i++) {
    String temp1 = a[i];
    String temp2 = b[i];
    if(!temp1.equals("") && !temp2.equals("")) {
      if(temp1.charAt(0) == temp2.charAt(0))
        count ++;
    }
  }
  return count;
}