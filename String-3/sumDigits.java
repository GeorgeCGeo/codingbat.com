/*Given a string, return the sum of the digits 0-9 that appear in the string, 
ignoring all other characters. Return 0 if there are no digits in the string.*/

public int sumDigits(String str) {
  int sum = 0;
  int len = str.length();
  
  for(int i = 0; i < len; i++) {
    if(Character.isDigit(str.charAt(i))) {
      String s = String.valueOf(str.charAt(i));
      int num = Integer.parseInt(s);
      sum += num;
    }
  }
  return sum;
}