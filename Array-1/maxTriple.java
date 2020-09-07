/*Given an array of ints of odd length, look at the first, 
last, and middle values in the array and return the largest. 
The array length will be a least 1.*/

public int maxTriple(int[] nums) {
  int max = nums[0];
  if (nums[nums.length/2] > max)
    max = nums[nums.length/2];
  if(nums[nums.length-1] > max) {
    max = nums[nums.length-1];
  }
  return max;
}