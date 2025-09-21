public class Constuctor {

    int marks;
    String name;

    Constuctor() 
    {
        System.out.println("hello");
    } 

    Constuctor(int a, String b) 
    {
        marks = a;
        name = b;
    }

    

    public static void main(String[] args) {
        Constuctor obj1 = new Constuctor(32,"sri");
        System.out.println(obj1.marks);
        Constuctor obj2 = new Constuctor();

    }
}
