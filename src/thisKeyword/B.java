package thisKeyword;
/**
* 5. used to pass as an argument in constructor call
 */
public class B {
    int i = 10;

    B(A1 a1){
        System.out.println("In class B constructor");
    }
}

class A1{
    int i = 20;

    A1(){
        B b = new B(this);
    }

    public static void main(String[] args) {
        A1 a = new A1();
    }
}
