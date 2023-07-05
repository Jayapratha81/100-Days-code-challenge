/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class goodProgram
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n,x;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    n=sc.nextInt();
		    if(n%4==0 && n!=0)
		    {
		        System.out.println("Good");
		    }
		    else
		    {
		        System.out.println("Not Good");
		    }
		}
	}
}
