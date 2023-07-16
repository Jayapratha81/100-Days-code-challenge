import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n1=sc.nextInt();
		    int n2=sc.nextInt();
		    int n3=sc.nextInt();
		    int a[]=new int[]{n1,n2,n3};
		    Arrays.sort(a);
		    System.out.println(a[1]);
		}
		
	}
}
