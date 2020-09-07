/*We'll say that a "triple" in a string is a char appearing three times in a row. 
Return the number of triples in the given string. The triples may overlap.*/

public int countTriple(String str) {
  int count = 0;
  int len = str.length();
  
  for(int i = 0; i < len - 2; i++) {
    if(str.charAt(i) == str.charAt(i+1) && str.charAt(i) == str.charAt(i+2))
      count ++;
  }
  return count;
}