/*Given a string, take the first 2 chars and return the string with the 2 chars added 
at both the front and back, so "kitten" yields"kikittenki". 
If the string length is less than 2, use whatever chars are there.*/

public String front22(String str) {
  String firstChar;
  if(str.length() < 2)
    firstChar = str;
  else
    firstChar = str.substring(0,2);
  return firstChar + str + firstChar;
}