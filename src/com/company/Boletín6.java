package com.company;

import java.util.Random;
import java.util.Scanner;

public class Boletín6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1Leer dos números enteros e imprimir el mayor de ellos.
        System.out.println("Ejercicio 1");
        System.out.print("Numero Entero 1: ");
        int numEnt1 = scan.nextInt();
        System.out.print("Numero Entero 2: ");
        int numEnt2 = scan.nextInt();

        if (numEnt1 > numEnt2) {
            System.out.println("El mayor es: " + numEnt1);
        } else if (numEnt1 == numEnt2) {
            System.out.println("Son el mismo número");
        } else {
            System.out.println("El mayor es: " + numEnt2);
        }


        //2Leer un
        //entero y comprobar si es negativo o positivo, imprimiendo por pantalla una
        //frase al respecto. Considere el cero como positivo.
        System.out.println("\n Ejercicio 2");

        System.out.print("Introduzca un número: ");
        int numEj2 = scan.nextInt();
        if (numEj2 >= 0) {
            System.out.println(" Es un número positivo");
        } else {
            System.out.println(" Es un número negativo");
        }


        //3Modifique el
        //ejercicio anterior para que, en caso de introducir un cero, se imprima por
        //pantalla un mensaje específico.
        System.out.println("\n Ejercicio 3");
        System.out.print("Introduzca un número: ");
        int numEj3 = scan.nextInt();
        if (numEj3 > 0) {
            System.out.println(" Es un número positivo");
        } else if (numEj3 == 0) {
            System.out.println("Es un 0");
        } else {
            System.out.println(" Es un número negativo");
        }

       /*4
        Leer una
        edad y comprobar si la persona es mayor de edad, imprimiendo una frase al
        respecto. Si es menor, imprimir también un mensaje.

        */
        System.out.println("\n Ejercicio 4");
        System.out.print("Introduzca una edad: ");
        int edad = scan.nextInt();
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }


        // 5 Modificar el
        //ejercicio anterior para que además se compruebe si es jubilado (tiene más
        //de 67 años), imprimiendo un mensaje al respecto.
        System.out.println("\n Ejercicio 5");

        System.out.print("Introduzca una edad: ");
        int edad2 = scan.nextInt();
        if (edad2 >= 18) {
            System.out.println("Es mayor de edad");
            if (edad2 >= 67) {
                System.out.println("Está jubilado");
            }
        } else {
            System.out.println("Es menor de edad");
        }


        // 6 ej anterior solo edad válida (0-120) inválida = error
        System.out.println("\n Ejercicio 6");
        System.out.print("Introduzca una edad entre 0 y 120: ");
        int edad3 = scan.nextInt();
        if (edad3 > 120 || edad3 < 0) {
            System.out.println("edad no válida");
        } else if (edad3 >= 18) {
            System.out.println("Es mayor de edad");
            if (edad3 >= 67) {
                System.out.println("Está jubilado");
            }
        } else {
            System.out.println("Es menor de edad");
        }

        //7 Leer seis números y comprobar si coinciden con la combinación ganadora de la
        //primitiva (1, 3, 10, 20, 33, 40), imprimiendo un mensaje al respecto.
        System.out.println("\n Ejercicio 7");

        System.out.print("Numero 1: ");
        int Lot1 = scan.nextInt();
        System.out.print("Numero 2: ");
        int Lot2 = scan.nextInt();
        System.out.print("Numero 3: ");
        int Lot3 = scan.nextInt();
        System.out.print("Numero 4: ");
        int Lot4 = scan.nextInt();
        System.out.print("Numero 5: ");
        int Lot5 = scan.nextInt();
        System.out.print("Numero 6: ");
        int Lot6 = scan.nextInt();

        if (Lot1 == 1 && Lot2 == 3 && Lot3 == 10 && Lot4 == 20 && Lot5 == 33 && Lot6 == 40) {
            System.out.println("HAS GANADO!");
        } else {
            System.out.println("Has perdido");
        }


        //8 Modificar el ejercicio anterior para que, al leerlos, se compruebe si todos los
        //números leídos tienen el rango apropiado (entre 1 y 49). Si no lo tienen, imprimir un
        //mensaje de error y el programa acabará.
        System.out.println("\n Ejercicio 8");
        if ((Lot1 >= 1 && Lot1 <= 49) && (Lot2 >= 1 && Lot2 <= 49) && (Lot3 >= 1 && Lot3 <= 49) && (Lot4 >= 1 && Lot4 <= 49) && (Lot5 >= 1 && Lot5 <= 49) && (Lot6 >= 1 && Lot6 <= 49)) {
            if ((Lot1 == 1) && (Lot2 == 3) && (Lot3 == 10) && (Lot4 == 20) && (Lot5 == 33) && (Lot6 == 40)) {
                System.out.println("HAS GANADO!");
            } else {
                System.out.println("Has perdido");
            }
        } else {
            System.out.println("Algún número no es válido");
        }

        //9 Leer por pantalla un entero y comprobar si es par o impar (use el operador módulo %)
        System.out.println("\n Ejercicio 9");
        System.out.println("Introduce un número");
        int parImpar = scan.nextInt();
        if (parImpar % 2 == 0) {
            System.out.println("Es par!");
        } else {
            System.out.println("Es impar");
        }

        //10 Crear un programa que calcule el índice de masa corporal. Lea los datos que sean
        //necesarios, imprima por pantalla el índice, y dependiendo de su valor imprima al
        //usuario un mensaje informativo. Por ejemplo: está por debajo de lo normal, está
        //normal o está por encima de lo normal.
        System.out.println("\n Ejercicio 10");
        System.out.print("Introduce tu peso en Kg: ");
        float peso = scan.nextFloat();
        System.out.print("Introduce tu altura en metros: ");
        float altura = scan.nextFloat();
        float IMC = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es: " + IMC);
        if (IMC > 18.5) {
            if (IMC > 24.9) {
                if (IMC > 29.9) {

                    System.out.println("Esta usted obeso");

                } else {
                    System.out.println("Esta usted en sobrepeso");
                }
            } else {
                System.out.println("Esta usted normal");
            }
        } else {
            System.out.println("Esta usted en bajo peso");
        }


        //11 Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes
        //correspondiente. En caso de leer un número fuera de rango, imprimir por pantalla un
        //mensaje de error.
        System.out.println("\n Ejercicio 11");
        System.out.print("Escriba un número del 1 al 12: ");
        int mes = scan.nextInt();
        switch (mes) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("Número invalido");
                break;
        }


        //12 Establezca un número entre 0 y 9999, que servirá como contraseña. Puede elegir el
        //que desee. Pida por pantalla un número y si coincide escriba “Contraseña correcta,
        //accediendo al sistema”, en caso contrario escriba “Contraseña incorrecta, cerrando
        //sesión”.
        System.out.println("\n Ejercicio 12");
        int password = 9564;
        System.out.print("Contraseña: ");
        if (password != scan.nextInt()) {
            System.out.println("Cerrando Sesión");
        } else {
            System.out.println("Iniciando sesión");
        }

        //13 Desarrolle un sistema de cálculo de descuentos para una farmacia. Cuando el
        //usuario introduzca un precio, usted deberá aplicar un descuento del 15% a ese
        //valor, e imprimir por pantalla el precio final. Recuerde que debe imprimir el precio
        //final tras aplicar el descuento, no la cantidad que se descuenta.
        System.out.println("\n Ejercicio 13");
        System.out.print("Introduzca precio del producto: ");
        float precio = scan.nextFloat();
        System.out.println("Precio con el 15% de descuento: " + (precio * 0.85f));


        //14 Lo mismo pero se imprime la cantidad descontada
        System.out.println("\n Ejercicio 14");
        System.out.print("Introduzca precio del producto: ");
        float precio2 = scan.nextFloat();
        System.out.println("Precio con el 15% de descuento: " + (precio2 * 0.85f));
        System.out.println("cantidad descontada: " + (precio2 * 0.15f));


        //15  Diseñe un programa que lea la temperatura
        // en centígrados del día e imprima el tipo
        //de clima de acuerdo a la siguiente tabla.
        System.out.println("\n Ejercicio 15");
        System.out.print("Introduzca la temperatura en centígrados: ");
        int temp = scan.nextInt();
        if (temp<=10) {
            System.out.println("Hace Frío");
        }
        else if (temp>10 && temp <=20){
            System.out.println("Nublado");
        }
        else if (temp >20 && temp <=30){
            System.out.println("Caluroso");
        }
        else{
            System.out.println("Tropical");
        }

        //16 Pedir un número entre 0 y 99999 y decir
        // cuántas cifras tiene. Suponga que se
        //introducirán números en ese rango.
        System.out.println("\n Ejercicio 156");
        System.out.print("Introduzca un número de 0 a 99999: ");
        int ej16 = scan.nextInt();
        if (ej16 >=10000 && ej16 <100000){
            System.out.println("Tiene cinco cifras");
        }
        else if (ej16 >=1000){
            System.out.println("Tiene cuatro cifras");
        }
        else if (ej16>=100){
            System.out.println("Tiene Tres cifras");
        }
        else if (ej16 >=10){
            System.out.println("Tiene dos cifras");
        }
        else{
            System.out.println("Tiene una cifra");
        }


        //17 matrículas de acuerdo a la facultad que va a estudiar
        //nombre de la facultad y muestro el importe y la mensualidad
        System.out.println("\n Ejercicio 17");
        System.out.print("Introduzca la facultad a la que desea matricularse: ");
        String facu = scan.nextLine();
        switch (facu) {
            case ("Ingenieria de Sistemas"):
                System.out.println("350€ por la matriculación, 650 mensualidad");
                break;
            case ("Derecho"):
                System.out.println("300€ por la matriculación, 550 mensualidad");
                break;
            case ("Ingenieria Naviera"):
                System.out.println("300€ por la matriculación, 500 mensualidad");
                break;
            case ("Ingenieria Pesquera"):
                System.out.println("310€ por la matriculación, 460 mensualidad");
                break;
            case ("Contabilidad"):
                System.out.println("280€ por la matriculación, 490 mensualidad");
                break;
            case ("Administracion"):
                System.out.println("360€ por la matriculación, 520 mensualidad");
                break;
            default:
                System.out.println("Vuelva a intentarlo");
                break;
        }


        //18 Escriba programa para ingresar 4 notas
        // de un alumno, calcular y mostrar su
        //promedio, sabiendo que la primera y segunda
        // tiene 20% de peso cada una, la
        //tercera y cuarta tienen 30% de peso cada una.
        System.out.println("\n Ejercicio 18");
        System.out.println("Ingrese sus 4 notas: ");
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();
        float nota4 = scan.nextFloat();
        float notamedia = (nota1 * 0.2f) + (nota2 * 0.2f) + (nota3 * 0.3f) + (nota4 * 0.3f);
        System.out.println("Su nota media es: " + notamedia);

        //19 Desarrolle un programa que pida cuantos
        // hombres y mujeres hay en un aula y
        //permita calcular el porcentaje de hombres y mujeres.
        System.out.println("\n Ejercicio 19");
        System.out.print("Ingrese el número de hombres: ");
        int hombres = scan.nextInt();
        System.out.print("Ingrese el número de mujeres: ");
        int mujeres = scan.nextInt();
        int totalPersonas = hombres + mujeres;
        float prcHomb = (hombres * 100f) / totalPersonas;
        float prcMuj = (mujeres * 100f) / totalPersonas;
        System.out.println("Hay un " + prcHomb + "% de hombres");
        System.out.println("Hay un " + prcMuj + "% de mujeres");


        //21 Lea dos numeros enteros e intercambia sus valores (SWAPING)
        System.out.println("\n Ejercicio 21");
        System.out.print("Ingrese el número 1: ");
        int num1 = scan.nextInt();
        System.out.print("Ingrese el número 2: ");
        int num2 = scan.nextInt();
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
        System.out.println(num1 + " ," + num2);

        //22 Lea 2 números e imprima de manera creciente
        System.out.println("\n Ejercicio 22");
        System.out.print("Ingrese el número 1: ");
        int ej22num1 = scan.nextInt();
        System.out.print("Ingrese el número 2: ");
        int ej22num2 = scan.nextInt();
        System.out.print("De menor a mayor: ");
        if (ej22num1 > ej22num2) {
            System.out.println(ej22num2 + " ," + ej22num1);
        } else {
            System.out.println(ej22num1 + " ," + ej22num2);
        }

        //23
        System.out.println("\n Ejercicio 23");
        System.out.print("Ingrese el número 1: ");
        int ej23num1 = scan.nextInt();
        System.out.print("Ingrese el número 2: ");
        int ej23num2 = scan.nextInt();
        System.out.print("Ingrese el número 3: ");
        int ej23num3 = scan.nextInt();
        tmp = 0;
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

        //24
        System.out.println("\n Ejercicio 24");
        System.out.println(ej23num3 + " ," + ej23num2 + " ," + ej23num1);



        // 26 Lea un número y determine si es múltiplo de 10
        System.out.println("\n Ejercicio 25");
        System.out.print("Ingrese el número: ");
        int ej25num = scan.nextInt();
        if (ej25num % 10 == 0) {
            System.out.println("Es múltiplo de 10");
        } else {
            System.out.println("no es múltiplo de 10");
        }

        //26
        System.out.println("\n Ejercicio 26");
        System.out.print("Ingrese un número de tres cifras: ");
        int ej26 = scan.nextInt();
        int cent = ej26 / 100;
        int dec = (ej26 % 100) / 10;
        int unid = ej26 % 10;

        System.out.println(cent);
        System.out.println(dec);
        System.out.println(unid);


        //27 CalculadoraInversa
        /*Lee por pantalla 2 operandos (int) y un signo aritmético (String)
        Según este último se realizará la operación correspondiente
        se imprime el resultado
         */
        System.out.println("\n Ejercicio 27");
        System.out.println("Ingrese dos números: ");
        int ej27num1 = scan.nextInt();
        int ej27num2 = scan.nextInt();
        System.out.print("Ingrese el operando: ");
        String ej27oper = scan.next();
        double respuesta = 0;
        switch (ej27oper) {
            case ("+"):
                respuesta = (ej27num1 + ej27num2);
                break;
            case ("-"):
                respuesta = (ej27num1 - ej27num2);
                break;
            case ("*"):
                respuesta = (ej27num1 * ej27num2);
                break;
            case ("/"):
                respuesta = (ej27num1 / ej27num2);
                break;
            case ("%"):
                respuesta = (ej27num1 % ej27num2);
                break;
            default:
                System.out.println("No válido");
        }
        System.out.println(respuesta);

        //28En un casino de juegos se desea mostrar
        // los mensajes respectivos por el puntaje
        //obtenido en el lanzamiento de tres dados
        // de un cliente, de acuerdo a los siguientes
        //resultados:
        System.out.println("\n Ejercicio 25");
        Random rng = new Random();

        int dado1 = rng.nextInt(6) +1;
        int dado2 = rng.nextInt(6) +1;
        int dado3 = rng.nextInt(6) +1;

        boolean caso1 = dado1 == 6 && dado2 == 6 && dado3 == 6;
        boolean caso2 = (dado1 == 6 && dado2 == 6) || (dado2 == 6 && dado3 == 6) || (dado1 == 6 && dado3 == 6);
        boolean caso3 = dado1 == 6 || dado2 == 6 || dado3 == 6;
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);

        if (caso1){ System.out.println("Muy Buena Suerte");}
        else if(caso2){ System.out.println("Buena Suerte");}
        else if(caso3){ System.out.println("Mala Suerte");}
        else{ System.out.println("Muy Mala Suerte");}



    }
}
