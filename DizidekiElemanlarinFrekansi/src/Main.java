import java.util.*;

public class Main {

    public static void main(String[] args) {
	    List<Integer> myList=new ArrayList<Integer>(Arrays.asList(10, 20, 20, 10, 10, 20, 5, 20));
        Set<Integer> mySet=new HashSet<>(myList);
        List<Integer> newSet=new ArrayList<>();

        for (int i:mySet){
            newSet.add(i);
        }
        Collections.sort(newSet);

        for (int j:newSet){
            System.out.println(j+" sayisi "+Collections.frequency(newSet,j)+" defa tekrar etti.");
        }
    }
}
