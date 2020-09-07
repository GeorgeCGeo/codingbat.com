/*Given an array of ints, return true if the array contains either 
3 even or 3 odd values all next to each other.*/

public boolean modThree(int[] nums) {
  int odd = 0;
  int even = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      even ++;
      if(odd < 3)
        odd = 0;
    }
    else {
      odd ++;
      if(even < 3)
        even = 0;
    }
  }
  
  if(even == 3 || odd == 3)
    return true;
  return false;
}