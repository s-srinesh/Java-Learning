interface Animal{
    int mark = 18;
    void sound();
    //does not create a body in interface
}
//for acess we are using implements
class Cat implements Animal
{
public void sound()
    {   
        System.out.println("meow");
    }

} 
public class Interface {
    public static void main(String[] args) {
        // we does not create object to interface
        // we can acess throung another class and implements to retrive and creating aboject to another class
        Cat a1 = new Cat();
        a1.sound();
        System.out.println(a1.mark);
    }
    
}
