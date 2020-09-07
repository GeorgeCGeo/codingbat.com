/*Given a string, return the length of the largest "block" in the string. 
A block is a run of adjacent chars that are the same.*/

public int maxBlock(String str) {
  int len = str.length();
  int count = 1;
  int max = 0;
  
  if(len == 0)
    return 0;
  
  for(int i = 0; i < len-1; i++) {
    if(str.charAt(i) == str.charAt(i+1))
      count++;
    else
      count = 1;
    if(max < count)
      max = count;
  }
  return max;
}