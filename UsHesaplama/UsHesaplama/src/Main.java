import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,k,result;
        Scanner scan=new Scanner(System.in);
        System.out.print("Ussu alinacak sayiyi giriniz: ");
        n=scan.nextInt();
        System.out.print("Kuvveti giriniz: ");
        k= scan.nextInt();
        result=n;
        for(int i=1;i<k;i++){
            result*=n;
        }
        System.out.println("Sonuc: "+result);
    }
}