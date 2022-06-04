import java.util.Scanner;

public class Main {
    public static boolean isPalindrom(int num){
        String myStr=Integer.toString(num);
        int digit=myStr.length();
        String newStr="";
        for(int i=1;i<=digit;i++){
            newStr+=myStr.substring(i-1,i);
        }

        if (newStr.equals(myStr)) return true;
        else return false;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int retVal=scan.nextInt();

        if(isPalindrom(retVal)) System.out.println("Girdiginiz sayi polindrom bir sayidir.");
        else System.out.println("Girdiginiz sayi polindrom bir sayi degildir.");
    }
}