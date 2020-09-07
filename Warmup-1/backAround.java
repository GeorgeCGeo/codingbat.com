/*Given a string, take the last char and return a new string 
with the last char added at the front and back, so "cat" yields "tcatt". 
The original string will be length 1 or more.*/

public String backAround(String str) {
  String lastChar = str.substring(str.length()-1);		//Variation of the substring method: String substring(int beginIndex)
  return lastChar + str + lastChar;
}


//Alternatively
public String backAround(String str) {
  String lastChar = String.valueOf(str.charAt(str.length()-1));
  return lastChar + str + lastChar;
}