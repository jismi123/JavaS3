import java.util.*;
class replace_element 
{
    public static void main(String args[])
    {
        int i;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(i=0;i<n;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("Enter the element to be replaced:");
        int r=obj.nextInt();
        System.out.println("Enter new element:");
        int element=obj.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==r)
            {
                a[i]=element;
            }
        }
        System.out.println("New list of elements:");
        for(i=0;i<n;i++)
        {
            System.out.println(""+a[i]);
        }

    }
}
