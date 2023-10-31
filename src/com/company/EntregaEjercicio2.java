package com.company;
import java.util.Scanner;

public class EntregaEjercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //2
        boolean menu = true;// este boolean es el que mantiene el while
        do { //con el do while se imprime una vez y luego pregunta si continuamos
            System.out.print("Ingrese el primero número: ");
            double numero1 = scan.nextDouble();
            System.out.print("Ingrese el operando: ");
            String operando = scan.next(); // este String registra el operando que introduzca el usuario por pantalla
            System.out.print("Ingrese el segundo número: ");
            double numero2 = scan.nextDouble();

            double respuesta = 0; // este double será la solución de las operaciones de cada case
            switch (operando) {
                case ("+"):
                    respuesta = (numero1 + numero2);
                    break;
                case ("-"):
                    respuesta = (numero1 - numero2);
                    break;
                case ("*"):
                    respuesta = (numero1 * numero2);
                    break;
                case ("/"):
                    respuesta = (numero1 / numero2);
                    break;

                default:
                    System.out.println("No válido"); // por si se introduce cualquier otra cosa que no sea el operando
            }
            System.out.println(respuesta);
            System.out.print("¿Desea hacer otra operación? 1 continuar, 2 salir: ");
            int repetirOperacion = scan.nextInt();//si desea continuar ingresa un número que se almacena en esta variable
            if (repetirOperacion == 1){ //el numero de repetirOperación es el que determina si se continúa o no
                menu = true;

            }
            else{
                menu = false;
            }


        }while(menu);
        System.out.println("Gracias");
    }
}
