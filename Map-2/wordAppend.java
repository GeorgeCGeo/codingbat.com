/*Loop over the given array of strings to build a result string like this: 
when a string appears the 2nd, 4th, 6th, etc. time in the array, append 
the string to the result. Return the empty string if no string appears a 2nd time.*/

public String wordAppend(String[] strings) {
  Map<String,Integer> map = new HashMap<String,Integer>();
  int count = 0;
  String newString = "";
    
  for(int i = 0; i < strings.length; i++) {
    if(map.containsKey(strings[i])) {
      count = map.get(strings[i]) + 1;
      if(count % 2 == 0)
        newString = newString + strings[i];
      map.put(strings[i], count);
    }
    else
      map.put(strings[i], 1);
  }
  return newString;
}