package com.company;

public class Día2 {
//OPERADORES LÓGICOS
    public static void main(String[] args) {
        boolean sonIguales = 3 == 4;
        boolean sonDistintos = 3 != 4;
        System.out.println(sonIguales);
        System.out.println(sonDistintos);

        System.out.println(sonIguales && sonDistintos);


        int edadMaria = 30;
        int edadSamuel = 40;
        int edadJesus = 20;
        System.out.println(edadMaria < edadSamuel);
        System.out.println(edadMaria < edadMaria);

        boolean mariaMenorSamuel = (edadMaria < edadSamuel);
        System.out.println(mariaMenorSamuel);

        boolean mariaMenorJesus = (edadMaria < edadJesus);
        System.out.println(mariaMenorJesus);

        boolean mariaEsLaMayor = (edadMaria>edadJesus) && (edadMaria > edadSamuel);
        System.out.println(mariaEsLaMayor);

        boolean mariaEsMayorQueAlguno = (edadMaria>edadJesus) || (edadMaria > edadSamuel);
        System.out.println(mariaEsMayorQueAlguno);

        boolean mariaNoEsLaMayor = (edadJesus>edadMaria) || (edadSamuel>edadMaria);
        System.out.println(mariaNoEsLaMayor);

        boolean mariaNoMayor = !mariaEsLaMayor;
        System.out.println(mariaNoMayor);






    }
}
