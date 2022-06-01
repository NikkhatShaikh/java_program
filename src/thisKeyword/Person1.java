package thisKeyword;

/**
 * this :
 *  - reference variable that refers to current class object
 *  Usage -:
 *  1. used to refer current class instance variable
 *  2. used to invoke current class method
 *  3. used to invoke current class constructor
 *  4. used to pass as an argument in the method
 *  5. used to pass as an argument in constructor call
 *  6. used to return current class instance
 *
 *  Note :
 *  this() must be first statement in constructor
 */
public class Person1 {
    // Used to refer current class instance variable

    int pId;    // instance variable
    String name;  // instance variable

    void setpId(int pId){   // local variable
        this.pId=pId;
    }

    void setName(String name){   // local variable
        this.name = name;
    }

    void show(){
        System.out.println(" Person Id= "+pId+" Name ="+name);
    }

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setpId(01);
        person1.setName("Nikkhat Shaikh");
        person1.show();
    }

}
