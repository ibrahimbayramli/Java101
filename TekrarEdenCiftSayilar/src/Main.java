import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList=new ArrayList<Integer>(Arrays.asList(3,7,3,3,2,9,10,21,1,33,9,1,2,10));
        Set<Integer> mySet=new HashSet<Integer>();
        for(int i:myList){
            if(Collections.frequency(myList,i)>1 && i%2==0){
                mySet.add(i);
            }
        }

        System.out.println(mySet);

    }
}