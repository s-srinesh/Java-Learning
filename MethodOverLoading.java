public class MethodOverLoading {
// In that we can use same function name but not parameter method it is call as method overloadig or function overloding.

    void display(int a ,int b)
    {
        System.out.println(a+b);
    }

    void display(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        {
            MethodOverLoading call = new MethodOverLoading();
            call.display(10, 20);
            call.display(10, 20,20);

        }
    }
}
