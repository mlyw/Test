package com.sxh.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customer {


    private String username;


    public static void main(String[] args) {
        method();
    }

    public static void method(){

        String [] arr = {"a","b","c","d"};
        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
