package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Patika JAVA 101

        String userName,password;
        Scanner scan=new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName=scan.nextLine();
        System.out.print("Şifreniz: ");
        password=scan.nextLine();

        if(userName.equals("patika") && password.equals("java123")) System.out.println("Giriş yaptınız.");
        else System.out.println("Bilgileriniz hatalı.");

    }
}
