package com.company;


public class ConstructorOverloading {
    int a,b;
    ConstructorOverloading(){
        this(10,20);
        System.out.println("inside first constructor");
    }
    ConstructorOverloading(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("inside second constructor");
    }

    public static void main(String[] args) {
        // write your code here
        ConstructorOverloading object=new ConstructorOverloading();
    }
}