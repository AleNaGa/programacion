package com.company;

import java.util.Scanner;

public class SWITCH {
    public static void main (String [] args){

        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        switch (valor){
            case 1: System.out.println("lunes"); break;
            case 2: System.out.println("martes"); break;
            case 3: System.out.println("miércoles"); break;
            case 4: System.out.println("jueves"); break;
            case 5: System.out.println("viernes"); break;
            case 6: System.out.println("sábado"); break;
            case 7: System.out.println("domingo"); break;
            default:System.out.println("Número no valido"); break;
        }
        System.out.println("FIN");

    }
}
