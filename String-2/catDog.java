// Return true if the string "cat" and "dog" appear the same number of times in the given string.

public boolean catDog(String str) {
  int cCount = 0;
  int dCount = 0;
  
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.substring(i, i+3).equals("cat"))
      cCount ++;
    if(str.substring(i, i+3).equals("dog"))
      dCount ++;
  }
  if (cCount == dCount)
    return true;
  return false;
}