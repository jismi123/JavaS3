import java.util.*;
class fibonacci_series
{
    public static void main(String args[])
    {
        Scanner obj =new Scanner(System.in);
        int i,t1,t2,nextterm;
        t1=0;
        t2=1;
        System.out.println("Enter the number of n:");
        int n=obj.nextInt();
        System.out.println("The fibonacci series is:");
        System.out.println(+t1);
        System.out.println(+t2);
        for(i=3;i<=n;i++)
        {
            nextterm=t1+t2;
            System.out.println(+nextterm);
            t1=t2;
            t2=nextterm;

        }
    }
}
