import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.print("Bir n sayisi giriniz: ");
        int sayi=scan.nextInt();

        double result=1;

        for(int i=2;i<=sayi;i++){
            result+=(1/(double)i);
        }

        System.out.println("Sonuc: "+result);
    }
}