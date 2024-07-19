package interviewPrograms;

public class Oprators {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        System.out.println( (a++)+1);  // 10+1=11 - value of a=10 will used first
        // post increment-value of the variable is used first, and then it is increased by one.
        System.out.println( (++b)+1); //1+10+1=12
        // pre increment-value of the variable is increased first and incremented by one then used.

        System.out.println("------------------------------");
        int x=5,y=5;
        System.out.println((x--)-1);
        System.out.println((--y)-1);
    }
}
