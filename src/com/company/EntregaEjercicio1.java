package com.company;

import java.util.Random;
import java.util.Scanner;

public class EntregaEjercicio1 {
    public static void main(String[] args) {
        //1
        // he utilizado la herramienta java.util.Random, también se puede utilizar Math.random
        Random rng = new Random();
        Scanner scan = new Scanner(System.in);
        // int numero = (int)(Math.random()*100+1);
        int numero = rng.nextInt(100) + 1; // la variable numero genera un número del 1 al 100
        for (int i = 0; i < 10; i++) {
            // i se repite 10 veces, los 10 intentos
            System.out.println("Tienes " + (10 - i) + " intentos"); // Este sout genera los intentos que te quedan en base a i
            System.out.print("Dame un número: ");
            int resp = scan.nextInt(); // esta es la variable con la que se compara el número aleatorio
            if (resp > numero) {
                System.out.println("El número introducido es mayor que la solución\n");
            } else if (resp < numero) {
                System.out.println("El número introducido es menor que la solución\n");
            } else {
                System.out.print("¡Has acertado!");
                break; // el break se usa para salir del for cuando haya acertado
            }

        }
        System.out.println("El número era: " + numero); //al final muestra el número que había que acertar


    }
}
