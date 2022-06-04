import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num=scan.nextInt();
        int num1=num;

        if(asalMi(num,num1)) System.out.println("Girdiginiz sayi asaldir.");
        else System.out.println("Girdiginiz sayi asal degildir.");
    }

    static boolean asalMi(int num,int num1){
        num1--;
        if(num1==1) return true;
        if(num==2) return true;
        if(num%num1==0) return false;
        return asalMi(num,num1);
    }
}