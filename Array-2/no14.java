//Given an array of ints, return true if it contains no 1's or it contains no 4's.

public boolean no14(int[] nums) {
  boolean found1 = false;
  boolean found4 = false;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1) 
      found1 = true;
    if(nums[i] == 4)
      found4 = true;
  }
  if(found1 && found4)
    return false;
  return true;
}