import java.util.*;
class prime 
{
    public static void main(String args[])
    {
        int i,flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=obj.nextInt();
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(n==1)
        System.out.println("1 is neither a prime nor composite");
        else
        {
            if(flag==0)
            System.out.println(""+n+" is a prime number");
            else
            System.out.println(""+n+" is not a prime number");
        }
        
    }
}
