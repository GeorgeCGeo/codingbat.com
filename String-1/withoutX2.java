public String withoutX2(String str) {
  String s = "";
  
  for(int i = 0; i < str.length(); i++) {
    if(i == 0 && str.charAt(i) != 'x')
      s = s + str.charAt(i);
    else if(i == 1 && str.charAt(i) != 'x')
      s = s + str.charAt(i);
    else if(i > 1)
      s = s + str.charAt(i);
  }
  return s;
}

// Alternatively with StringBuilder.
public String withoutX2(String str) {
  int length = str.length();
  
  if (length >= 2) {
    StringBuilder sb = new StringBuilder(length);
    if(str.charAt(0) != 'x')
      sb.append(str.charAt(0));
    if(str.charAt(1) != 'x')
      sb.append(str.charAt(1));
    sb.append(str.substring(2));
    return sb.toString();
  }
  else if(length == 1 && str.charAt(0) == 'x')
    return "";
  else 
    return str;
}