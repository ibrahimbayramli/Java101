package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayý giriniz: ");
        int sayi=scan.nextInt();

        int sayac=0;
        int toplam=0;

        for(int i=1;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                sayac++;
                toplam+=i;
            }
        }

        double ortalama=toplam/sayac;

        System.out.println("Hesaplanan sayýlarýn ortalamasý: "+ortalama);

    }
}
