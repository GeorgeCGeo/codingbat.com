/*Given two strings, append them together (known as "concatenation")
and return the result. However, if the strings are different lengths,
omit chars from the longer string so it is the same length as the 
shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.*/

public String minCat(String a, String b) {
  int aLength = a.length();
  int bLength = b.length();
  
  if(aLength > bLength)
    return a.substring(aLength-bLength) + b;
  if(aLength < bLength)
    return a + b.substring(bLength-aLength);
  return a+b;
}