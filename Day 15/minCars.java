
import java.util.*;
import java.lang.*;
import java.io.*;

class minCars
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int N=sc.nextInt();
		    if(N<=4)
		    System.out.println(1);
		    else if(N>4)
		    {
		        if(N%4==0)
		        System.out.println(N/4);
		        else 
		        System.out.println(N/4+1);
		    }
		}
	}
}
