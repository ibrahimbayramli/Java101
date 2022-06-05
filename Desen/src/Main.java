import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num=scan.nextInt();
        arttir(azalt(num), num);
    }
    static int azalt(int num){
        if (num <= 0) {
            return num;
        } else {
            System.out.print(num + " ");
            return azalt(num - 5);
        }
    }
    static int arttir(int num, int num1) {
        if (num > num1) {
            return num;
        } else {
            System.out.print(num + " ");
            return arttir(num + 5, num1);
        }

    }
}