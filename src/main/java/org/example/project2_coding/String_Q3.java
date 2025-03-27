package org.example.project2_coding;

public class String_Q3 {

    public static void main(String[] args) {

        // Reverse a string: write a function to reverse a given string. For example, given the input “hello” the output should be “olleH”
        String string = "Hello";

        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
