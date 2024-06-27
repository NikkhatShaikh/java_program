package interviewPrograms;

import java.util.Scanner;

// note - if num1 > num2 or num2>num1  or num1 == num2
public class GreaterNumber {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        char ch;
        do{
            System.out.println("Enter First Number ");
            int Num1 = scanner.nextInt();

            System.out.println("Enter First Number ");
            int Num2 = scanner.nextInt();


            if(Num1>Num2){
                System.out.println("Greater Num  is "+Num1);
            } else if (Num2>Num1) {
                System.out.println("Greater Num  is "+Num2);
            }else {
                System.out.println("Num1 and Num2 Both Are Equal !!");
            }



            System.out.println("Do you want to continue Y/N ");
            ch=scanner.next().charAt(0);
        }while (ch=='y'||ch=='Y');
    }
}
