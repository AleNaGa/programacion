package com.company;

import java.util.Scanner;

public class TRIÁNGULOS {
    public static void main (String[]args){

Scanner scan = new Scanner(System.in);
    System.out.print("Introduzca el tamaño del triángulo: ");
    int n = scan.nextInt();
    //Triángulo
        for (int i = 1; i <=n; i++) {
        System.out.println("");
        for (int j = 1; j <=i ; j++) {
            if (j==1 || j==i){
                System.out.print("* ");
            }
            else{
                System.out.print("- ");
            }

        }
    }
        //Triángulo al revés
        for (int i = 1; i <= n; i++) {
        System.out.println("");
        for (int j = 1; j <= n - i; j++) {
            if (j==1 || j==n-i){
                System.out.print("* ");
            }
            else{
                System.out.print("- ");
            }
        }
    }
}
}
