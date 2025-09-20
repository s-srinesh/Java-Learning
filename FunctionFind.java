/*import java.util.Scanner;

public class FunctionFind {
    void evenorodd(int num)
    {
        if(num%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        FunctionFind send = new FunctionFind();
        send.evenorodd(value); 
        
    }
    
}*/
import java.util.Scanner;

public class FunctionFind {
    void passorfail(int num)
    {
        if(num>35)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        FunctionFind send = new FunctionFind();
        send.passorfail(value); 
        
    }
    
}

