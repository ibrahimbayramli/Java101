import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        String sayi = scan.nextLine();
        int result=0;
        int basamakSayisi=sayi.length();
//        String[] myStr=new String[basamakSayisi];

        for (int i=1;i<sayi.length()+1;i++){
            result+=Integer.valueOf(sayi.substring(i-1,i));
        }





        System.out.println("Basamak sayisi: "+basamakSayisi);
        System.out.println("Basamak toplami: " + result);
    }
}