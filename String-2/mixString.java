/*Given two strings, a and b, create a bigger string 
made of the first char of a, the first char of b, the 
second char of a, the second char of b, and so on. Any 
leftover chars go at the end of the result.*/

public String mixString(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  int max = Math.max(aLen, bLen);
  String result = "";
  
  for(int i = 0; i < max; i++) {
    if(i < aLen)
      result = result + a.charAt(i);
    if(i < bLen)
      result = result + b.charAt(i);
  }
  return result;
}