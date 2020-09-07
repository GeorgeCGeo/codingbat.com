public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for(int i = 0; i < strings.length; i++) {
    char firstChar = strings[i].charAt(0);
    char lastChar = strings[i].charAt(strings[i].length()-1);
    
    map.put(String.valueOf(firstChar), String.valueOf(lastChar));
  }
  return map;
}

//Alternatively with substring.
public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for(int i = 0; i < strings.length; i++) {
    map.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1));
  }
  return map;
}
