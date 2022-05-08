package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        System.out.print("Matematik notunuzu giriniz: ");
        mat=scan.nextInt();

        System.out.print("fizik notunuzu giriniz: ");
        fizik=scan.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce=scan.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=scan.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik=scan.nextInt();

        double avarage=(mat+fizik+turkce+kimya+muzik)/5;
        if(avarage<=55){
            System.out.println("Sınıfta kaldınız. Seneye tekrar görüşmek üzere!");
            System.out.println("Ortalamanız: "+avarage);

        }else {
            System.out.println("Geçtiniz.");
            System.out.println("Ortalamanız: "+avarage);

        }
    }
}
