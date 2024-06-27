package interviewPrograms;

// 1-31, 2-28/29, 3-31, 4-30, 5-31, 6-30
// 7-31, 8-31, 9-30, 10-31, 11-30, 12-31

import java.util.Scanner;

public class PrintDaysInMonthBYSwitchCase {

    public static void main(String[] args) {
        Scanner scanner= new  Scanner(System.in);
        char ch;
        int month;
        do {
            System.out.println("Enter Month ");
            month=scanner.nextInt();

            switch (month){
                case 2:
                    System.out.println("28/29");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30");
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31");
                    break;
                default:
                    System.out.println("oops!!  You Entered Wrong Month ");
                    break;
            }

            System.out.println("Do You want To Continue Y/N ? ");
            ch = scanner.next().charAt(0);
        }while (ch =='Y'||ch=='y');
    }
}
