package org.example.project2_coding;

public class String_Q2 {

    public static void main(String[] args) {

        //Find out how many alpha characters are present in a String

        String string = "Hello World";
        int alphaChar = 0;

        for (int i = 0; i < string.length(); i ++){
            if (Character.isLetter(string.charAt(i))){
                alphaChar ++;
            }
        }

        System.out.println("The number of alphabetic characters:" + " " + alphaChar);
    }



}
