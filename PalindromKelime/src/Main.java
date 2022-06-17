import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String kelime=scan.next();
        scan.close();
        if(isPalindrom(kelime)){
            System.out.println("PALINDROM");
        }else {
            System.out.println("NOT PALINDROM");
        }


    }
    public static boolean isPalindrom(String kelime){
         String myWord="";
         for (int i=kelime.length();i>=1;i--){
             myWord+=kelime.substring(i-1,i);
         }

         return kelime.equals(myWord);
    }
}