import java.util.*;
class employee 
{
    String name ;
    int emp_num;
    long phone_num;
    void EnterDetails()  
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name :");
        name = obj.nextLine();  
       
        System.out.print("Enter Employee No :"); 
        emp_num = obj.nextInt();
        
        System.out.print("Enter Phone no :"); 
        phone_num = obj.nextLong();
    }
       
    void PrintDetails()
    {
        System.out.println("Details");
        System.out.println("Name : "+name);
        
        System.out.println("Employee No : "+emp_num); 

        System.out.println("Phone no : "+phone_num); 
    }

    public static void main(String[] args) 
    {
        int i;  
        employee obj[] = new employee[50];

        for(i=0;i<5;i++) 
        {  
            obj[i] = new employee();
            obj[i].EnterDetails(); 
        }
          
        for(i=0;i<5;i++) 
        {
            obj[i].PrintDetails();
        }
    }
}
