/*Returns true if for every '*' (star) in the string, if there are chars both 
immediately before and after the star, they are the same.*/

public boolean sameStarChar(String str) {
  boolean found = true;
  
  for(int i = 0; i < str.length(); i++) {
    if(str.substring(i, i+1).equals("*") && i > 0 && i < str.length()-1) {
      if(str.charAt(i-1) == str.charAt(i+1))
        found = true;
      else
        found = false;
    }
  }
  return found;
}