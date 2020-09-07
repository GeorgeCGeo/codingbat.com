/*Given 2 non-negative ints, a and b, return their sum, 
so long as the sum has the same number of digits as a. 
If the sum has more digits than a, just return a without b.*/

public int sumLimit(int a, int b) {
  String aLen = String.valueOf(a);
  String sumLen = String.valueOf(a+b);
  
  if(aLen.length() == sumLen.length())
    return a+b;
  return a;
}