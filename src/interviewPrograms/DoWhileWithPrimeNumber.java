package interviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoWhileWithPrimeNumber {
    static boolean checkPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        List<Integer> primeNumberList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        char ch;
        do {

            System.out.println("Enter The Number to check prime :: ");
            int enteredNumber = sc.nextInt();

            for (int i = 1; i<= enteredNumber; i++) {
                if (checkPrime(i)) {
                    primeNumberList.add(i);
                }
            }

            System.out.println("prime number List " + primeNumberList);
            System.out.println("do You want to continue ?: Y/N ");
            ch = sc.next().charAt(0);

        }while (ch=='y' || ch=='Y');
        sc.close();
    }
}
