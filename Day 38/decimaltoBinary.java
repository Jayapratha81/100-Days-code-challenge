// decimal to binary

class Solution{
	void toBinary(int N) {
		//Write your code here
	    int arr[]=new int[32];
	    int i=0;
	    
	    while(N>0)
	    {
	        int temp=N%2;
	        arr[i]=temp;
	        N=N/2;
	        i++;
	    }
	    for(int j=i-1;j>=0;j--)
	    {
	        System.out.print(arr[j]);
	    }
	}
}
