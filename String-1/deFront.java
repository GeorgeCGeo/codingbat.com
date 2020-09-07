public String deFront(String str) {    
  int length = str.length();
  String newString = "";
  
  if(length >= 2) {
    if(str.charAt(0) == 'a')
      newString = "a";
    if(str.charAt(1) == 'b') {
      newString = newString + str.substring(1);
      return newString;
    }
    if(!(str.charAt(0) == 'a') && (!(str.charAt(1) == 'b'))) {
      newString = newString + str.substring(2);
      return newString;
    }
    return newString + str.substring(2);
  }
  else if(length == 1 && str.charAt(0) == 'a')
    return "a";
  else
    return "";
}

// Alternatively with a for loop.
public String deFront(String str) {    
  int length = str.length();
  String temp = "";
  
  for(int i = 0; i < length; i++) {
    if(i == 0 && str.charAt(i) == 'a')
      temp = temp + "a";
    else if(i == 1 && str.charAt(i) == 'b')
      temp = temp + "b";
    else if (i > 1)
      temp = temp + str.charAt(i);
  }
  return temp;
}

// Alternatively with StringBuilder.
public String deFront(String str) {    
  int length = str.length();
  
  if(length >= 2) {
    StringBuilder strBuilder = new StringBuilder(length);
    
    if(str.charAt(0) == 'a')
      strBuilder.append('a');
    if(str.charAt(1) == 'b')
      strBuilder.append('b');
    strBuilder.append(str.substring(2));
    return strBuilder.toString();
  }
  
  if(length == 1 && str.charAt(0) == 'a')
    return "a";
    
  else 
    return str.substring(0,2);
}