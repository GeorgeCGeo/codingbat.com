/*Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.*/

public int diff21(int n) {
  if(n<=21)
	return 21-n;
  return 2*(n-21);
}

//Using the Math.abs function

public int diff21(int n) {
  int dif = n-21;
  if(dif > 0)
    return (2*dif);
  return Math.abs(dif);
}