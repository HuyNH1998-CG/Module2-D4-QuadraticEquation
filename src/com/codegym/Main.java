package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a");
        double a = input.nextDouble();
        System.out.println("Input B");
        double b = input.nextDouble();
        System.out.println("Input c");
        double c = input.nextDouble();

        QuadraEquation equation = new QuadraEquation(a, b, c);
        equation.getDiscriminant();
    }
}
