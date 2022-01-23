import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        int num,rem,result=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a 3 digit number:");
        int n=obj.nextInt();
        num=n;
        while(num!=0)
        {
            rem=num%10;
            result+=(rem*rem*rem);
            num=num/10;
        }
        if(result==n)
        System.out.println(+n+" is an armstrong number");
        else
        System.out.println(+n+" is not an armstrong number");
    }
}
