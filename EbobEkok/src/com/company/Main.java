package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        int sayi1=scan.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        int sayi2=scan.nextInt();
        int bigger,lower,ebob=1,ekok;

        if(sayi1>sayi2){
            bigger=sayi1;
            lower=sayi2;
        }else {
            bigger=sayi2;
            lower=sayi1;
        }
        int sayac=1;
        while (sayac<=lower){
            if (bigger%sayac==0 && lower%sayac==0)
                ebob=sayac;
            sayac++;
        }
        ekok=(bigger*lower)/ebob;

        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);
    }
}
