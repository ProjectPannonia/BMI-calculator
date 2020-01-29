package com.company;

import java.util.Scanner;

public class CalculateBMI {
    protected void getBMI() {
        System.out.println("Please enter your height in cm: ");
        int height = getHeight();
        System.out.println("Please enter your weight in kilogramm:");
        int weight = getWeight();
        double bmi = calculate(height,weight);
        System.out.println("Your BMI is: " + bmi);
    }
    private int getHeight() {
        Scanner sc = new Scanner(System.in);
        int height;
        do {
            height = sc.nextInt();
        } while (height <= 59 || height >= 250);
        return height;
    }

    private int getWeight() {
        Scanner sc = new Scanner(System.in);
        int weight;
        do {
            weight = sc.nextInt();
        } while (weight <= 10 || weight >= 350);
        return weight;
    }
    private double calculate(int height,int weight){
        double h = height;
        double w = weight;
        double heightPerHundred = h / 100.0;
        double heightPow = heightPerHundred*heightPerHundred;
        double bmi = w / heightPow;

        return bmi;
    }
}
