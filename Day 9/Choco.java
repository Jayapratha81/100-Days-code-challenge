
import java.util.*;
import java.lang.*;
import java.io.*;

class Choco
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,z,c,x,y;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    c=sc.nextInt();
		    x=sc.nextInt();
		    y=sc.nextInt();
		    z=c-x;
		    System.out.println(z*y);
		}
	}
}
