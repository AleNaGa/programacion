package com.company;

import java.util.Scanner;

public class For {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);

        //8
        System.out.println("\n Ejercicio 8");
        System.out.print("Cuántos ceros quieres?: ");
        int numCeros = scan.nextInt();
        for (int i = 0; i < numCeros; i++) {
            System.out.println("");
            for (int j = 0; j < numCeros; j++) {
                System.out.print(0);
            }
        }
        //9
        System.out.println("\n\n Ejercicio 9");


        for (int i = 0; i < numCeros; i++) {
            System.out.print(1);
        }
        for (int i = 0; i < numCeros - 1; i++) {
            System.out.println("");
            for (int j = 0; j < numCeros; j++) {
                System.out.print(0);
            }
        }


        //10
        System.out.println("\n\n Ejercicio 10");
        int a = 1;
        for (int i = 0; i < numCeros; i++) {
            System.out.println("");
            a = 1;
            for (int j = 0; j < numCeros; j++) {
                System.out.print(a);
                a = 0;
            }
        }

        //11
        System.out.println("\n\n Ejercicio 11");

        for (int i = 0; i < numCeros - 1; i++) {
            System.out.println("");
            for (int j = 0; j < numCeros; j++) {
                System.out.print(0);
            }
        }
        System.out.println("");
        for (int x = 0; x < numCeros; x++) {
            System.out.print(1);
        }

        //12
        System.out.println("\n\n Ejercicio 12");
        for (int i = 0; i < numCeros; i++) {
            System.out.println("");
            a = 0;
            for (int j = 0; j < numCeros; j++) {
                System.out.print(a);
                if (j == (numCeros - 2)) {
                    a = 1;
                }
            }
        }

        //13
        System.out.println("\n\n Ejercicio 13");

        for (int i = 0; i < numCeros; i++) {
            System.out.print(1);
        }
        for (int i = 0; i < numCeros - 1; i++) {
            System.out.println("");
            a = 1;
            for (int j = 0; j < numCeros; j++) {
                System.out.print(a);
                a = 0;
            }
        }

        //14
        System.out.println("\n\n Ejercicio 14");
        for (int i = 0; i < numCeros - 1; i++) {
            System.out.println("");
            a = 0;
            for (int j = 0; j < numCeros; j++) {
                System.out.print(a);
                if (j == (numCeros - 2)) {
                    a = 1;
                }
            }
        }
        System.out.println("");
        for (int x = 0; x < numCeros; x++) {
            System.out.print(1);
        }

        //15
        System.out.println("\n\n Ejercicio 15");
        for (int x = 0; x < numCeros; x++) {
            System.out.print(1);
        }
        for (int i = 0; i < numCeros - 2; i++) {
            System.out.println("");
            a = 1;
            for (int j = 0; j < numCeros; j++) {
                System.out.print(a);
                a = 0;
                if (j == (numCeros - 2)) {
                    a = 1;
                }
            }
        }

        System.out.println("");
        for (int x = 0; x < numCeros; x++) {
            System.out.print(1);
        }

        //16
        System.out.println("\n\n Ejercicio 15");
        for(int i = 0; i < numCeros; i ++){
            System.out.println("");
            for(int j = 0; j<numCeros; j++){
                if (j==i){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
        }

        //17
        System.out.println("\n\n Ejercicio 17");
        System.out.print("Introduzca número de filas: ");
        int filas = scan.nextInt();
        System.out.print("Introduzca número de Columnas: ");
        int colum = scan.nextInt();


        for (int i = 0; i<filas; i++){
            System.out.println("");
            for(int j = 0; j<colum; j++){
                System.out.print(0);
            }
        }

        //18
        System.out.println("\n\n Ejercicio 17");
        int cont = 0;
        for (int i = 0; i<filas; i++){
            System.out.println("");
            for(int j = 0; j<colum; j++){
                cont++;
                System.out.print(cont);

            }
        }

        //19
        System.out.println("\n\n Ejercicio 19");
        System.out.print("Introduzca número: ");
        int numEj19 = scan.nextInt();
        for (int i=0; i<7;i++){
            System.out.println(numEj19);
        }


        //20
        System.out.println("\n\n Ejercicio 20");
        for (int i=0; i<numEj19;i++){
            System.out.println(numEj19);
        }


        //21
        System.out.println("\n\n Ejercicio 21");
        System.out.print("Introduzca un número y un caracter: ");
        int numEj21 = scan.nextInt();
        String letEj21 = scan.next();
        for (int i=0; i<numEj21;i++){
            System.out.println(letEj21);
        }


        //22
        System.out.println("\n\n Ejercicio 22");
        System.out.print("Introduzca número de números positivos: ");
        int numEj22 = scan.nextInt();
        for (int i = 1; i<=numEj22;i++){
            System.out.println(i);
        }

        //23
        System.out.println("\n\n Ejercicio 23");
        for (int i = 1; i<=numEj22;i++){
            System.out.print(i);
        }

        //24
        System.out.println("\n\n Ejercicio 24");
        System.out.print("Introduce un número de números pares: ");
        int numEj24 = scan.nextInt();
        for (int i= 2; i<=numEj24*2; i+=2){
            System.out.println(i);
        }

        //25
        System.out.println("\n\n Ejercicio 25");
        for (int i= 1; i<=numEj24*2; i+=2){
            System.out.println(i);
        }

        //26
        System.out.println("\n\n Ejercicio 26");
        for (int i= 2; i<=numEj24*2; i+=2){
            System.out.print(i + ", ");
        }
        System.out.println("\n ");
        for (int i= 1; i<=numEj24*2; i+=2){
            System.out.print(i + ", ");
        }



    }
}