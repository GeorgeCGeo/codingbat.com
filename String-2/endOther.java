/*Given two strings, return true if either of the strings appears at the very end of the other string, 
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").*/

public boolean endOther(String a, String b) {
  if(a.toLowerCase().endsWith(b.toLowerCase()) || b.toLowerCase().endsWith(a.toLowerCase()))
    return true;
  return false;
}