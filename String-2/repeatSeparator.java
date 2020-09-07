/*Given two strings, word and a separator sep, return a big string made 
of count occurrences of the word, separated by the separator string.*/

public String repeatSeparator(String word, String sep, int count) {
  String result = word;
  
  if(count > 0) {
    for(int i = 0; i  < count - 1; i++) 
      result += sep + word;
    return result;
  }
  return sep;
}