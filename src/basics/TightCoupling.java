package basics;

/**
 * TightCouping - Classes are dependent on each other .
 * if we made changes in class B then have make changes in class A .
 *
 */

class TightCoupling {
    void print(){
        Topic obj=new Topic();    // here if we change method name in topic then have to change name in print method
         obj.understand();
    }

    public static void main(String[] args) {
TightCoupling obj = new TightCoupling();
obj.print();

    }

}

class Topic {

    public  void  understand(){

        System.out.println(" I Understand Mam ji !!!");

    }
}
