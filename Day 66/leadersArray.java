// Leaders in an Array

import java.util.*;
class Solution
{
  
    static ArrayList<Integer> leaders(int arr[], int n)
    {
       
        ArrayList<Integer> result = new ArrayList<>();
        int maxRight = arr[n - 1];
        result.add(maxRight);
        
        for (int i = n - 2; i >= 0; i--) 
        {
            if(arr[i] >= maxRight) 
            {
                maxRight = arr[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);
        
        return result;
    }
}
