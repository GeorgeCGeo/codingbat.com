/*Given a string and a non-empty word string, return a string made of each char just 
before and just after every appearance of the word in the string. Ignore cases where 
there is no char before or after the word, and a char may be included twice if it is between two words.*/

public String wordEnds(String str, String word) {
  int sLen = str.length();
  int wLen = word.length();
  String result = "";
  
  for(int i = 0; i < sLen - wLen +1; i++) {
    if(i > 0 && str.substring(i,i+wLen).equals(word))
      result += str.substring(i-1,i);
    if (i < sLen-wLen && str.substring(i,i+wLen).equals(word))
      result += str.substring(i+wLen,i+wLen+1);
  }
  return result;
}