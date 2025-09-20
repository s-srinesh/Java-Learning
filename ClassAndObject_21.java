public class ClassAndObject_21
{
    //template (or) we can acess or modify using object

    String name = "";
    String proc = "";
    int ram = 0;
    int price = 0;
    
    public static void main(String[] args) 
    {
        //creating obj

        ClassAndObject_21 lap1 = new ClassAndObject_21();
         lap1.name="hp";
         lap1.proc="i5";
         lap1.ram=8;
         lap1.price=4000;
        //2 object
        
        ClassAndObject_21 lap2= new ClassAndObject_21();
         lap2.name="asus";
         lap2.proc="i5";
         lap2.ram=8;
         lap2.price=5000;
         System.out.println(lap2.price);
        //3 object to acess
         ClassAndObject_21 lap3 = new ClassAndObject_21();
         System.out.println(lap3.price);

  

    }

    
}
