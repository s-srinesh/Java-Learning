
/*import java.util.Scanner;

public class ExpectionHandling {
    public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     
     try{
        int a = sc.nextInt();
     }
     catch(Exception e)
     {
        System.out.println(e);

     }
     System.err.println("hi how are you");
    }
}*/

// we use multiple number of catch in this 

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpectionHandling {
    public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     
     try{
        int a = sc.nextInt();
        int b =10/0;
        }
     catch(InputMismatchException e)
     {
        System.out.println(e);

     }
     catch(Exception e){
        System.out.println(e);
     }
     System.out.println("hi how are you");
    }
}
