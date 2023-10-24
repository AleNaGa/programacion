package com.company;

import java.util.Scanner;

public class IFejercicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1Leer dos números enteros e imprimir el mayor de ellos.
        System.out.println("Ejercicio 1");
        System.out.print("Numero Entero 1: ");
        int numEnt1 = scan.nextInt();
        System.out.print("Numero Entero 2: ");
        int numEnt2 = scan.nextInt();

        if (numEnt1 > numEnt2) {
            System.out.println("El mayor es: " + numEnt1);
        } else if (numEnt1 == numEnt2) {
            System.out.println("Son el mismo número");
        } else {
            System.out.println("El mayor es: " + numEnt2);
        }


        //2Leer un
        //entero y comprobar si es negativo o positivo, imprimiendo por pantalla una
        //frase al respecto. Considere el cero como positivo.
        System.out.println("\n Ejercicio 2");

        System.out.print("Introduzca un número: ");
        int numEj2 = scan.nextInt();
        if (numEj2 >= 0) {
            System.out.println(" Es un número positivo");
        } else {
            System.out.println(" Es un número negativo");
        }


        //3Modifique el
        //ejercicio anterior para que, en caso de introducir un cero, se imprima por
        //pantalla un mensaje específico.
        System.out.println("\n Ejercicio 3");
        System.out.print("Introduzca un número: ");
        int numEj3 = scan.nextInt();
        if (numEj3 > 0) {
            System.out.println(" Es un número positivo");
        } else if (numEj3 == 0) {
            System.out.println("Es un 0");
        } else {
            System.out.println(" Es un número negativo");
        }

       /*4
        Leer una
        edad y comprobar si la persona es mayor de edad, imprimiendo una frase al
        respecto. Si es menor, imprimir también un mensaje.

        */
        System.out.println("\n Ejercicio 4");
        System.out.print("Introduzca una edad: ");
        int edad = scan.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }


        // 5 Modificar el
        //ejercicio anterior para que además se compruebe si es jubilado (tiene más
        //de 67 años), imprimiendo un mensaje al respecto.
        System.out.println("\n Ejercicio 5");

        System.out.print("Introduzca una edad: ");
        int edad2 = scan.nextInt();
        if (edad2 >= 18) {
            System.out.println("Es mayor de edad");
            if (edad2 >=67){
                System.out.println("Está jubilado");
            }
        } else {
            System.out.println("Es menor de edad");
        }


    }
}
