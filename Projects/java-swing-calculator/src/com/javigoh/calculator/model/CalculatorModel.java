package com.javigoh.calculator.model;

public class CalculatorModel {

    //Addition method of our calculator
    public double add(double a, double b) {
        return  a + b;
    }

    //Subtraction method of our calculator
    public double subtract(double a, double b) {
        return a - b;
    }

    //Multiplication method of our calculator
    public double multiply(double a, double b) {
        return a * b;
    }

    //Division method of our calculator
    public double division(double a, double b) {
        return a / b;
    }


    /*public static void main(String[] args) {
        CalculatorModel calculator = new CalculatorModel();

        System.out.println("Suma: " + calculator.add(8,7.5));
        System.out.println("Resta: " + calculator.subtract(10,5));
        System.out.println("Multiplicación: " + calculator.multiply(8,5));
        System.out.println("División: " + calculator.division(10,2));
    }*/
}


