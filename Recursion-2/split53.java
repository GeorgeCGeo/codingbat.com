/*Given an array of ints, is it possible to divide the ints into two groups, 
so that the sum of the two groups is the same, with these constraints: all 
the values that are multiple of 5 must be in one group, and all the values 
that are a multiple of 3 (and not a multiple of 5) must be in the other. 
(No loops needed.)*/

public boolean split53(int[] nums) {
  return sidesAreEqual53(nums, 0, 0);
}

public boolean sidesAreEqual53(int[] nums, int i, int balance)
{
	if(i == nums.length)
		return (balance == 0);
	if(nums[i] % 5 == 0)
		return sidesAreEqual53(nums, i + 1, balance + nums[i]);
	if(nums[i] % 3 == 0)
		return sidesAreEqual53(nums, i + 1, balance - nums[i]);
	if(sidesAreEqual53(nums, i + 1, balance + nums[i]))
		return true;
	return sidesAreEqual53(nums, i + 1, balance - nums[i]);
}