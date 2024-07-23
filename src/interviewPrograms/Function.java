package interviewPrograms;
import java.util.ArrayList;
import java.util.List;

public class Function {


    static List<Integer> number(int num){

        List<Integer> integers = new ArrayList<>();

        int increment = ++num;
        int reset = --num;
        int decrement = --num;
        integers.add(increment);
        integers.add(reset);
        integers.add(decrement);
        return integers;

    }

    public static void main(String[] args) {
        int num =5;
        List<Integer> number = number(num);
        System.out.println(" number "+number);
    }
}
