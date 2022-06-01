package thisKeyword;

/**
 * 2 - Used to invoked current class method
 *
 */
public class Person2 {
    int id=10;
    String name = "Shaikh Nikkhat";

    void m1(){
        System.out.println("in M1 Method");
    }
    public void details(){
        System.out.println(" id is = "+id+"  "+"Name is "+name);
    }


    void m2(){
        System.out.println("m2 method is called");
        this.m1();
    }
    void display(){
        this.details();

        String result = "70%";
        System.out.println(" score is "+result);
    }

    public static void main(String[] args) {
        Person2 p2 = new Person2();
        p2.display();
        p2.m2();
    }
}
