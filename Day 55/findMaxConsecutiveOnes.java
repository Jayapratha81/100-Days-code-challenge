// Find Max Consecutive ones

import java.util.*;
class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int max = 0;
        int count = 0;
        for(int i = 0; i<nums.length ; i++)
        {
            if(nums[i] == 1 && i == nums.length - 1)
            {
                count++;
                if(count > max)
                {
                    max = count;
                }
            }
            else if(nums[i] == 1 && nums[i+1] == 0)
            {
                count++;
                if(count > max)
                {
                    max = count;
                }
                count = 0;
            }
            else if(nums[i] == 1 )
            {
                count++;
            }
        }
        return max;
    }
} 
