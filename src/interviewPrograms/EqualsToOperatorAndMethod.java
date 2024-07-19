package interviewPrograms;

/**
 *NOte:
 * == return true - if the object are same.
 * .equals() - method return true - if the content of the object is same.
 *
 */

public class EqualsToOperatorAndMethod {
    public static void main(String[] args) {
        String str1 ="Nikkhat";
        String str2= "Nikkhat";
        String str3= new String("Nikkhat");

        System.out.println("str1 ==str2: "+(str1==str2));  // true   st1 & str2 - object are same
        System.out.println("str1.equals(str2): "+str1.equals(str2)); // true - content of str1 and str2- are same
        System.out.println("st1==str3: "+(str1==str3)); //false str1 and str3 object are different
        System.out.println("str1.equals(str3): "+str1.equals(str3)); //true   str1 and str3 content are same


    }
}
