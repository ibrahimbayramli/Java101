
import java.util.Scanner;


public class Main {
    public static int sayac=1;

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1=0,num2=0;
        System.out.println(sayac);
        do{
           int secim=menu();
           switch (secim){
               case 1:
                   System.out.print("1. sayiyi giriniz: ");
                   num1=scan.nextInt();
                   System.out.print("2. sayiyi giriniz: ");
                   num2=scan.nextInt();
                   System.out.println("Isleminizin sonucu: "+topla(num1,num2));
                   break;
               case 2:
                   System.out.print("1. sayiyi giriniz: ");
                   num1=scan.nextInt();
                   System.out.print("2. sayiyi giriniz: ");
                   num2=scan.nextInt();
                   System.out.println("Isleminizin sonucu: "+cikarma(num1,num2));
                   break;
               case 3:
                   System.out.print("1. sayiyi giriniz: ");
                   num1=scan.nextInt();
                   System.out.print("2. sayiyi giriniz: ");
                   num2=scan.nextInt();
                   System.out.println("Isleminizin sonucu: "+carpma(num1,num2));
                   break;
               case 4:
                   System.out.print("1. sayiyi giriniz: ");
                   num1=scan.nextInt();
                   System.out.print("2. sayiyi giriniz: ");
                   num2=scan.nextInt();
                   System.out.println("Isleminizin sonucu: "+bolme(num1,num2));
                   break;
               case 5:
                   System.out.print("Taban sayiyisini giriniz: ");
                   num1=scan.nextInt();
                   System.out.print("Us sayiyisini giriniz: ");
                   num2=scan.nextInt();
                   System.out.println("İsleminizin sonucu: "+kuvvet(num1,num2));
                   break;
               case 6:
                   System.out.print("Faktoriyel sayisini giriniz: ");
                   num1=scan.nextInt();

                   System.out.println("Isleminizin sonucu: "+faktoriyel(num1));
                   break;
               case 7:
                   System.out.print("1. sayiyi giriniz: ");
                   num1=scan.nextInt();
                   System.out.print("2. sayiyi giriniz: ");
                   num2=scan.nextInt();
                   System.out.println("Isleminizin sonucu: "+mod(num1,num2));
                   break;
               case 8:
                   System.out.print("1. kenari giriniz: ");
                   num1=scan.nextInt();
                   System.out.print("2. kenari giriniz: ");
                   num2=scan.nextInt();
                   System.out.println("Dikdortgenin alani: "+dikdortgenAlan(num1,num2));
                   System.out.println("Dikdortgenin cevresi: "+dikdortgenCevre(num1,num2));
                   break;
           }

        }while (sayac!=0);



    }

    static int menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("0- Cikis");
        System.out.println("1- Toplama");
        System.out.println("2- Cikarma");
        System.out.println("3- carpma");
        System.out.println("4- Bolme");
        System.out.println("5- Uslu hesaplama");
        System.out.println("6- Faktoriyel hesaplama");
        System.out.println("7- Mod alma");
        System.out.println("8- Dikdortgenin alani ve cevresini hesaplama");
        System.out.print("Yapmak istediginiz islemi seciniz: ");
        int secim=scan.nextInt();
        if(secim==0) sayac=0;
        return secim;
    }
    static int topla(int num1,int num2){
        return num1+num2;
    }
    static int cikarma(int num1,int num2){
        return num1-num2;
    }
    static double carpma(int num1,int num2){
        return num1*num2;
    }
    static double bolme(int num1,int num2){
        return num1/num2;
    }
    static double kuvvet(int num1,int num2){
        return Math.pow(num1,num2);
    }
    static int faktoriyel(int num){
        if(num==0||num==1) return 1;
        return faktoriyel(num-1)*num;
    }
    static int mod(int num1,int num2){
        return num1%num2;
    }
    static double dikdortgenAlan(int num1,int num2){
        return num1*num2;
    }
    static double dikdortgenCevre(int num1,int num2){
        return (num1+num2)*2;
    }
}