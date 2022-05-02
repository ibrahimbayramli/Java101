package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Patika JAVA 101
        Scanner scan=new Scanner(System.in);

	    System.out.print("Ürün tutarini giriniz: ");
        float tutar=scan.nextFloat();
        float odeme;

        if(tutar>=0 && tutar<=1000) odeme=tutar*1.18f;
        else odeme=tutar*1.08f;

        System.out.println("Ödenmesi gereken tutar: " + odeme);


    }
}
