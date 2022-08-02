import java.util.*;
import java.lang.*;
import java.io.*;

class Calculator
{
	public static void main (String[] args) 
	{
	   Scanner sc= new Scanner(System.in);
	    double a= sc.nextDouble();
	    double b= sc.nextDouble();
	   String t= sc.nextLine();
	   if(t =="+")
	    {
	      Add ad=new Add();
	      ad.add(a,b);
	    }
	     if(t == "-")
	    {
	      sub s=new sub();
	      s.subtract(a,b);
	    }
	     if(t =="*")
	    {
	      mul m=new mul();
	      m.multiplication(a,b);
	    }
	    if(t=="/")
	    {
	      div d=new div();
	      d.division(a,b);
	    }
	}
}
class Add
{
    public void add(double a,double b){
        System.out.println(a+b);
    }
}
class sub
{
    public void subtract(double a,double b){
        System.out.println(a-b);
    }
}
class mul
{
    public void multiplication(double a,double b){
        System.out.println(a*b);
    }
}
class div
{
    public void division(double a,double b){
        System.out.println(a/b);
    }
}