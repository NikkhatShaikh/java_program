package arrays;

import java.util.Arrays;

/**
 * 1- fixed in size - not growable in nature
 * 2- collection of  similar datatype
 * 3- not supported to any DATA Structure
 * 4 - so that don't have any predefined methods like - search , sort
 *
 * */
public class ArrayTest {
    public static void main(String[] args) {
        Student s[] = new Student[1000];
        s[0]= new Student("nikkhat","shaikh");
//        s[1]=new Customer();   not supported to different Data type

        Object object[] = new Object[10];  // overcome above problem using Object type
        object[0]= new Student("nikkhat","shaikh");
        object[1]= new Customer("technical client","pune");

    }
}

class Student{
    private String fName;
    private String lName;

    public Student() {
    }

    public Student(String fName,String lName){
        this.fName=fName;
        this.lName=lName;
    }
}

class Customer{
    private String cFirstName;
    private String addess;

    public Customer() {
    }

    public Customer(String cFirstName,String addess){
        this.cFirstName=cFirstName;
        this.addess=addess;
    }
}

