/*Say that a "clump" in an array is a series of 2 or more adjacent 
elements of the same value. Return the number of clumps in the given array.*/

public int countClumps(int[] nums) {
  int count = 0;
  boolean clump = false;
  
  for(int i = 0; i < nums.length-1; i++) {
    if(clump){
      if(nums[i] != nums[i+1])
        clump = false;
    }
    else if(nums[i] == nums[i+1]) {
      count ++;
      clump = true;
    }
  }
  return count;
}