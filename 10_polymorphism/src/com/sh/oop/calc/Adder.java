package com.sh.oop.calc;

public class Adder extends Calculator{

    public Adder(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public int calc() {
        return num1 + num2;
    }
}