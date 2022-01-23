import java.util.*;
class pallindrome
{
    public static void main(String args[])
    {
        int orginal,rem,reverse=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        orginal=n;
        while(n!=0)
        {
            rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        if(reverse==orginal)
        System.out.println(+orginal+" is pallindrome");
        else
        System.out.println(+orginal+" is not pallindrome");
    }
}
