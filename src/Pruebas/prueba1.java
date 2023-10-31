package Pruebas;

import com.company.SWITCH;

import java.sql.SQLOutput;

import java.util.Random;
import java.util.Scanner;


public class prueba1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rng = new Random();


        int numEj24 = scan.nextInt();
        for (int i= 2; i<=numEj24*2; i+=2){
            System.out.println(i);
        }

}}
