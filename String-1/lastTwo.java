/*Given a string of any length, return a new string where the
last 2 chars, if present, are swapped, so "coding" yields "codign".*/

public String lastTwo(String str) {
  int length = str.length();
  
  if(str.length() > 1)
    return str.substring(0,length-2) + str.charAt(length-1) + str.charAt(length-2);
  return str;
}