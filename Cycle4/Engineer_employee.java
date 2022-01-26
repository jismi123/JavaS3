class Employee
{
    void display()
    {
        System.out.println("Name of class is Employee");
    }

    void calcSalary()
    {
        System.out.println("Salary of the employee is Rs 10000");
    }
}

class Engineer extends Employee
{
    void calcSalary()  
    {
        super.calcSalary();
        System.out.println("Salary of the engineer is Rs 20000");
    } 

}

class Engineer_employee
{
    public static void main(String args[])
    {
        Engineer obj = new Engineer();
        obj.display();
        obj.calcSalary();
    }
}
