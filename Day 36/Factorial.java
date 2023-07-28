import java.util.*;
class Solution
{
    static long factorial(int N){
        
        long fact = 1;
        for(int i=1;i<=N;i++)
        {
          fact = fact * i;
        }
        return fact;
       
    }
    
}
