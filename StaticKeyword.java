class Student{
    // using static key to acess in staic class only

     static int age =20;
     static String teacher = "jvk";
     
     // creating function in static
    
     static void mahes()
     {
        System.out.println("HI GOOG MORNING");
     }
    
}
public class StaticKeyword {
    public static void main(String[] args) {
        // Calling or accesing satic key using class name
        Student.mahes();
        Student.age = 20;
        System.out.println(Student.age);
        
    }
    
}
