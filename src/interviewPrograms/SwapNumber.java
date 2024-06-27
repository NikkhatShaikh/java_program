package interviewPrograms;

public class SwapNumber {
    public static void main(String[] args) {

        int a= 10, b=20, c=0;
        System.out.println("Before Swapping");
        System.out.println("a="+a+" b="+b);
//       b=a;       // b= 10
//       a=a+b;    // 10+10 = 20

        b=a;    // 10
        a=b+b;  //20

//       c=a;     //10
//       a=b;    //20
//       b=c;   //10

//        a=a+b;   //10+20  30
//        b=a-b;  //30-20   10
//        a=a-b; //30-10   20




        System.out.println("after Swapping");
        System.out.println("a="+a+" b="+b);




    }
}
