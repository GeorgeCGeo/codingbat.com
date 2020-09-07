/*Return an array that is "left shifted" by one -- so {6, 2, 5, 3} 
returns {2, 5, 3, 6}. You may modify and return the given array,*/
or return a new array.

public int[] shiftLeft(int[] nums) {
  int[] arr = new int[nums.length]; 
  
  if(nums.length == 1)
    return nums;
  
  for(int i = 0 ; i < nums.length-1; i++) {
    if(i > 0)
      arr[i] = nums[i+1];
  }
  if(nums.length > 1) {
    arr[0] = nums[1];
    arr[nums.length-1] = nums[0];
  }
  return arr;
}