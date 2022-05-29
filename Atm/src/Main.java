import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayac = 3;
        Scanner scan = new Scanner(System.in);
        double tutar=0;
        String kAdi="admin";
        String kSifre="admin";

        //*? Kullanici girisi baslangic

        while (sayac > 0) {
            System.out.println("Kalan giris hakkiniz: " + sayac);
            System.out.print("Kullanici adinizi giriniz: ");
            String kullaniciAdi = scan.nextLine();
            System.out.print("Sifrenizi giriniz: ");
            String sifre = scan.nextLine();
            if (sifre.equals(kSifre) && kullaniciAdi.equals(kAdi)) {
                System.out.println("Giris basarili.");
                break;
            }
            else System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz.");

            if (sayac == 1) System.out.println("Hatali giris hakkinizi doldu. Lutfen 30 dk bekleyiniz.");

            sayac--;

        }
        //*? Kullanici girisi bitis

        double bakiye=1500;
        System.out.println("Bakiyeniz: "+bakiye);
        System.out.println("Yapmak istediginiz islemi seciniz: ");
        System.out.println("1- Para yatirma.");
        System.out.println("2- Para cekme.");
        System.out.println("3- Sifre degistirme.");
        int secim=scan.nextInt();
        switch (secim){
            case 1:
                System.out.print("Yatirmak istediginiz tutari giriniz: ");
                tutar=scan.nextDouble();
                bakiye+=tutar;
                System.out.println("Bakiyeniz: "+bakiye);

                break;
            case 2:
                System.out.print("Cekmek istediginiz tutari giriniz: ");
                tutar=scan.nextDouble();
                bakiye-=tutar;
                System.out.println("Bakiyeniz: "+bakiye);
                break;
            case 3:
                System.out.print("Yeni kullanici adinizi giriniz: ");
                kAdi=scan.nextLine();
                System.out.print("Yeni sifrenizi giriniz: ");
                kSifre=scan.nextLine();

                break;
        }




    }
}