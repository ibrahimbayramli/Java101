package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz (metre): ");
        double boy = scan.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double kilo = scan.nextDouble();


        double indeks = kilo / Math.pow(boy, 2);


        System.out.printf("Vucut kitle indeksiniz: %.5f", indeks);


    }
}
