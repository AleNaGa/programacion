package com.company;

import java.util.Scanner;

public class Problemas1611 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("\nEjercicio 7");
        // La edad de una persona calcula el año de nacimiento y el horóscopo chino
        System.out.print("Introduce tu edad: ");
        int edad = scan.nextInt();
        int anoNac = 2023-edad;
        int calend = anoNac%12;
        System.out.println("Tu año de nacimiento es: " + anoNac);
        System.out.print("Tu horóscopo chino es: ");
        switch (calend){
            case 1: {
                System.out.println("conejo");
                break;
            }
            case 2: {
                System.out.println("tigre");
                break;
            }
            case 3: {
                System.out.println("buey");
                break;
            }
            case 4: {
                System.out.println("raton");
                break;
            }
            case 5: {
                System.out.println("cerdo");
                break;
            }
            case 6: {
                System.out.println("perro");
                break;
            }
            case 7: {
                System.out.println("gallo");
                break;
            }
            case 8: {
                System.out.println("mono");
                break;
            }
            case 9: {
                System.out.println("cabra");
                break;
            }
            case 10: {
                System.out.println("caballo");
                break;
            }
            case 11: {
                System.out.println("serpiente");
                break;
            }
            case 12: {
                System.out.println("dragon");
                break;
            }
            default:{
                System.out.println("no");
            }


        }
        */
        System.out.println("\n Ejercicio 2");
        char letra;
        int Z = 'Z';
        int A = 'A';
        int cont = Z;

        for (int i = 0; i<=Z - A ; i++) {
            System.out.println("");
            for (int j = cont; j >= A ; j--) {
                letra = (char) j;
                System.out.print(letra);
            }
            cont--;
        }


    }
}
