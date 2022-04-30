package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Fizik notunuzu giriniz: ");
        int fizik= scan.nextInt();
        System.out.print("Matematik notunuzu giriniz: ");
        int matematik=scan.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        int turkce=scan.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        int kimya=scan.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        int tarih=scan.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        int muzik=scan.nextInt();

        float ortalama=(fizik+kimya+matematik+turkce+tarih+muzik)/6;

        System.out.println("Ortalaman?z: "+ortalama);


    }
}
