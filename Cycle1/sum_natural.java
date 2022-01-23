import java.util.*;
class sum_natural
{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of natural numbers:");
        int n=obj.nextInt();
        for(i=0;i<n;i++)
            sum+=i;
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
    }
}
