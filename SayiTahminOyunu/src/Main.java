import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double rnd=Math.floor(Math.random()*101);

        System.out.print("Tahmininizi giriniz: ");
        int tahmin=scan.nextInt();
        int sayac=3;

        if(tahmin==rnd){
            System.out.println("Tebrikler!!!");
        }else {
            while (sayac>0){
                System.out.print("Tekrar bir tahminde bulununuz: ");
                tahmin= scan.nextInt();
                if (tahmin==rnd){
                    System.out.println("Tebrikler!!!");
                    break;
                }
                sayac--;
            }

        }
        if (sayac==0){
            System.out.println("Kaybettiniz!!");
        }


    }
}