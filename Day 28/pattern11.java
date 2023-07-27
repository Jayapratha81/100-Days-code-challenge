import java.util.*;
class Solution {

    void printTriangle(int n) 
    {
        // code here
        int num;
        for(int i=1;i<=n;i++)
        {
            if(i%2==0)
            {
                num=0;
            }
            else
            {
                num=1;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num=1-num;
            }
            System.out.println();
        }
    }
}
