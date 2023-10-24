package com.company;

public class DecisiónIF {
    public static void main(String[] args) {

        int edadJorge = 15;
        int edadPaco = 12;


        if(edadJorge>edadPaco){
            System.out.println("Jorge es mayor que Paco");
        }
        else if ( edadJorge==edadPaco){
            System.out.println("Ambos tienen la misma edad");
        }
        else {

            System.out.println("Paco es mayor  que Jorge");
        }


        System.out.println("FIN");
    }
}
