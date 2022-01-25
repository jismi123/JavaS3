import java.util.*;
class perimeter_shapes
{
	public static void main(String args[])
	{ 
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of circle :");
       int r = obj.nextInt();
       
       System.out.print("Enter length and breadth of rectangle :");
       int l = obj.nextInt();
       int b = obj.nextInt();
       
       perimeter obj1 = new perimeter(r);
       obj1 = new perimeter(l,b);
    }
}

class perimeter
{
    perimeter(int radius)
    {
        double Perimeter = 3.14*2*radius;
        System.out.println("Perimeter of circle = "+Perimeter);
    }
    
    perimeter(int len,int breadth)
    {
        double Perimeter = 2*(len+breadth);
        System.out.println("Perimeter of rectangle = "+Perimeter);
    }
    
}
