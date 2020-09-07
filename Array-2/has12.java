/*Given an array of ints, return true if there is a 1 in the array 
with a 2 somewhere later in the array.*/

public boolean has12(int[] nums) {
  boolean one = false;
  boolean two = false;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1)
      one = true;
    if(nums[i] == 2 && one)
      two = true;
  }
  if(one && two)
    return true;
  return false;
}