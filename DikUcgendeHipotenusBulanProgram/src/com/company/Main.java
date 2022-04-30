package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("Ucgenin 1. kenarini giniz: ");
    double a=scan.nextDouble();
    System.out.print("Ucgenin 2. kenarini giniz: ");
    double b=scan.nextDouble();
    System.out.print("Ucgenin 3. kenarini giniz: ");
    double c=scan.nextDouble();

    double u=(a+b+c)/2;

    double alan=u*(u-a)*(u-b)*(u-c);


    alan=Math.sqrt(alan);
    System.out.println("Girdiginiz ucgenin alani: " + alan);




    }
}
