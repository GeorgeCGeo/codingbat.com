/*Given an array length 1 or more of ints, return the difference 
between the largest and smallest values in the array.*/

public int bigDiff(int[] nums) {
  Arrays.sort(nums);
  return nums[nums.length-1] - nums[0];  
}

//With Math class.
public int bigDiff(int[] nums) {
  int min = nums[0];
  int max = nums[0];
  
  for(int i = 0; i < nums.length; i++) {
    min = Math.min(nums[i], min);
    max = Math.max(nums[i], max);
  }
  return max-min;
}