import java.io.*;
import java.util.*;
class file1
{
  public static void main(String args[]) throws Exception
   {
     FileInputStream fin = new FileInputStream("e1.txt");
     int i = 1;
     int ch;
     System.out.print(i+"_");
     while((ch=fin.read()) != -1)
     {
        System.out.print((char)ch);
        if (ch == '\n')
            System.out.print(++i + "_");
     }
     fin.close();
  }
}
