package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Do�du�unuz ay� giriniz (1-12): ");
        int ay = scan.nextInt();

        System.out.print("Do�du�unuz g�n� giriniz: ");
        int gun = scan.nextInt();

        if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println("Burcunuz: KO�");
        } else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            System.out.println("Burcunuz: BO�A");
        } else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            System.out.println("Burcunuz: �K�ZLER");
        } else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            System.out.println("Burcunuz: YENGE�");
        } else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println("Burcunuz: ASLAN");
        } else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.println("Burcunuz: BA�AK");
        } else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.println("Burcunuz: TERAZ�");
        } else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println("Burcunuz: AKREP");
        } else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println("Burcunuz: YAY");
        } else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            System.out.println("Burcunuz: O�LAK");
        } else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            System.out.println("Burcunuz: KOVA");
        } else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.println("Burcunuz: BALIK");
        } else {
            System.out.println("Ge�erli bir tarih girmediniz.");
        }
    }
}
