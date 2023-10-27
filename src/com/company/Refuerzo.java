package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Refuerzo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //1
        System.out.println("\n Ejercicio 1");
        System.out.print("Dime tu nombre: ");
        String nombre = scan.next();
        for (int i = 0; i < 10; i++) {
            System.out.println("Hola " + nombre);
        }


        //2
        System.out.println("\n Ejercicio 2");
        System.out.print("Errores: ");
        int error = scan.nextInt();
        for (int i = 0; i < error; i++) {
            System.out.println("ERROR");
        }

        //3
        System.out.println("\n Ejercicio 3");
        System.out.print("Introduce la contraseña numérica de 4 dígitos: ");
        int contr = 6294;
        int contrIntrod = scan.nextInt();
        while (contr != contrIntrod) {
            System.out.print("Error inténtalo de nuevo");
            contrIntrod = scan.nextInt();
        }
        System.out.println("Correcto!");

        //4
        System.out.println("\n Ejercicio 4");
        System.out.print("Dame un número entero: ");
        int numEnt = scan.nextInt();
        if (numEnt > 0) {
            System.out.println("Es positivo!");
        } else if (numEnt < 0) {
            System.out.println("Es negativo!");
        } else {
            System.out.print("Es un cero, por favor introduce un número de nuevo: ");
            numEnt = scan.nextInt();
        }

        //5
        System.out.println("\n Ejercicio 5");
        System.out.print("Dame un número entero: ");
        int numPar = scan.nextInt();
        if (numPar % 2 == 0) {
            System.out.println("Es par");
        } else if (numPar % 2 != 0) {
            System.out.println("Es impar");
        } else {
            System.out.print("por favor introduce un número de nuevo: ");
            numPar = scan.nextInt();
        }

        //6
        System.out.println("\n Ejercicio 6");
        System.out.print("Escriba un número del 1 al 12: ");
        int mes = scan.nextInt();
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("Número invalido");
                break;
        }

        //7


        System.out.println("\n Ejercicio 7");
        System.out.print("Dame un número entero: ");
        int numPrim = scan.nextInt();
        boolean esPrimo = true;

        if (numPrim <= 1) {
            esPrimo = false;

        }
        else {
            for (int i = 2; i < numPrim; i++) {
                if ((numPrim % i) == 0) {
                    esPrimo = false;

                    break;
                }
            }


        }
        if (esPrimo){
            System.out.println("ES PRIMO!");
        }
        else{
            System.out.println("No es primo...");
        }
        System.out.println("Prueba de GIT");
    }


}

