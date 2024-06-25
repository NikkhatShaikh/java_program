package interviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {

    static boolean isNumberPrime(int num) {

        int count=0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
            return true;
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter Number to check Prime ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        int count = 0;
        List<Integer> primeNumberList = new ArrayList<>();
        List<Integer> nonPrimeNumberList = new ArrayList<>();

        for (int i = 1; i <= userInput; i++) {
            if (isNumberPrime(i)) {
                primeNumberList.add(i);
            } else {
                nonPrimeNumberList.add(i);
            }
        }
            System.out.println("prime Number List "+primeNumberList);
            System.out.println(" Non prime Number List "+nonPrimeNumberList);

        }
    }





