/*Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Example 1:
Input: [1,4,3,2]

Output: 4
Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
1) n is a positive integer, which is in the range of [1, 10000].
2) All the integers in the array will be in the range of [-10000, 10000].
*/
import java.util.Arrays;
class ArrayPartitionI {
	
	 public int arrayPairSum(int[] nums) {
	        
	        int maxSum = 0;
	        Arrays.sort(nums);
	        if(nums.length == 1)
	        {
	            return 1;
	        }
	        else if(nums.length == 2)
	        {
	            return Math.min(nums[0],nums[1]);
	        }
	        for(int i = nums.length - 1, j = 0 ,k=1; k <= nums.length/2; j = j+2 ,k++)
	        {
	            maxSum = maxSum + Math.min(nums[i-j],nums[i-j-1]);
	            
	        }
	        
	        return maxSum;
	        
	    }

	
}
