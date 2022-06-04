public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }
   public static int fibonacci(int num){
        if(num==1 || num==2) return 1;
        return fibonacci(num-2)+fibonacci(num-1);
   }
}