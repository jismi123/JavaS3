import java.util.*;
class area_shapes
{
   public static void main(String args[])
   { 
       Scanner obj = new Scanner(System.in);
       System.out.print("Enter radius of circle :");
       double r = obj.nextDouble();
       
       System.out.println("Enter length and breadth of rectangle :");
       double l = obj.nextDouble();
       double b = obj.nextDouble();
       
       System.out.println("Enter base and height of triangle :");
       float base = obj.nextFloat();
       float h = obj.nextFloat();
       
       shapes obj1 = new shapes();
       obj1.area(r);
       obj1.area(l,b);
       obj1.area(base,h);
    }
}

class shapes
{
    void area(double rad)
    {
        double Area = 3.14*rad*rad;
        System.out.println("Area of circle = "+Area);
    }
    
    void area(double len,double breadth)
    {
        double Area = len*breadth;
        System.out.println("Area of rectangle = "+Area);
    }
    
    void area(float base,float height)
    {
        double Area = (height*base)/2;
        System.out.println("Area of triangle = "+Area);
    }
}

