package com.codewithphencharaud;

public class Main {

    public static void main(String[] args) {
	Adder a = new Adder();

        System.out.println("My superclass is: "+ a.getClass().getSuperclass().getName());
    }
}

class Arithmetic {
    public int add (int a, int b){
        return a + b;
    }
}

class Adder extends Arithmetic {
public int callAdder(int a, int b){
    return add(a,b);
}

}