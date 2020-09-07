/*We'll say that 2 strings "match" if they are non-empty and 
their first chars are the same. Loop over and then return 
the given array of non-empty strings as follows: if a string 
matches an earlier string in the array, swap the 2 strings in 
the array. A particular first char can only cause 1 swap, so 
once a char has caused a swap, its later swaps are disabled. 
Using a map, this can be solved making just one pass over the 
array. More difficult than it looks.*/

public String[] firstSwap(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();

  for (int i = 0; i < strings.length; i++) {
    String key = String.valueOf(strings[i].charAt(0));
    if (map.containsKey(key)) {
      int value = map.get(key); 
      if(value == -1)
        continue;
      int pos = map.get(key);
      String temp   = strings[pos];
      strings[pos] = strings[i];
      strings[i]   = temp;
      
      map.put(key, -1);
    } 
    else
      map.put(key, i);
  }
  return strings;
}