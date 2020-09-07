public int sum13(int[] nums) {
  int sum = 0;
  
  if(nums.length == 1)
    return 0;
    
  for(int i = 0; i < nums.length; i++) {
    if(nums.length < 2 && nums[i] == 13)
      return 13;
    if(nums[i] != 13)
      sum += nums[i];
    else
      i ++;
  }
  return sum;
}