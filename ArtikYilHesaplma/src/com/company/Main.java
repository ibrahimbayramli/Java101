package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Y�l giriniz: ");
        int yil=scan.nextInt();
        if(yil%100==0){
            if(yil%400==0){
                System.out.println(yil+" bir art�k y�ld�r.");
            }else {
                System.out.println(yil+" bir art�k y�l de�ildir.");
            }
        }else{
            if(yil%4==0){
                System.out.println(yil+" bir art�k y�ld�r.");
            }else {
                System.out.println(yil+" bir art�k y�l de�ildir.");
            }
        }

    }
}
