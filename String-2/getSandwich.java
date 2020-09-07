/*A sandwich is two pieces of bread with something in between. Return the 
string that is between the first and last appearance of "bread" in the given 
string, or return the empty string "" if there are not two pieces of bread.*/

public String getSandwich(String str) {
  String result = "";
  int start = 0;
  int finish = 0;
  boolean found = false;
  
  if(str.length() <= 10)
    return "";
    
  for(int i = 0; i < str.length() - 4; i++) {
    if(str.substring(i, i+5).equals("bread") && found)
      finish = i;
    if(str.substring(i, i+5).equals("bread") && !found) {
      start = i + 5;
      found = true;
    }
  }  
  result = str.substring(start, finish);
  return result;
}