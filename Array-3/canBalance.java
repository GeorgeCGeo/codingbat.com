/*Given a non-empty array, return true if there is a place to split the array so 
that the sum of the numbers on one side is equal to the sum of the numbers on 
the other side.*/

public boolean canBalance(int[] nums) {
  for(int i = 0; i < nums.length; i++) {
    int sum = 0;
    for(int j = 0; j < i; j++)
      sum += nums[j];
    for(int k = i; k < nums.length; k++)
      sum -= nums[k];
    if(sum == 0)
      return true;
  }
  return false;
}