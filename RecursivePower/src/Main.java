import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban degerini giriniz: ");
        int taban=scan.nextInt();
        System.out.print("Us degerini giriniz: ");
        int us= scan.nextInt();
        System.out.println("Sonuc: "+power(taban,us));
    }
    static int power(int taban,int us){
        us--;
        if(us==-1) return 1;
        return power(taban,us)*taban;
    }
}