package com.company;

import java.util.Scanner;

public class tablaDeVerdad {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //refuerzo

        boolean A = scan.nextBoolean();
        boolean B = scan.nextBoolean();
        boolean and = A&&B;
        boolean or = A||B;
        boolean notA = !A;
        boolean notB = !B;
        System.out.println("Tabla Not: " + A + " es " + notA);

        System.out.println("Tabla AND: " + A +" Y " + B + " es " + and);
        System.out.println("Tabla OR: " + A +" O " + B + " es " + or);

    }
}
