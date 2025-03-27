package org.example.project2_coding;

import java.util.ArrayList;
import java.util.HashSet;

public class String_Q10_Arraylist {

    // how can you remove all duplicates from ArrayList

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(100);
        arrayList.add(30);
        arrayList.add(40);

        ArrayList<Integer> list = new ArrayList<>(new HashSet<>(arrayList));
        System.out.println(list);

    }
}
