/*Given a string, return true if the first instance of "x" 
in the string is immediately followed by another "x".*/

boolean doubleX(String str) {
  int i = str.indexOf("x");
  
  if(i == -1) //The method indexOf() returns -1 if there no character at all.
    return false;
  
  if(i + 1 >= str.length()) //If the first instance of "x" is at the last digit.
    return false;
  
  return str.substring(i+1,i+2).equals("x");
}