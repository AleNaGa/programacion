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


        for (int x = 0; x < numCeros; x++) {
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

        for (int x = 0; x < numCeros; x++) {
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

    }
}