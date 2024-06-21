package basics;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        List<Integer> primeNumberList = new ArrayList<>();
        List<Integer> nonPrimeNumberList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (isPrime(i)) {
                primeNumberList.add(i);
            } else {
                nonPrimeNumberList.add(i);
            }
        }

        System.out.println("Prime Numbers: " + primeNumberList);
        System.out.println("Non-Prime Numbers: " + nonPrimeNumberList);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
