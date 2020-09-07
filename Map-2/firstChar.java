/*Given an array of non-empty strings, return a Map<String, String> 
with a key for every different first character seen, with the 
value of all the strings starting with that character appended 
together in the order they appear in the array.*/

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for(int i = 0; i < strings.length; i++) {
    String firstL = String.valueOf(strings[i].charAt(0));
    if(map.containsKey(firstL))
      map.put(firstL, map.get(firstL) + strings[i]);
    else
      map.put(firstL, strings[i]);
  }
  return map;
}