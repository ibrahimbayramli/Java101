public class Main {
    static int factorial(int myNum){
        if(myNum==1 || myNum==0){
            return 1;
        }
        return factorial(myNum-1)*myNum;
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}