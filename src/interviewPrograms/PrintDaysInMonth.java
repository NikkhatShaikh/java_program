package interviewPrograms;

// - input  1 - 12

import java.util.Scanner;

// 1-31, 2-28/29, 3-31, 4-30, 5-31, 6-30
// 7-31, 8-31, 9-30, 10-31, 11-30, 12-31
public class PrintDaysInMonth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        char ch;

        do{
            System.out.println("Enter Month in Number ");
            int month = scanner.nextInt();

            if(month==2){
                System.out.println("20/29");
            } else if (month==4||month==6||month==9||month==11) {
                System.out.println("30");
            }else {
                System.out.println("31");
            }

            System.out.println("Do You Want To Check More Y/N ?");
            ch=scanner.next().charAt(0);
        }while (ch=='Y'||ch=='y');
    }
}
