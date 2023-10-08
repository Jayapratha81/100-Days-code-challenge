// Union of Two Sorted Arrays

import java.util.*;
class Solution 
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) 
    {
        ArrayList<Integer> unionList = new ArrayList<>();
        int i = 0, j = 0;
      
        while (i < n && j < m)
        {
            if (arr1[i] < arr2[j])
            {
                if (i == 0 || arr1[i] != arr1[i - 1]) 
                {
                    unionList.add(arr1[i]);
                }
                i++;
            }
            else if (arr1[i] > arr2[j]) 
            {
                if (j == 0 || arr2[j] != arr2[j - 1])
                {
                    unionList.add(arr2[j]);
                }
                j++;
            } 
            else 
            {
                if ((i == 0 || arr1[i] != arr1[i - 1]) && (j == 0 || arr2[j] != arr2[j - 1])) 
                {
                    unionList.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) 
        {
            if (i == 0 || arr1[i] != arr1[i - 1])
            {
                unionList.add(arr1[i]);
            }
            i++;
        }

        while (j < m)
          {
            if (j == 0 || arr2[j] != arr2[j - 1]) 
            {
                unionList.add(arr2[j]);
            }
            j++;
        }

        return unionList;
    }
}
