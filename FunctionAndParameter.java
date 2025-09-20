public class FunctionAndParameter {
    void chocolate(int money)
    {
         System.out.println(money);

        System.out.println("purchased cho");
    }
    void snakes(int money)
    {
         System.out.println(money);
        System.out.println("purchased snakes");
    }

    public static void main(String[] args) {

        FunctionAndParameter call = new FunctionAndParameter();
        call.chocolate(40);
        call.snakes(30);
    }
    
    
}
