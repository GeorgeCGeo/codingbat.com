/*Return a version of the given array where each zero value in the array
is replaced by the largest odd value to the right of the zero in the 
array. If there is no odd value to the right of the zero, leave the 
zero as a zero.*/

public int[] zeroMax(int[] nums) {
  int max = 0;
  
  for(int i = nums.length-1; i >= 0; i--) {
    if(nums[i] % 2 != 0)
      max = Math.max(max, nums[i]);
    if(nums[i] == 0)
      nums[i] = max;
  }
  return nums;
}