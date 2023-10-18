// Best TIme to Buy and Sell Stock
// Maximum Profit

import java.util.*;
class Solution 
{
    public int maxProfit(int[] prices)
    {
        int lowestprice = Integer.MAX_VALUE;
        int maxprofit=0;
        int currentprofit=0;

        for(int i=0;i<prices.length;i++)
        {
           if(prices[i] < lowestprice)
            {
                lowestprice = prices[i];
            }
            currentprofit = prices[i] - lowestprice;

            if(maxprofit < currentprofit)
            {
               maxprofit = currentprofit;
            }         
        }
        return maxprofit;
    }
}
