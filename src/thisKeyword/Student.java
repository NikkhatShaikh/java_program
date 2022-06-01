package thisKeyword;

/**
 * 3 - used To invoke Current Class Constructor
 */
public class Student {
    int rollNo;
    String name;

    Student(){
        this("nikkhat");
        System.out.println("Default Constructor");
    }
    Student(int rollNo){
        this();
        System.out.println("Roll no is "+rollNo);
    }

    Student(String name){
        System.out.println("Name is "+name);
    }

    public static void main(String[] args) {
        Student student = new Student(10);
        Student student1 = new Student("name");

    }

}
