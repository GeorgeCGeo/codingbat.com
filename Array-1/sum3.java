//Given an array of ints length 3, return the sum of all the elements.

public int sum3(int[] nums) {
  return nums[0] + nums[1] + nums[2];
}

//With for-each loop.
public int sum3(int[] nums) {
  int sum = 0;
    for(int num : nums)
      sum = sum + num;
  return sum;
}