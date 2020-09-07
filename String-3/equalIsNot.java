/*Given a string, return true if the number of appearances of "is" 
anywhere in the string is equal to the number of appearances of 
"not" anywhere in the string (case sensitive).*/

public boolean equalIsNot(String str) {
  int len = str.length();
  int is = 0;
  int not = 0;
  
  for(int i = 0; i < len; i++) {
    if(i < len - 2) {
      if(str.substring(i, i+3).equals("not"))
        not ++;
    }
    if(i < len-1) {
      if(str.substring(i, i+2).equals("is"))
        is ++;
    }
  }
  
  if(is == not)
    return true;
  else
    return false;
}