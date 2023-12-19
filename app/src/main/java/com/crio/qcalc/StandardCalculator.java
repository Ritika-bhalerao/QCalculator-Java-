package com.crio.qcalc;

public class StandardCalculator {

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

    private int result;



    public void add(int num1, int num2) {
        result = num1 + num2;
        //setResult(result);
        printResult();
    }


    public void subtract(int num1, int num2) {
        result = num1 - num2;
        //setResult(result);
        printResult();
    }


    public void multiply(int num1, int num2) {
        result = num1 * num2;
        //setResult(result);
        printResult();
    }


    public void divide(int num1, int num2) {
        result = num1 / num2;
        //setResult(result);
        printResult();
    }

    public int getResult() {
        return this.result;
        
    }




    public void clearResult() {

        result = 0;

    }


    public void printResult() {

        System.out.println("Standard Calculator Result:" + getResult());

    }




}
