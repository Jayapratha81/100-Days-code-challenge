// Longest Sub-array with sum K

import java.util.*;
class Solution
{
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int A[], int n, int K) 
    {
        //Complete the function
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < n; i++) 
        {
            sum += A[i];

            if (sum == K) 
            {
                maxLength = i + 1;
            }

            if (prefixSumMap.containsKey(sum - K)) 
            {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - K));
            }

            if (!prefixSumMap.containsKey(sum)) 
            {
                prefixSumMap.put(sum, i);
            }
        }
        return maxLength;
    }        
}
