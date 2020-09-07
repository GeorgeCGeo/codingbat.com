/*Given an array of ints, is it possible to divide the ints into two groups, 
so that the sums of the two groups are the same. Every int must be in one group 
or the other. Write a recursive helper method that takes whatever arguments you like, 
and make the initial call to your recursive helper from splitArray(). (No loops needed.)*/

public boolean splitArray(int[] nums) {
  return sidesAreEqual(nums, 0, 0);
}

public boolean sidesAreEqual(int[] nums, int i, int balance)
{
	if(i == nums.length)
		return (balance == 0);
	if(sidesAreEqual(nums, i + 1, balance + nums[i]))
		return true;
	return sidesAreEqual(nums, i + 1, balance - nums[i]);
}