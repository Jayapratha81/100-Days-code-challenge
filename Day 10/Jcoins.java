
import java.util.*;
import java.lang.*;
import java.io.*;

class Jcoins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,x,y;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    x=sc.nextInt();
		    y=sc.nextInt();
		    System.out.println(x*10+y*5);
		}
	}
}
