package interviewPrograms;
//1-static block execute while loading class file

//2- instance block and constructor are executed while creating object but
//      instance block executed before constructor

//3- instance block is common for all object.
public class StaticAndInstanceBlock {
    static {
        System.out.println("static block");// used to ex- DB connection
    }
// instance block crated with { }
    {
        System.out.println("instance block");
    }

    StaticAndInstanceBlock(){
        System.out.println("0 args constructor");
    }

    StaticAndInstanceBlock(int a){
        System.out.println("1 args constructor");
    }
    public static void main(String[] args) {

        //case1-  note run code without creating object - o/p - static block

        //case2- after creating s1 object-
        //    o/p static block, instance block, 0 args constructor - execute default constructor
        //  execute common instance block before constructor.

//        StaticAndInstanceBlock s1 = new StaticAndInstanceBlock(); //

        StaticAndInstanceBlock s2 = new StaticAndInstanceBlock(20);

        //case3 - after creating s2 with parameterized constructor
        //o/p- static block,instance block, 1 args constructor
    }
}
