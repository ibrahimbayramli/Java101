import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Eleman sayisini giriniz: ");
        int n=scan.nextInt();
        List<Integer> myList=new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            System.out.print(i+". Eleman: ");
            int item=scan.nextInt();
            myList.add(item);
        }
        scan.close();
        Collections.sort(myList);
        System.out.print("Siralama: ");
        for(int i:myList){
            System.out.print(i+" ");
        }
    }
}