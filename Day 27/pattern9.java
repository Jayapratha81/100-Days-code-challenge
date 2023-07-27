class Solution {

    void printDiamond(int n) {
      
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
              System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
       
      
        
    }
}
