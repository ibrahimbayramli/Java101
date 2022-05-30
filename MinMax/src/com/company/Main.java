package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz: ");
        int sayi=scan.nextInt();
        int min=0,max=0;
        for (int i=1;i<=sayi;i++){
            System.out.print(i+". sayiyi giriniz: ");
            int num=scan.nextInt();
            if(num>max) max=num;
            if(num<min) min=num;
        }

        System.out.println("En buyuk sayi: "+max);
        System.out.println("En kucuk sayi: "+min);
    }
}
