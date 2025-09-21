/*class Sivakumar{
        int money=2000;
    }
//here we are using inhertence here for retrive data from sivakumar
//using extend

class Mohi extends  Sivakumar{

}

public class Inheritance{

    public static void main(String args[]) 
    {
        Mohi amt = new Mohi();
        System.out.println(amt.money);
    }
}*/


class Animal{
        void eat()
        {
            System.out.println("can eat fodd");
        }
    }

    //here we are using inhertence here for retrive data from sivakumar
     //using extend

class Dog extends Animal
{
    void bark()
    {
        System.out.println("bark");
    }

}

public class Inheritance
{
    public static void main(String[] args) 
    {
        Dog amt = new Dog();
        amt.bark();
        amt.eat();
    }
}



