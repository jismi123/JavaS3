import java.util.*;
class factorial
{
    public static void main(String args[])
    {
        int i,factorial=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            factorial*=i;
        }
        System.out.println("The factorial of the number is "+factorial);
    }
}
