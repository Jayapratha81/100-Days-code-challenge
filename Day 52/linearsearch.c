//Linear Search

#include <stdio.h>

int main(void) {
	// your code goes here
	int T;
	scanf("%d",&T);
	while(T--)
	{
	    int N;
	    scanf("%d",&N);
	    int A[N];
	   
	    for(int i=0;i<N;i++)
	    {
	        scanf("%d",&A[i]);
	    }
	    int X;
	    scanf("%d",&X);
	    int found=0;
	    for(int i=0;i<N;i++)
	    {
	       if(A[i]==X)
	       {
	           found=1;
	           break;
	       }
	      
	    }
	    if(found)
	    {
	        printf("YES\n");
	    }
	    else
	    {
	        printf("NO\n");
	    }
	
	}
	return 0;
}

