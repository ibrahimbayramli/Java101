package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Patika JAVA 101
        final float pi = 3.14f;

        Scanner scan = new Scanner(System.in);
        System.out.print("Yaricap giriniz: ");
        float yariCap = scan.nextFloat();

        float alan = pi * yariCap * yariCap;
        float cevre = 2 * pi * yariCap;

        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);


    }
}
