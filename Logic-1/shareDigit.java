/*Given two ints, each in the range 10..99, return true if there
is a digit that appears in both numbers, such as the 2 in 12 and 23.*/

public boolean shareDigit(int a, int b) {
  int firADig = a / 10;
  int secADig = a % 10;
  int firBDig = b / 10;
  int secBDig = b % 10;
  
  if(firADig == firBDig || firADig == secBDig || secADig == firBDig || secADig == secBDig)
    return true;
  return false;
}