package com.company;

import java.util.Scanner;

public class Boletin3EntradaPorPantalla {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* 1. Lee por pantalla una altura y
        almacénala en una variable.
        Imprime la variable
        por pantalla

        System.out.print("Introduce tu altura en metros: ");
        float altura = scanner.nextFloat();
        System.out.println("Tu altura es: " + altura + " metros");
        */





        /*2. Lee por pantalla una edad y
        almacénalo en una variable.
        Imprime la variable por pantalla.

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Tu edad es: " + edad);
         */






        /*3. ¿Pueden modificarse los
        ejercicios anteriores para
        ahorrarse la variable?
        Si, de esta manera:
        System.out.println("Tu altura es: " + scan.nextFloat();
        pero no almacena el dato por lo que puede resultar un problema
         */










       /* 4.a Lee por pantalla una temperatura en grados Celsius
        e imprímela por pantalla.

        System.out.print("¿Cuántos grados Celsius hace?: ");
        int temperaturaC = scanner.nextInt();
        System.out.println("Hace " + temperaturaC + " grados Celsius");
        */



       /* 4.b Repite pero imprimiendo por pantalla
        en grados Kelvin (hay que convertir).

        System.out.print("¿Cuántos grados Celsius hace?: ");
        float temperaturaK = scanner.nextInt() + 273.15f;

        System.out.println("Hace " + temperaturaK + " grados Kelvin");
        */






        /*5. Crea un programa que calcule
        el área de un rectángulo (base x altura),
         pidiendo por pantalla los datos necesarios.

        System.out.print("Introduce la base: ");
        float base = scanner.nextFloat();
        System.out.print("Introduce la altura: ");
        float altura = scanner.nextFloat();
        System.out.println("El área es: " + (base*altura));
        */



        /*6. Crea un programa que calcule el Índice de Masa Corporal (IMC),
                pidiendo por pantalla los datos necesarios.
        System.out.print("Introduce tu peso en Kg: ");
        float peso = scanner.nextFloat();
        System.out.print("Introduce tu altura en metros: ");
        float altura = scanner.nextFloat();
        float IMC = peso /(altura*altura);
        System.out.println("Tu indice de masa corporal es: " + IMC);
         */





       /*7. Crea un programa que lea el precio
       sin IVA de un producto e imprima
        el valor final con IVA del mismo.
        System.out.print("Precio Base: ");
        float precioIVA =  scanner.nextFloat()* 1.21f;
        System.out.println("Precio con IVA: " + precioIVA);
        */



        /*8. Crea un programa que lea el precio
        sin IVA de tres productos e imprima
        el valor total con IVA que paga el comprador,
        así como el valor medio con y sin IVA.


        System.out.print("Precio producto 1: ");
        float prod1 = scanner.nextFloat();
        System.out.print("Precio producto 2: ");
        float prod2 = scanner.nextFloat();
        System.out.print("Precio producto 3: ");
        float prod3 = scanner.nextFloat();
        float precioTotal= (prod1 + prod2 + prod3)*1.21f;
        float precioMedioSin =  (precioTotal/1.21f) / 3f;
        float precioMedioCon =  (precioTotal) / 3f;
        System.out.println("Pagas en total: " + precioTotal);
        System.out.println("Tu precio medio con IVA es: " + precioMedioCon);
        System.out.println("Tu precio medio sin IVA es: " + precioMedioSin);
        */






        /*9. Crea un programa que lea el nombre de una persona,
        y a continuación su edad y altura,
        e imprima todo por pantalla en una misma línea. ¿Funciona?


        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce tu altura: ");
        float altura = scanner.nextFloat();
        System.out.println(nombre + ", " + edad + " años, " + altura);

         */


        /*10. Repita el ejercicio anterior
        pero leyendo primero los numeros y después
        el nombre. ¿Funciona?
        Solo funciona si utilizas el scanner.next()



        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        System.out.print("Introduce tu altura: ");
        float altura = scanner.nextFloat();
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.next();
        System.out.println(nombre + ", " + edad + " años, " + altura);

         */


    }
}
