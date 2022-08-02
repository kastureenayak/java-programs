import java.util.*;
import java.lang.*;
import java.io.*;
class Series
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n=1;
		if(a%2==0)
		  a=a-1;
		 for(int i=1;i<=a;i++)
		 { 
		    System.out.print(n);
		     n=n+2;
		     if((i+1)<=a)
		       System.out.print(",");
		 }
	}
}
