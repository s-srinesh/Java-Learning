/*public class Throw 
{
    public static void main(String[] args) 
    {   
        try{
            int a = 10;
            throw new Exception();

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
                System.out.println("hi iam fine");
        }
        }
    }*/


//example 2
import java.util.Scanner;
public class Throw 
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        try{
            int age  = sc.nextInt();
            if(age<1)
            {
                throw new ArithmeticException("age hould be greater than 10");
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
                System.out.println("hi iam fine");
        }
        }
    }

