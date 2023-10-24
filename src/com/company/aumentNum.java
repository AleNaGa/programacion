package com.company;

public class aumentNum {
    public static void main(String[] args) {

        int edadJuan = 35;
        int edadJulia = 19;
        int edadTotal = edadJuan + edadJulia;
        edadTotal++;
        System.out.println(edadTotal);
        edadTotal = edadTotal + 2;
        edadTotal += 2;
        edadTotal *= 2;
        edadTotal /= 2;

        System.out.println(edadTotal);

    }
}
