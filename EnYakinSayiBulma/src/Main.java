import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myArr = new ArrayList<Integer>();

        myArr.add(15);
        myArr.add(12);
        myArr.add(788);
        myArr.add(1);
        myArr.add(-1);
        myArr.add(-778);
        myArr.add(2);
        myArr.add(0);

        Scanner scan = new Scanner(System.in);
        System.out.print("Numara giriniz: ");
        int num = scan.nextInt();
        scan.close();
        myArr.add(num);
        Collections.sort(myArr);
        int index = myArr.indexOf(num);

        System.out.println("Girilen sayidan kucuk en yakin sayi: " + myArr.get(index-1));
        System.out.println("Girilen sayidan buyuk en yakin sayi:" + myArr.get(index+1));


    }
}