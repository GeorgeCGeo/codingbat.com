/*Return true if the given string begins with "mix", 
except the 'm' can be anything, so "pix", "9ix" .. all count.*/

public boolean mixStart(String str) {
  return(str.length() >= 3 && str.substring(1,3).equals("ix"));
}

// Alternatively.
public boolean mixStart(String str) {
  if (str.length() < 3)
    return false;
  
  String suffix = str.substring(1,3);
  return (suffix.equals("ix"));
}