public String startWord(String str, String word) {
  int sLength = str.length();
  int wLength = word.length();
  String s = "";
  
  if(sLength >= wLength) {
    s = str.substring(1,wLength);
    if(s.equals(word.substring(1)))
      return str.substring(0,wLength);
    else
      return "";
  }
  return "";
}

// Alternatively.
public String startWord(String str, String word) {
  int sLength = str.length();
  int wLength = word.length();
  
  if(sLength == 0)
    return "";
  if(sLength < wLength)
    return "";
  if(wLength == 1)
    return str.substring(0,1);
  else if(str.substring(1,wLength).equals(word.substring(1)))
    return str.substring(0, wLength);
  else
    return "";
}