/*Given a non-empty array of ints, return a new array containing the elements from 
the original array that come after the last 4 in the original array. The original 
array will contain at least one 4.*/

public int[] post4(int[] nums) {
  int index = 0;
  
  for(int i = 0; i <nums.length; i++) {
    if(nums[i] == 4)
      index = i+1;
  }
  
  int[] arr = new int[nums.length - index];
  
  for(int j = 0; j < arr.length; j++)
    arr[j] = nums[index + j];
  
  return arr;
}