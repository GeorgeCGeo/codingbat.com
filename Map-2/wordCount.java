/*The classic word-count algorithm: given an array of strings, 
return a Map<String, Integer> with a key for each different string, 
with the value the number of times that string appears in the array.*/

public Map<String, Integer> wordCount(String[] strings) {
  Map<String,Integer> map = new HashMap<String, Integer>();
  
  for(int i = 0; i < strings.length; i++) {
    if(map.containsKey(strings[i]))
      map.put(strings[i], map.get(strings[i]) + 1);
    else
      map.put(strings[i], 1);
  }
  return map;
}