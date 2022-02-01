package com.company;

public class Main {

    Main(String str){

        System.out.println(str);
        //Main[] objectReference;
        // System.out.println(objectReference);
    }

    public static void main(String[] args) {
        // write your code here
        Main m=new Main("hello");

        Main[] objectReference=new Main[3];
        objectReference[0]=new Main("hi");
        System.out.println(objectReference[0]);
    }
}