package com.company;

public class boletin4Refuerzo {
    public static void main(String[] args) {

        //1 variables datos
        String nombre = "Alejandro";
        String apellido1 = "Navarro";
        String apellido2 = "García";
        String DNI = "29506469E";
        int edad = 24;
        String genero = "Hombre";
        String estado = "Casado";



        System.out.println(nombre);
        System.out.println(apellido1);
        System.out.println(apellido2);
        System.out.println(DNI);
        System.out.println(edad);
        System.out.println(genero);
        System.out.println(estado);

        //2 concatenación
        System.out.println(nombre + apellido1 + apellido2 + DNI + edad + genero + estado);

        //3 media
        float notaJuan = 5.3f;
        float notaPepe = 7.23f;
        float notaMaria = 9.86f;
        System.out.println("La nota media de Juan, Pepe y María es: " + (notaJuan + notaPepe + notaMaria)/3);

        //4 mejores notas
        float notaAna = 9.98f;
        float notaMiguel = 9.87f;
        System.out.println("¿Tiene Ana mejor nota que Miguel? " + (notaAna>notaMiguel));

        //5
        char ej5 = 'A';
        System.out.println(ej5);
        ej5++;
        ej5++;
        ej5++;
        ej5++;
        System.out.println("La letra que se imprime es: " + ej5);

        //6 Area = pi * r^
        float pi = 3.14159f;
        float radio = 2.756f ;
        float area = pi * (radio * radio);
        System.out.println("Si el radio es: " + radio + ", el área del círculo será: " + area);

        //7 Perímetro = 2 * pi * r
        float perimetro = 2*pi*radio;
        System.out.println("Si el radio es: " + radio + ", el perímetro será: " + perimetro);

        //8
        char M = 'M';
        char P = 'P';
        System.out.println("Es M menor que P? " + (M<P));
        //se imprime un Buleano

        //9
        int ent1 = 76;
        int ent2 = 8;
        System.out.println("¿Es " + ent1 + " superior al doble de " + ent2 + "? " + (ent1> (ent2*2)));

        /*10
        int ej101 = 2;
        int ej100 = 0;
        System.out.println(ej101/ej100);
        aparece una excepcion llamada dividir por cero. no se puede.
         */


        //11

        /*12 no lo hago pq estoy mirando los enunciados en otro ordenador,
        aunque en los otros boletines siempre lo he hecho así
         */

        //13 Señor mayor de 100

        int edadSeñor = 135;
        System.out.println("¿Pertenece el señor a la cuarta edad? " + (edadSeñor>100));


        //14 2/3 2.0/3
        int ent14 = 2/3;
        double doub14 = 2.0/3;
        System.out.println(ent14);
        System.out.println(doub14);
        System.out.println("¿Son los dos iguales? " + (ent14 == doub14));

        //15

        double ej15 = 2.56;
        double cuadr1 = ej15*ej15;

        //16
        double facturaLuz = 90;
        System.out.println(facturaLuz * 99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999.0);
        /*no permite multiplicar un double por un entero,
        por el contrario si transformamos el 9999999 en un float o un double
        si funciona
         */

        //17
        /* el valor más grande posible es 10^308, es el mayor tamaño que permite el almacenamiento de los datos double.
        si lo multiplico por un numero desorbitado el valor que me devuelve es Infinity
         */

        //18
        int dia = 30;
        int mes = 11;
        int ano = 1998;
        int diaMin = 1;
        int mesMin = 1;
        int anoMin = 2003;

        boolean puedeDiablo = ano <= anoMin;

        System.out.println("¿puedo entrar? " + puedeDiablo);

        //19
        boolean minisEntrar = !puedeDiablo;
        System.out.println("tiene beca?: " + minisEntrar);

        //20
        int diaHoy = 5;
        int mesHoy = 10;
        boolean cumpleanos = (diaHoy == dia) && (mesHoy == mes);
        System.out.println("es hoy tu cumple? " + cumpleanos );

        //21
        boolean esMilenial = ano<=1997 && ano >= 1981;
        System.out.println("Es milenial? " + esMilenial);

        //22
        int dia2 = 11;
        int mes2 = 8;
        int ano2 = 2000;
        boolean mismaGen = (ano - ano2) <= 5 && (ano - ano2) >= (-5);
        System.out.println("Son de la misma gen? " + mismaGen);











    }
}
