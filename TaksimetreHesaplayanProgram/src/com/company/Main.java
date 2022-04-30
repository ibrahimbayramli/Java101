package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float taksimetre = 10;
        float ucret = 2.20f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kac Km gittiniz: ");
        float km = scan.nextFloat();

        float tutar = km * ucret + taksimetre;

        if (tutar < 20) tutar = 20;

        System.out.println("Odemeniz gereken tutar: " + tutar);

    }
}
