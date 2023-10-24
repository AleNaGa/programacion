package Pruebas;

import com.company.SWITCH;

import java.sql.SQLOutput;

import java.util.Random;
import java.util.Scanner;


public class prueba1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rng = new Random();

        System.out.print("Ingrese el número 1: ");
        int ej23num1 = scan.nextInt();
        System.out.print("Ingrese el número 2: ");
        int ej23num2 = scan.nextInt();
        System.out.print("Ingrese el número 3: ");
        int ej23num3 = scan.nextInt();
        int tmp = 0;

        if (ej23num1 > ej23num2){
            tmp = ej23num1;
            ej23num1 = ej23num2;
            ej23num2 = tmp;
        }
        if (ej23num2 > ej23num3){
            tmp = ej23num2;
            ej23num2 = ej23num3;
            ej23num3 = tmp;
        }
        if (ej23num1 > ej23num2){
            tmp = ej23num1;
            ej23num1 = ej23num2;
            ej23num2 = tmp;
        }
        System.out.println(ej23num1 + " ," + ej23num2 + " ," + ej23num3);
        System.out.println(ej23num3 + " ," + ej23num2 + " ," + ej23num1);


    }
}
