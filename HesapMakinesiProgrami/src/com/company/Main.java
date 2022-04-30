package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Yapmak istediginiz islemi giriniz:");
	    System.out.println("1- Toplama");
	    System.out.println("2- Cikarma");
	    System.out.println("3- Carpma");
	    System.out.println("4- Bolme");
    System.out.println();

    Scanner scan =new Scanner(System.in);

        int secim=scan.nextInt();
    System.out.print("1. sayiyi giriniz: ");
    int sayi1=scan.nextInt();
    System.out.print("2. sayiyi giriniz: ");
    int sayi2=scan.nextInt();
    float sonuc=0;

    switch (secim) {
        case 1:
            sonuc=sayi1+sayi2;
            break;
        case 2:
            sonuc=sayi1-sayi2;
            break;
        case 3:
            sonuc=sayi1*sayi2;
            break;
        case 4:
            sonuc=sayi1/sayi2;
            break;
    }
    System.out.println("Sonuc: "+sonuc);



    }
}
