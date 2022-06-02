import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n=scan.nextInt();

        Long[] myFib=new Long[n+1];
        myFib[0]=0l;
        myFib[1]=1l;
        myFib[2]=1l;
        for(int i=3;i<=n;i++){
            myFib[i]=myFib[i-1]+myFib[i-2];
        }
        for(Long i:myFib){
            System.out.print(i+" ");
        }

    }
}