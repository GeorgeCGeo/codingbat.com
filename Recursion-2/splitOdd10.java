/*Given an array of ints, is it possible to divide the ints into two groups, 
so that the sum of one group is a multiple of 10, and the sum of the other 
group is odd. Every int must be in one group or the other. Write a recursive 
helper method that takes whatever arguments you like, and make the initial 
call to your recursive helper from splitOdd10(). (No loops needed.)*/

public boolean splitOdd10(int[] nums) {
  return sidesAreOdd10(nums, 0, 0, 0);
}

public boolean sidesAreOdd10(int[] nums, int i, int group1, int group2)
{
	if(i == nums.length)
		return (group1 % 2 == 1 && group2 % 10 == 0 || group2 % 2 == 1 && group1 % 10 == 0);
	if(sidesAreOdd10(nums, i + 1, group1 + nums[i], group2))
		return true;
	return sidesAreOdd10(nums, i + 1, group1, group2 + nums[i]);
}