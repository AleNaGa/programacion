package com.company;

import java.sql.SQLOutput;

public class boletín2 {
    public static void main(String[] args) {




        /*8. Crear dos variables de tipo float,
         dándoles un valor inicial e
         imprimiéndolas por pantalla.
         */

        float ej8 = 2.5f;
        float ej81 = 2.3f;
        System.out.println(ej8 + " " + ej81);


        /* 9. Imprimir por pantalla el resultado de comprobar si la primera
        es mayor que la segunda
         */

        System.out.println(ej8 > ej81);

        /* 10. Cambiar la primera con el valor de la segunda multiplicandola
        por dos, y volver a imprimir por pantalla el
        resultado de la comprobacion anterior
         */

        ej8 = ej81*2;
        System.out.println(ej8 > ej81);

        /*11. Imprimir por pantalla el resultado de comprobar si la primera
        es menor o igual que la segunda
         */

        System.out.println(ej8 <= ej81);

        /*12 Repetir el ejercicio anterior pero almacenando el resultado de
        la comprobación en una variable e imprimiedo después por pantalla dicha
        variable
         */
        boolean esMenorOIgual = ej8 <= ej81;
        System.out.println(esMenorOIgual);


    }
}
