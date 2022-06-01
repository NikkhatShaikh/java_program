package basics;

// String Declare by using
//1- String Litral
//2- By New keyword

import java.util.Locale;

public class StringConstPool {
    public static void main(String[] args) {
        char ch[] ={'s','t','r','i','n','g'};
        String s2 = "String1"; // String Litral

        String s1 = new String(ch);
        String s3=new String("String By New KeyWord");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1+ " " +s3);
        System.out.println(s3.concat(s1));


//        String s1="java";//creating string by Java string literal
//        char ch[]={'s','t','r','i','n','g','s'};
//        String s2=new String(ch);//converting char array to string
//        String s3=new String("example");//creating Java string by new keyword
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

    }
}
