/*Given a string, return a new string made of every other char 
starting with the first, so "Hello" yields "Hlo".*/

public String stringBits(String str) {
  String newString = "";
  
  for(int i = 0; i < str.length(); i = i+2) {
    newString = newString + str.substring(i,i+1);
  }
  
  return newString;
}