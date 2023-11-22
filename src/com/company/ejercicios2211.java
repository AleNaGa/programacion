package com.company;

import java.util.Scanner;

public class ejercicios2211 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        //Introducir por pantalla un numero y que imprima
        // todas las iteraciones desde 1 hasta el numero introducido.
        System.out.println("\n ejercicio1");
        System.out.println("Dime un número");
        int numero = scan.nextInt();
        for (int i = 1; i <= numero; i++) {
            System.out.println("");
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }

        }


        System.out.println("\n ejercicio2");
        System.out.println("Bienvenido a tu banco");
        int ingreso;
        int operación = 0;
        int saldo = 1000;
        do {
            System.out.print("Qué deseas hacer? (0 salir, 1 consultar saldo, 2 ingresar, 3 retirar): ");
            operación = scan.nextInt();
            switch (operación) {
                case 0: {
                    System.out.println("Ha deseado salir, gracias. ");
                    break;
                }
                case 1: {
                    System.out.println("Su saldo es " + saldo + " euros. ");
                    break;
                }
                case 2: {
                    System.out.print("Cuánto desea ingresar?: ");
                    ingreso = scan.nextInt();
                    System.out.print("Ha ingresado " + ingreso + " euros. ");
                    saldo = saldo + ingreso;
                    System.out.println("Su saldo actual es " + saldo);
                    break;
                }
                case 3: {
                    System.out.print("Cuánto desea retirar? ");
                    ingreso = scan.nextInt();
                    saldo = saldo - ingreso;
                    System.out.print("Ha retirado " + ingreso + " euros.");
                    System.out.println("Su saldo es ahora " + saldo + " euros. ");
                    break;
                }
                default:{
                    System.out.println("NO VALIDO! ");
                }

            }
        } while (operación != 0);
*/
        System.out.println("\n ejercicio3");
        System.out.print("Introduzca un número: ");
        int num = scan.nextInt();
        System.out.println("El numero de pares que hay es: " + (num/2));
        for (int i = 2; i <= num; i+=2) {
            System.out.print(i + ", ");
        }
        System.out.println(num/2);

    }

}
