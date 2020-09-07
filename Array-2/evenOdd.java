/*Return an array that contains the exact same numbers as the given array, 
but rearranged so that all the even numbers come before all the odd numbers. 
Other than that, the numbers can be in any order. You may modify and return 
the given array, or make a new array.*/

public int[] evenOdd(int[] nums) {
  int[] arr = new int[nums.length];
  int count = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      arr[count] = nums[i];
      count ++;
    }
  }
  for(int i = 0; i < arr.length; i++) {
    if(nums[i] % 2 != 0) {
      arr[count] = nums[i];
      count ++;
    }
  }
  return arr;
}