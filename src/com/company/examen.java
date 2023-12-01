package com.company;

import java.util.Scanner;

public class examen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n Ejercicio 1");
        System.out.print("Introduzca la variable1: ");
        int variable1 = scan.nextInt();
        System.out.print("Introduzca la variable2: ");
        int variable2 = scan.nextInt();
        int guardado;
        if (variable1 < variable2) {
            guardado = variable1;
            variable1 = variable2;
            variable2 = guardado;
        }
        System.out.println("La variable 1, que es la mayor, es " + variable1);
        System.out.println("La variable 2, que es la menor, es " + variable2);


        System.out.println("\n Ejercicio 2");
        int nota;
        int continuar;
        int cont = 0;
        float media = 0;
        do {
            System.out.print("Introduzca el nombre del alumno: ");
            String nombre = scan.next();
            System.out.print("Introduzca el apellido del alumno: ");
            String apellido = scan.next();
            do {
                System.out.print("Introduce la calificación del alumno " + nombre + " " + apellido + ": ");
                nota = scan.nextInt();
            } while (nota < 0 || nota > 10);
            System.out.println("El estudiante " + nombre + " " + apellido + " " + "tiene una calificación de " + nota);
            System.out.println("Si desea introducir la calificación de otro estudiante introduzca 1");
            System.out.print("Si desea salir del programa introduzca cualquier otro valor: ");
            continuar = scan.nextInt();
            cont++;
            media = media + nota;
        } while (continuar == 1);
        System.out.println("El número de alumnos introducido es " + cont);
        System.out.println("El promedio de notas es " + media / cont);




        System.out.println("\n Ejercicio 3");
        int mes;
        String nombreMes = "";
        int dias = 0;
        int semanas = 0;
        do {
            System.out.print("Introduzca el número del mes (del 1 al 12): ");
            mes = scan.nextInt();
        } while (mes < 1 || mes > 12);
        switch (mes) {
            case 1: {
                nombreMes = "Enero";
                dias = 31;
                semanas = 5;
                break;
            }
            case 2: {
                nombreMes = "Febrero";
                dias = 28;
                semanas = 4;
                break;
            }
            case 3: {
                nombreMes = "Marzo";
                dias = 31;
                semanas = 5;
                break;
            }
            case 4: {
                nombreMes = "Abril";
                dias = 30;
                semanas = 5;
                break;
            }
            case 5: {
                nombreMes = "Mayo";
                dias = 31;
                semanas = 5;
                break;
            }
            case 6: {
                nombreMes = "Junio";
                dias = 30;
                semanas = 5;
                break;
            }
            case 7: {
                nombreMes = "Julio";
                dias = 31;
                semanas = 5;
                break;
            }
            case 8: {
                nombreMes = "Agosto";
                dias = 31;
                semanas = 5;
                break;
            }
            case 9: {
                nombreMes = "Septiembre";
                dias = 30;
                semanas = 5;
                break;
            }
            case 10: {
                nombreMes = "Octubre";
                dias = 31;
                semanas = 5;
                break;
            }
            case 11: {
                nombreMes = "Noviembre";
                dias = 30;
                semanas = 5;
                break;
            }
            case 12: {
                nombreMes = "Diciembre";
                dias = 31;
                semanas = 5;
                break;
            }
            default: {
                nombreMes = "";
            }
        }

        System.out.println();
        int contDias = 1;
        System.out.println("        " + nombreMes);
        System.out.println();
        System.out.println("Lu Ma Mi Ju Vi Sa Do");
        for (int i = 0; i < semanas; i++) {
            System.out.println();
            for (int j = 0; j < 7; j++) {
                if (contDias < 10) {
                    System.out.print("O" + contDias + " ");
                } else if (contDias > dias) {
                    break;
                } else {
                    System.out.print(contDias + " ");
                }
                contDias++;
            }
        }
    }
}