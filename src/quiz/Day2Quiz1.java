package quiz;

public class Day2Quiz1 {

        public static void main(String[] args) {
            BaseClass base = new Derived();
            base.display();
        }
    }

    class BaseClass {
        void display() {
            System.out.println("Derived");
        }
    }

    class Derived extends BaseClass {
        void display() {
            System.out.println("Base");
        }
    }


