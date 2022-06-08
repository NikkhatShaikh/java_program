package javaprogram;

public class SubString {
    public static void main(String[] args) {
        String name = "ShaikhNikkhat";

        // USing Strt & end Position
        System.out.println(name.substring(6,12));

        // Index start from 0 location 6 & 13 index is excluded
        //subString function - (6,12) - 6 is start position 12 is end position

        // Using only Start index Position
        System.out.println(name.substring(6));

        // SUBSTRING EXAMPLE 2

        String s1 = "ZoyaShaikh";

        String subString = s1.substring(4);
        System.out.println(subString);

        String sirName= s1.substring(4,10);
        System.out.println(sirName);


    }
}
