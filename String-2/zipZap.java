/*Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' 
and ending with 'p'. Return a string where for all such words, the middle letter is 
gone, so "zipXzap" yields "zpXzp".*/

public String zipZap(String str) {
  String result = "";
  
  for(int i = 0; i < str.length(); i++) {
    result += str.substring(i,i+1);
    if(i > 0 && i < str.length() - 1) {
      if(str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p')
        result = result.substring(0, result.length()-1);
    }
  }
  return result;
}