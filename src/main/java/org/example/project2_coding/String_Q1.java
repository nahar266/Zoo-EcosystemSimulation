package org.example.project2_coding;

public class String_Q1 {

    public static void main(String[] args) {

        // Write a program to swap 2 Strings without a temporary variable.

        String string1 = "Hello";
        String string2 = "World";

        System.out.println("String before swap:");
        System.out.println("string1" + " " + string1);
        System.out.println("string2" + " " + string2);

        string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());
        System.out.println("-------------------------------------");
;

        System.out.println("String after swap:");

        System.out.println("string1" + " " + string1);
        System.out.println("string2" + " " + string2);
    }




}
