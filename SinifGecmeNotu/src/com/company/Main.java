package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik, sayac;
        sayac = 0;
        System.out.print("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        if (mat < 0 || mat > 100) mat = 0;
        else sayac++;

        System.out.print("fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        if (fizik < 0 || fizik > 100) fizik = 0;
        else sayac++;

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = scan.nextInt();
        if (turkce < 0 || turkce > 100) turkce = 0;
        else sayac++;

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        if (kimya < 0 || kimya > 100) kimya = 0;
        else sayac++;

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = scan.nextInt();
        if (muzik < 0 || muzik > 100) muzik = 0;
        else sayac++;

        double avarage = (mat + fizik + turkce + kimya + muzik) / sayac;
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız: " + avarage);


        } else {
            System.out.println("Geçtiniz.");
            System.out.println("Ortalamanız: " + avarage);

        }
    }
}
