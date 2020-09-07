/*Given 2 strings, a and b, return the number of the positions 
where they contain the same length 2 substring. 
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
substrings appear in the same place in both strings.*/

public int stringMatch(String a, String b) {
  int lengthA = a.length();
  int lengthB = b.length();
  int minLength = Math.min(lengthA, lengthB);
  int count = 0;
  
  for (int i = 0; i < minLength - 1; i++) {
    String subA = a.substring(i, i+2);
    String subB = b.substring(i, i+2);
    if(subA.equals(subB))
      count ++;
  }
  return count;
}