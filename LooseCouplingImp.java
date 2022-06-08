package javaprogram;


interface Student {
    void print();

}
 class Student1 implements Student {

     @Override
     public void print() {
         System.out.println(" I am in 10Th class");
     }
 }

 class Student2 implements Student{

     @Override
     public void print() {
         System.out.println(" I am in 12Th class sir ");
     }
 }

public class LooseCouplingImp {
    public static void main(String[] args) {
        Student studentRefVar = new Student2();
        studentRefVar.print();

    }

}