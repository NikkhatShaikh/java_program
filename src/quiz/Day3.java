package quiz;

public class Day3 {
        void fun(int n) {
            int i = 0;
            if (n > 1)
                fun(n - 1);
            for (i = 0; i < n; i++)
                System.out.print("* ");
        }
        public static void main(String[] a) {
            Day3 obj = new Day3();
            obj.fun(5);
        }
}
