public int last2(String str) {
  if(str.length() < 2)
    return 0;
  
  String end = str.substring(str.length() - 2);
  int count = 0;
  
  for(int i = 0; i < str.length() - 1; i++) {
    String substr = str.substring(i,i+2);
    if(substr.equals(end))
      count ++;
  }
  
  return count-1; //The -1 is for the last substring. Alternatively in the for loop's 2nd condition we can write str.length() - 2.
}