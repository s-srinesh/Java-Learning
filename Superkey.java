/*class Animal
{
    int age = 18;

    Animal(String name) 
    {
        System.out.println(name);
    }
    void makesound()
    {
        System.out.println("i am srinesh");

    }
}
class Dog extends Animal
{
     Dog() 
    {
        super("monkey");
        System.out.println("i am dog");
        super.makesound();
        System.out.println(super.age);


    }
}


public class Superkey {
    public static void main(String[] args) 
    {
        Dog obj1 = new Dog();

        
    }
}*/
//example 2 

class Parent
{
    String name;
  

    Parent(String name) 
    {
        this.name = name;
    }
}


class Empoloye extends Parent
{

    Empoloye(String name)
    {
        super(name);
    }
    
}


public class Superkey {
    public static void main(String[] args) 
    {
        Empoloye obj1 = new Empoloye("srinesh");
        System.out.println(obj1.name);
    }
}


