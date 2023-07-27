import java.util.*;
class Solution {
    static String armstrongNumber(int n){
        // code here
        int rem;
        int temp=n;
        int sum=0;
        while(n>0)
        {
            rem=n%10;
            sum=(rem*rem*rem)+sum;
            n=n/10;
        }
        if(sum==temp)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}
