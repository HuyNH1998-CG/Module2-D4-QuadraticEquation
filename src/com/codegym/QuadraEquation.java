package com.codegym;
import java.util.Scanner;
public class QuadraEquation {
    private double a;
    private double b;
    private double c;
    double delta;
    Scanner input = new Scanner(System.in);
    public QuadraEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return this.a;
    }public double getB(){
        return this.b;
    }public double getC(){
        return this.c;
    }
    public void getDiscriminant() {

        delta = (this.b * this.b) - 4 * this.a * this.c;
        if (delta > 0) {
            System.out.println("Equation have 2 root " + ((-this.b + Math.sqrt(delta)) / (2 * this.a)) + " and " + ((-this.b - Math.sqrt(delta)) / (2 * this.a)));
        } else if (delta == 0) {
            System.out.println("Equation have 1 root " + (-this.b) / (2 * this.a));
        } else {
            System.out.println("Equation have no root");
        }
    }
}
