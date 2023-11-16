package com.company;

import java.util.Scanner;

public class BoletínProblemas {
    public static void main(String[] ARGS) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("\nEjercicio 1");
        // leer un número y elevarlo a 5
        System.out.print("Dame 1 número para elevarlo a la quinta potencia: ");
        int numeroEj1 = scan.nextInt();
        int resultEj1 = 1;
        for (int i = 0; i < 5; i++) {
            resultEj1 = resultEj1*numeroEj1;

        }
        System.out.println(numeroEj1 + " elevado a la quinta potencia es: " + resultEj1);

        System.out.println("\nEjercicio 2");
        //Repetir el ejercicio anterior para leer también por pantalla la potencia a la que debe elevarse el número.
        System.out.print("Introduce 1 número para elevarlo: ");
        int numeroEj2 = scan.nextInt();
        System.out.print("introduce el exponente: ");
        int exponente = scan.nextInt();
        int resultEj2 = 1;
        for (int i = 0; i < exponente; i++) {
            resultEj2 = resultEj2*numeroEj2;

        }
        System.out.println(numeroEj2 + " elevado a " + exponente + " es: " + resultEj2);

        System.out.println("\nEjercicio 3");
        //Leer por pantalla n imprimir una fila de asteriscos con n columnas
        System.out.print("Introduce el número de columnas: ");
        int column = scan.nextInt();
        for (int i = 0; i < column; i++) {
            System.out.print("*");

        }
        System.out.println("\nEjercicio 4");
        //
        System.out.print("introduce el número de columnas y filas: ");
        int ej4 = scan.nextInt();
        for (int i = 0; i < ej4; i++) {
            System.out.println();
            for (int j = 0; j < ej4; j++) {
                System.out.print("* ");

            }
        }

        System.out.println("\nEjercicio 5");
        //	Leer por pantalla un numero n,
        //	e imprimir por pantalla un cuadrado cuya altura viene dada por n.
        System.out.print("Introduce un número: ");
        int ej5 = scan.nextInt();
        for (int i = 0; i < ej5; i++) {
            System.out.println("");
            for (int j = 0; j < ej5; j++) {
                if (i==0 || j==0){
                    System.out.print("* ");
                }
                else if(i== ej5 -1 || j == ej5-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

        }

        System.out.println("\nEjercicio 13");
        //13.	Leer por pantalla un número n,
        // e imprimir por pantalla un triángulo cuya altura viene dada por n.
        System.out.print("Introduzca la altura del triángulo: ");
        int ej13 = scan.nextInt();

        for (int i = 0; i <= ej13; i++) {

            for (int j = ej13; j >i ; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //1.	Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números positivos. Por ejemplo, para n=5 debe imprimir 1 2 3 4 5
        System.out.print("Introduce un numero de números enteros: ");
        int numEnt = scan.nextInt();
        for (int i = 1; i <=numEnt; i++) {
            System.out.print(i + ", ");
        }


        //2.	Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números pares. Por ejemplo, para n=5 debe imprimir 2 4 6 8 10
        System.out.println();
        System.out.print("Numeros pares: ");
        int numPar = scan.nextInt();
        for (int i = 1; i <=numPar; i++) {
            System.out.print(i*2 + ", ");
        }
        //3.	Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números impares. Por ejemplo, para n=5 debe imprimir 1 3 5 7 9
        System.out.println();
        System.out.print("Numeros impares: ");
        int numImpar = scan.nextInt();
        for (int i = 1; i <=numImpar*2; i+=2) {
            System.out.print(i + ", ");
        }


       // Escriba un programa que lea por pantalla un número entero n, e imprima los n primeros números cuadrados.
        // Por ejemplo, para n=5 debe imprimir 1 4 9 16 25
        System.out.print("Introduce un número: ");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i*i + " ");

        }



        // 5.	Escriba un programa que lea por pantalla un número entero n,
        // e imprima la suma de los n primeros números positivos. Por ejemplo, para n=5 debe imprimir 1+2+3+4+5=15
        System.out.print("introduce n: ");
        int numPos = scan.nextInt();
        int cont = 0;
        for (int i = 1; i <numPos; i++) {
            System.out.print(i + "+");
            cont = cont + i;
        }
        System.out.print(numPos);
        System.out.print("=" + cont);




       // Escriba un programa que lea por pantalla dos números entero m y n,
        // e imprima el número m repetido n veces. Por ejemplo, para m=8 y n=5 debe imprimir 8 8 8 8 8

        System.out.print("Introduce m: ");
        int m = scan.nextInt();
        System.out.print("Introduce n: ");
        int n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.print(m + " ");
        }
        System.out.println(m);


        //Escriba un programa que lea por pantalla un número n,
        // e imprima una cuenta atrás. Por ejemplo, para n=5 debe imprimir
        System.out.print("introduzca un número: ");
         n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(n - i);
        }


        //Escriba un programa que lea por pantalla dos números entero m y n, e imprima la letra ‘M’
        // repetida m veces y la letra ‘N’ repetida n veces. Por ejemplo, para m=8 y n=5 debe imprimir
        System.out.print("introduce cuantas m: ");
        int ms = scan.nextInt();
        System.out.print("introduce cuantas n: ");
        int ns = scan.nextInt();
        for (int i = 0; i < ms + ns; i++) {
            if (i < ms) {
                System.out.print("M");
            } else {
                System.out.print("N");
            }
        }

         */
        //9.	Escriba un programa que lea por pantalla un número n,
        // e imprima los n primeros términos (con n >= 0) de la sucesión 4n+3. Por ejemplo, para n=4 debe imprimir
        System.out.print("introduce un número: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(4*i+3 + " ");
        }
        System.out.println(4*n+3);
    }
}
