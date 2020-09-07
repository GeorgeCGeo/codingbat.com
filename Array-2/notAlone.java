/*We'll say that an element in an array is "alone" if there are values before and after it, 
and those values are different from it. Return a version of the given array where every 
instance of the given value which is alone is replaced by whichever value to its left or 
right is larger.*/

public int[] notAlone(int[] nums, int val) {
  int index = 0;
  
  for(int i = 0; i < nums.length-1; i++) {
    if(nums[i] == val)
      index = i;
    if(index != 0 && nums.length > 2) {
      if(nums[i-1] != val && nums[i+1] != val)
        nums[i] = Math.max(nums[i-1], nums[i+1]);
    }
  }
  return nums;
}