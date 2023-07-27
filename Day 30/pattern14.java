class Solution {

    void printTriangle(int n) {
        for(char i='A'; i<'A'+n; i++)
        {
            for(char j='A'; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
