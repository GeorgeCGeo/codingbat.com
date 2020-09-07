/*Given a string and a non-empty substring sub, compute recursively 
the largest substring which starts and ends with sub and return its length.*/

public int strDist(String str, String sub) {
  int strLen = str.length();
  int subLen = sub.length();
  
  if(strLen < subLen)
    return 0;
  if(str.substring(0,subLen).equals(sub)){
    if(str.substring(strLen - subLen, strLen).equals(sub))
      return strLen;
    return strDist(str.substring(0, strLen-1), sub);
  }
  return strDist(str.substring(1), sub);
}