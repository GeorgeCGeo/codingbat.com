// Given a string, return true if the string starts with "hi" and false otherwise.

public boolean startHi(String str) {
  if(str.length() < 2)
    return false;
    
  String firstLetters = str.substring(0,2);
  
  if (firstLetters.equals("hi"))
    return true;
  return false;
}