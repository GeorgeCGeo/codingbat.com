/*Given a string, return a string made of the chars 
at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".*/

public String altPairs(String str) {
  int strLength = str.length();
  String newString = "";
  
  for(int i = 0; i < str.length(); i = i+4) {
    int strEnd = i + 2;
    if (strEnd > str.length())
      strEnd = str.length();
    newString = newString + str.substring(i, strEnd);
  }
 return newString;
}