import java.util.Scanner;
import java.util.Arrays;
class Count
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    int[] array=new int[20];
	    for(int i=0; i<20; i++)  
	    {
	       array[i]=sc.nextInt();
	    }
	    
	    int j=0;
	   for(int i=1;i<=9;i++)
	    {
	        int r=0;
	        for(j=0;j<array.length;j++)
	      {
	        if(array[j]%i==0)
	        {
	            r++;
	        }
	      }
	     System.out.print(i+":"+r+",");
	    }
	}
}
