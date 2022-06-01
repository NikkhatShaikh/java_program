public class Variables {
     int rollId = 5;   //  Instant Variable

    static  int marks=300;  // Static variable - Global variable used for memory Management
    final String name = "Nikkhat";  // Constant variable - Can't be changed


    public static void main(String[] args) {
        Variables obj= new Variables();

         String name;        //varibele declaration

        int number = 100;   // local variable - declare & initialize

        System.out.println(number);   // print varaible
        System.out.println("Roll No "+obj.rollId+" "+" Name is "+obj.name +" "+"Marks Are "+ Variables.marks);   // static variable access using class name


    }
}
