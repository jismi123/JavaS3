import java.util.*;
class sum_array
{
    public static void main(String args[])
    {
        int i,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=obj.nextInt();
        int a[]=new int[20];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
          a[i]=obj.nextInt();

         }
         for(i=0;i<n;i++)
         {
            sum+=a[i];
         }
         System.out.println("Sum is "+sum);
        
    }
}
