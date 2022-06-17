public class Main {
    public static void main(String[] args) {
       int[][] myMatris={{2,3,4},{5,6,4}};
       int row=myMatris.length;
       int column=myMatris[0].length;
       int[][] newMatris=new int[column][row];

       for(int i=0;i<newMatris.length;i++){
           for(int j=0;j<newMatris[i].length;j++){
               newMatris[i][j]=myMatris[j][i];
           }
       }
        System.out.println("Matris:");
        for(int[] i:myMatris){

            for(int j:i){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
        System.out.println("Transpoz:");
        for(int[] i:newMatris){

            for(int j:i){
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
    }
}