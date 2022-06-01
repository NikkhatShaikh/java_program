/**
 * Types of Variables
 *  1. local variable --> variables declared inside method body
 *  2. instance variable --> variables declared inside class but outside the method body
 *  3. static variable --> cannot be local,share among all the instance of class, memory allocation
 *                          happens only once when the class loaded in memory
 *
 */
public class Variables1 {
    int age = 30;
    static String name = "Nikkhat";

    /**static variable - same as instance but static keyword is used.
     * Global Var -Global Variable is declared with static in java.
     * Accessed using ClassName .
     */

    public  void marks(){
        int marks = 80;
        System.out.println(marks);
    }

    public void display(){

        System.out.println("Age is "+ " "+age+Variables1.name);
    }

    public static void main(String[] args) {
        String score = "80%";
        Variables1 obj = new Variables1();
        obj.display();
        obj.marks();
        System.out.println(score);
    }

}
