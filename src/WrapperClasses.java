
public class WrapperClasses {
    /**
     * The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
     *
     * From JDK - 1.0
     * int- Integer
     * float-Float
     * double-Double
     * long-LOng
     * char- Character
     * boolean-Boolean
     * byte - Byte
     *
     * //used in collections
     * 99.99% object oriented language
     */

    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("Before Wrap into int primitive DataType");
        System.out.println(i);
        System.out.println("After Converting into Integer");
        int ii = i.intValue();
        ii =i;
        System.out.println(ii);


        int j =20;

        System.out.println("Before Converting To Integer Wrapper Class");
        System.out.println(j);
        Integer jj = Integer.valueOf(j);
        jj=j;
        System.out.println("After Converting To Integer Wrapper Class");
        System.out.println(jj);




    }

}
