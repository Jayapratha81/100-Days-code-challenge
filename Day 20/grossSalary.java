import java.util.*;
import java.lang.*;
import java.io.*;

class grossSalary
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int t =sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		    int b =sc.nextInt();
		    double hr=0,da=0,result=0;
		   
		    if(b < 1500) 
		    {
		        hr = b * 0.1;
		        da = b*0.9;
		    }
		    else 
		    {
		       hr = 500;
		       da = b*0.98;
		    }
		    
		    result = b + hr + da;
		    
		  System.out.println(result);
		}
	}
}
