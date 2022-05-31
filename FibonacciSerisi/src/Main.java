import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n=scan.nextInt();

        int[] myFib=new int[n+1];
        myFib[0]=0;
        myFib[1]=1;
        myFib[2]=1;
        for(int i=3;i<=n;i++){
            myFib[i]=myFib[i-1]+myFib[i-2];
        }
        for(int i:myFib){
            System.out.print(i+" ");
        }

    }
}