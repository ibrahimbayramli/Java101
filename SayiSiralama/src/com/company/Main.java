package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int sayi1,sayi2,sayi3,enBuyuk;
        Scanner scan=new Scanner(System.in);
        System.out.print("Birinci sayýyý giriniz: ");
        sayi1=scan.nextInt();
        System.out.print("Ýkinci sayýyý giriniz: ");
        sayi2=scan.nextInt();
        System.out.print("Üçüncü sayýyý giriniz: ");
        sayi3=scan.nextInt();
        if(sayi1>sayi2 && sayi1>sayi3) enBuyuk=sayi1;
        else if (sayi2>sayi1 && sayi2>sayi3) enBuyuk=sayi2;
        else enBuyuk=sayi3;
        System.out.println("En büyük sayý: "+enBuyuk);
    }
}
