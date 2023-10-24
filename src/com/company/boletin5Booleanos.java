package com.company;

import java.util.Scanner;

public class boletin5Booleanos {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        //1
        System.out.println("Dame 2 números enteros: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        boolean esMayor = (num2*2) <= num1;
        System.out.println("Ejercicio 1: ¿es " + num1 + " mayor que el doble de " + num2 + " ? " + esMayor);

        //2
        System.out.print("Introduce tu edad: ");
        int edad = scan.nextInt();
        boolean mayorDeEdad = edad >= 18;
        System.out.println("Ejercicio 2: ¿Es mayor de edad? " + mayorDeEdad);


        //3
        boolean menorDeEdad = edad < 18;
        System.out.println("Ejercicio 3: ¿Es menor de edad? " + menorDeEdad);

        //4
        System.out.print("Introduce un número para saber si es par o impar: ");
        int ej4 = scan.nextInt();
        boolean esPar = ej4%2 == 0;
        System.out.println("Ejercicio 4: ¿Es " + ej4 + " un número par? " + esPar);

        //5
        boolean esImpar = !esPar;
        System.out.println("Ejercicio 5: ¿Es " + ej4 + " un número impar? " + esImpar);


        //6
        System.out.print("Introduce un número para saber si está entre el 0 y el 100: ");
        int ej6 = scan.nextInt();
        boolean entre0y100 = ej6 >= 0 && ej6 <=100;
        System.out.println("Ejercicio 6: ¿está " + ej6 + " entre 0 y 100? " + entre0y100);

        //7
        System.out.print("Introduce un número para saber si es negativo e impar: ");
        int ej7 = scan.nextInt();
        boolean negativoEImpar = (ej7<0) && (ej7%2)!=0;
        System.out.println("Ejercicio 7: ¿es " + ej7 + " negativo e impar? " + negativoEImpar);

        //8
        System.out.print("Introduce un número para saber si es un 3, un 7 o un 9: ");
        int ej8 = scan.nextInt();
        boolean esIgual = ej8 == 3 || ej8 == 7 || ej8 == 9;
        System.out.println("Ejercicio 7: ¿es " + ej8 + " un 3 o un 7 o un 9? " + esIgual);

        //Tablas de Verdad
        System.out.print("booleano 1: ");
        boolean A = scan.nextBoolean();
        System.out.print("booleano 2: ");
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
