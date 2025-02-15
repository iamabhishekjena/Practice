import java.util.*;

public class CollectionsLearn {
    public static void main(String args[]){
//        List<Integer> list= new ArrayList<>();
//        for(int i=1;i<=10;i++){
//            list.add(i);
//        }
//
//        System.out.println("max: "+Collections.max(list));
//        System.out.println("min: "+Collections.min(list));
//        System.out.println("binarySearch: "+Collections.binarySearch(list,8));
//        Collections.sort(list,(a, b) -> b-a);
//        Iterator<Integer> valuesIterator = list.iterator();
//        while(valuesIterator.hasNext()){
//            int val = valuesIterator.next();
//            System.out.println(val);
//        }
//        System.out.println("binarySearch: "+Collections.binarySearch(list,8));
        Integer[] arr= {17,5,7,8,10};

        Arrays.sort(arr,(Integer a,Integer b)-> a-b);
    }
}
