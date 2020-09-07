/*Given an array of ints of odd length, return a new array length 3 
containing the elements from the middle of the array. 
The array length will be at least 3.*/

public int[] midThree(int[] nums) {
  int mPos = nums.length / 2;
  
  int[] arr = new int[3];
  arr[0] = nums[nums.length/2 -1];
  arr[1] = nums[nums.length/2];
  arr[2] = nums[nums.length/2 + 1];
  return arr;
}

//With for loop.
public int[] midThree(int[] nums) {
  int mPos = nums.length / 2;
  
  int[] arr = new int[3];
  for(int i = 0; i < 3; i++){
    arr[i] = nums[mPos-1+i];
  }
  return arr;
}