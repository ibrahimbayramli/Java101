package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1, sayi2, sayi3, rakam1=0, rakam2=0, rakam3=0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scan.nextInt();

        System.out.print("Üçüncü sayıyı giriniz: ");
        sayi3 = scan.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            rakam1 = sayi1;
            if (sayi2 > sayi3) {
                rakam2 = sayi2;
                rakam3 = sayi3;
            }
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            rakam1 = sayi2;
            if (sayi1 > sayi3) {
                rakam2 = sayi1;
                rakam3 = sayi3;
            }
        } else {
            rakam1 = sayi3;
            if (sayi2 > sayi1) {
                rakam2 = sayi2;
                rakam3 = sayi1;
            }
        }

        System.out.println("Sıralama: " + rakam3 + " " + rakam2 + " " + rakam1);
    }
}
