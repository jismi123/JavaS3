import java.util.*;
class trace_matrix
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i,j,r,c,sum=0;
        System.out.println("Enter the number of rows:");
        r=obj.nextInt();
        System.out.println("Enter the number of columns:");
        c=obj.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter the elements of matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=obj.nextInt();
            }
        }
        if(r==c)
        {
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    if(i==j)
                        sum=sum+a[i][j]; 
                }
            }
            System.out.println("Matrix is :");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
                
            System.out.println("Sum of diagonal elements = "+sum);
        }
        else
        {
            System.out.println("Matrix is not a square matrix");
        }
        
    }
}  
 
