package interviewPrograms;

import java.util.Scanner;
// Number %2 == even number
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter Number To check Even or Odd ");
            int number = sc.nextInt();
            if ( number% 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("Do You Want to continue Y/N ? ");
            ch=sc.next().charAt(0);
        }while (ch=='Y'||ch=='y');
    }
}
