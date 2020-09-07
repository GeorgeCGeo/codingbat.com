/*Given a non-empty array of ints, return a new array containing the elements 
from the original array that come before the first 4 in the original array. 
The original array will contain at least one 4.*/

public int[] pre4(int[] nums) {
  boolean four = false;
  int index = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 4) {
      index = i;
      break;
    }
  }
  
  int[] arr = new int[index];
  for(int j = 0; j < index; j++) {
    arr[j] = nums[j];
  }
  return arr;
}