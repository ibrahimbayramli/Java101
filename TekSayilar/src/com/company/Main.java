package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n,toplam=0;

        do{
            System.out.print("Bir sayý giriniz: ");
            n=scan.nextInt();

            if(n%2==1) break;
            if(n%4==0) toplam+=n;


        }while (n>0);

        System.out.println("Sayýlarýn toplamý: "+toplam);
    }
}
