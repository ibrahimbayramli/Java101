package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Mesafeyi km t�r�nden giriniz: ");
        int mesafe = scan.nextInt();

        System.out.print("Ya��n�z� giriniz: ");
        int yas = scan.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ): ");
        int yolculukTipi = scan.nextInt();

        double biletFiyati=mesafe*0.1d;
        double indirimliTutar=0;
        if (yas > 0 && mesafe > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            if(yas<12){
                indirimliTutar=biletFiyati*0.5d;
            }
            else if((yas>12) && (yas<24)){
                indirimliTutar=biletFiyati*0.9d;
            }
            else if(yas>65){
                indirimliTutar=biletFiyati*0.7d;

            }
            if(yolculukTipi==2){
                indirimliTutar*=0.8d;
                indirimliTutar*=2;
            }
            if(indirimliTutar==0) indirimliTutar=biletFiyati;

        }
        else {
            System.out.println("Hatal� Veri Girdiniz !");
        }

        System.out.println("�denecek bilet tutar�: "+indirimliTutar);

    }
}
