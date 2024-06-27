package interviewPrograms;

import java.util.Scanner;

// Note - number is divisible by 5 or not
public class NumberDivisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do{
            System.out.println("Enter Number");
            int num = scanner.nextInt();

            System.out.println("Enter Divisor number ");
            int divisor = scanner.nextInt();

            if (num % divisor == 0) {
                System.out.println("Divisible");
            } else {
                System.out.println("Not Divisible");
            }

            System.out.println("Do You Want to continue Y/N ?");
            ch = scanner.next().charAt(0);

        }while (ch=='Y'||ch=='y');
    }
}
