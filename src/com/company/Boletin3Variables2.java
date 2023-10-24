package com.company;

public class Boletin3Variables2 {
    public static void main(String[] args) {
        //Ejercicio 1
        int var1 = 10;
        System.out.println(var1);
        var1--;
        System.out.println(var1);
        var1 *= 2;
        var1 -= 4;
        System.out.println(var1);
        var1++;
        var1++;
        var1++;
        var1++;
        System.out.println(var1);
        int var2 = var1 + 1;
        System.out.println(var1 + " " + var2);
        var2 /= 2;
        System.out.println("resultado ej 1: " + var1 + " " + var2);

        //Ejercicio 2 algoritmo de área de un rectángulo

        float base = 2f;
        float altura = 6f;
        float area = base * altura;
        System.out.println("resultado ej 2: " + area);

        //Ejercicio 3 convertir euros a dólares (1=1.16)
        float valorConver = 1.16f;
        float euro;
        euro = 2;
        float dolar = euro * valorConver;
        System.out.println("resultado ej 3: " + dolar);

        //Ejercicio 4 Mod ejercicio 2

        System.out.println("resultado ej 4: " + base * altura);

        //Ejercicio 5 mod ejercicio 3

        dolar = euro * 1.16f;
        System.out.println("resultado ej 5: " + dolar);

        //Ejercicio 6
        int varEj6 = 3;
        varEj6--;
        varEj6--;
        varEj6--;
        varEj6 += 6;
        varEj6++;
        varEj6 *= 2;
        System.out.println("resultado ej 6: " + (varEj6 % 2));
        // se puede saber si un número es par si el resto de dividirlo entre 2 es 0.


    }
}
