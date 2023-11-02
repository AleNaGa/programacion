package com.company;

import java.util.Scanner;

public class Problemas1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1. Escribe un programa que calcule la media de un conjunto de numero positivos que introducidos por teclado.
        // Si introducimos un 0 terminará de preguntarnos y escribirá la media.
        System.out.println("\n Ejercicio 1");
        System.out.println("Introduce un número para la media, para calcularla introduzca 0");
        int numDePos;
        int agrupNum = 0;
        int cont = 0;

        do {
            System.out.print("Dame un número: ");
            numDePos = scan.nextInt();
            if(numDePos>0){
                agrupNum = agrupNum + numDePos;
                cont++;
            }
        } while (numDePos != 0);
        System.out.println(agrupNum/cont);


        //2. Desarrolla un programa que pida por pantalla un numero x y
        // un numero y y genere todas las posibles combinaciones de puntos (i,j).
        System.out.println("\n Ejercicio 2");
        System.out.print("Introduce cuantas i:");
        int x = scan.nextInt();
        System.out.print("Introduce cuantas j:");
        int y = scan.nextInt();

        for (int i = 0; i<=x;i++){

            for (int j = 0; j<=y;j++){
                System.out.println("(" + i +","+ j + ")");
            }
        }

        //3. Comprobar si un número es capicuo.
        System.out.println("\n Ejercicio 3");
        System.out.print("Introduce un número de 3 cifras: ");
        int numero = scan.nextInt();
        int cent = numero / 100;
        int unid = numero % 10;
        if (cent==unid){
            System.out.println("Es capicúo");
        }
        else{
            System.out.println("no es capicúo");
        }

        // más cifras
        int num;
        int aux;
        int inverso = 0;
        System.out.print("Introduce un número: ");
        num = scan.nextInt();
        if (num>=10){
            aux = num;
            while(aux > 0){
                System.out.println(aux);
                inverso*=10;
                inverso = inverso + (aux%10);
                System.out.println(aux);
                System.out.println(inverso);
                aux/=10;
            }
        }
        else{
            System.out.println("no puede ser capicuo");
        }
        if (num == inverso){
            System.out.println("Es capicuo");
        }
        else{
            System.out.println("No es capicuo");
        }


    }
}
