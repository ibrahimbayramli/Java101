package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("n sayýsýný giriniz: ");
        int n=scan.nextInt();

        System.out.print("r sayýsýný giriniz: ");
        int r=scan.nextInt();

        double kombinasyon;
        kombinasyon=(Faktoryel(n))/(Faktoryel(r)*Faktoryel(n-r));
        System.out.println("Hesaplanan kombinasyon: "+kombinasyon);
    }
    public static int Faktoryel(int sayi){
        int faktoryel=1;
        for (int i=1;i<=sayi;i++){
            faktoryel*=i;
        }
        return faktoryel;
    }
}
