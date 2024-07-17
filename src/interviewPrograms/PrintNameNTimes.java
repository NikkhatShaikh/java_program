package interviewPrograms;

import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        int num=0;

        do {
            System.out.println("How Many Times You want to display Your Name? ");
            num=sc.nextInt();

            for (int i = 1; i <= num; i++) {
                System.out.println(i + " Nikkhat");
            }
            System.out.println("Do You want to continue ? Y/N ");
           ch= sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}
