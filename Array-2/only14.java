//Given an array of ints, return true if every element is a 1 or a 4.

public boolean only14(int[] nums) {
  boolean all = true;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 1 || nums[i] == 4)
      all = true;
    else {
      all = false;
      break;
    }
  }
  return all;
}