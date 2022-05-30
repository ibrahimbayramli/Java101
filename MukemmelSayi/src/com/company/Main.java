package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi=scan.nextInt();
        int bolen=0;

        for (int i=1;i<sayi;i++){
            if(sayi%i==0) bolen+=i;
            else continue;
        }
        if(bolen==sayi) System.out.println("Girdiginiz "+sayi+" sayisi mukemmel sayidir.");
        else System.out.println("Girdiginiz "+sayi+" sayisi mukemmel sayi degildir.");
    }
}
