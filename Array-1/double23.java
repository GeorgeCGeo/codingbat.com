public boolean double23(int[] nums) {
  if(nums.length < 2)
    return false;
  if(nums[0] == 2 && nums[1] == 2 ||nums[0] == 3 && nums[1] == 3)
    return true;
  return false;
}

//With a for loop.
public boolean double23(int[] nums) {
  int count2 = 0;
  int count3 = 0;
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] == 2)
      count2 ++;
    if(nums[i] == 3)
      count3 ++;
  }
  if (count2 > 1 || count3 > 1)
    return true;
  return false;
}