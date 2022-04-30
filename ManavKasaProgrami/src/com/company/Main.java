package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final float a = 2.14f;
        final float e = 3.67f;
        final float d = 1.11f;
        final float m = 0.95f;
        final float p = 5.0f;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kac kilo armut aldiniz: ");
        float armut = scan.nextFloat();
        System.out.print("Kac kilo elma aldiniz: ");
        float elma = scan.nextFloat();
        System.out.print("Kac kilo domates aldiniz: ");
        float domates = scan.nextFloat();
        System.out.print("Kac kilo muz aldiniz: ");
        float muz = scan.nextFloat();
        System.out.print("Kac kilo patlican aldiniz: ");
        float patlican = scan.nextFloat();

        float tutar = a * armut + e * elma + d * domates + m * muz + p * patlican;

        System.out.printf("Odemeniz gereken toplam tutar: %.3f", tutar);


    }
}
