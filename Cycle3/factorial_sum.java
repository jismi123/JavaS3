import java.util.*;
class factorial_sum
{
	public static void main(String args[])
	{ 
	  int n,m;
	  Scanner obj = new Scanner(System.in);
	  System.out.print("Enter the number whose factorial to be calculated : ");
	  m = obj.nextInt();
	  System.out.print("Enter the number whose sum of digits to be calculated :");
	  n = obj.nextInt();
	  
	  factorial_sum obj1= new factorial_sum();
	  obj1.Factorial(m);
	  obj1.SumofDigits(n);  
	 }
	 
	 void Factorial(int a)
	 {
	     int i,fact=1;
	     for (i=1;i<=a;i++)
	        fact = fact * i;
	     System.out.println("Factorial = "+fact);
	 }
	    
	 void SumofDigits(int a)   
	 {
	     int sum =0,rem;
	     while(a!=0)
	     {
	         rem = a%10;
	         sum = sum + rem;
	         a = a/10;
	     }
	 
	     System.out.println("Sum of digits = "+sum);
	 }
}
