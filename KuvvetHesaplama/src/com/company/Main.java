package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Sýnýr sayýyý giriniz: ");
        int sinir = scan.nextInt();
        for (int i = 1, j = 1; i <= sinir && j <= sinir; i *= 4, j *= 5) {
            System.out.println(i + " , " + j);
        }
    }
}
