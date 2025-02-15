package Stream;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();

        list.add(1000);
        list.add(2000);
        list.add(3000);
        list.add(3100);
        list.add(4200);

        long count = list.stream().filter((Integer val)-> val>3000).count();
        System.out.println("No of elements bigger than 3000="+count);


        int[] salaryRange = new int[]{2400,1200,3001,3200,4000};
        long count2 = Arrays.stream(salaryRange).filter((int val)->val>3000).count();
        System.out.println("No of elements bigger than 3000 in 2nd part ="+count2);

        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(123).add(23323).add(3444);

        Stream<Integer> salaryList = streamBuilder.build();

        List<Integer> checkList = salaryList.filter((Integer val)-> val >2000).collect(Collectors.toList());
        for(int check:checkList){
            System.out.println(check);
        }

        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I","LOVE","JAVA"),
                Arrays.asList("CONCEPTS","ARE","CLEAR"),
                Arrays.asList("ITS","VERY","EASY")
        );

        Stream<String> wordStream = sentenceList.stream().flatMap((List<String> sentence) -> sentence.stream().map((String s) -> s.toLowerCase()));
        List<String> wordList = wordStream.collect(Collectors.toList());
        for(String word : wordList){
            System.out.println(word);
        }


        List<Integer> numberList = Arrays.asList(1,23,23,34,34,2,3,5);
        List<Integer> distinctList = numberList.stream()
                .distinct()
                .peek((Integer val)->System.out.println("Distinct values :"+val))
                .sorted()
                .peek((Integer val)->System.out.println("Sorted Val :"+val))
                .collect(Collectors.toList());

        List<Integer> maxTwoNum = numberList.stream()
                .distinct()
                .sorted((Integer a,Integer b) -> b-a)
                .limit(2)
                .peek((Integer val)->System.out.println("Maximum 2 values:"+val))
                .collect(Collectors.toList());

        int[] allVal = new int[]{1,2,3,5,5,6,8,10,12,13};
        IntStream numberStream = Arrays.stream(allVal);
        int[] evenVal = numberStream.filter((int val)-> val%2==0).peek((int val)->System.out.println(val)).toArray();


        List<String> numbers = Arrays.asList("1","2","3","4","5","6");
        IntStream numberStream1 = numbers.stream().mapToInt((String val)-> Integer.parseInt(val))
                .filter((int val)->val%2==0).peek((int val)-> System.out.println("printing:"+val));

        int[] evenVal1 = numberStream1.peek((int val)-> System.out.println("printing1:"+val)).toArray();

        numbers.stream()
                .mapToInt((String val)-> Integer.parseInt(val))
                .boxed()
                .forEach((Integer val)->System.out.println("printing 2:"+val));


        Optional<Integer> value =numbers.stream()
                .mapToInt((String val)-> Integer.parseInt(val))
                .boxed()
                .reduce((Integer v1,Integer v2)-> v1+v2);

        System.out.println(value.get());

        List<String> names = Arrays.asList("alice", "bob", "charlie");

        names.stream().map((String val) -> val.toUpperCase()).forEach((String val)-> System.out.println("names to upperCase:"+val));

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> sqNums = nums.stream().map((Integer val)->val*val).collect(Collectors.toList());

        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        nums1.stream().filter((Integer val)-> val%2==0).forEach((Integer val)-> System.out.println(val));


        List<String> words = Arrays.asList("dog", "cat", "elephant", "fox");
        words.stream().filter((String s)->s.length()>3).forEach((String val)-> System.out.println("Length bigger than 3:"+val));

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 2, 4, 5, 4);
        List<Integer> distinctRes = nums2.stream().distinct().collect(Collectors.toList());

        List<String> alphatetic = words.stream().sorted((String s1,String s2)-> s1.charAt(0)-s2.charAt(0)).peek((String val)-> System.out.println(val)).collect(Collectors.toList());


        List<String> words1 = Arrays.asList("apple", "banana", "cherry");
        Optional<String> concatWord = words1.stream().reduce((String s1,String s2)-> s1+s2);
        System.out.println(concatWord.get());

        List<Integer> numberList1 = new ArrayList<>();
        for(int i=0;i<100;i++){
            numberList1.add(i);
        }

        Optional<Integer> oddSum = numberList1.stream().filter((Integer val)-> val%2==1).reduce((Integer v1,Integer v2)-> v1+v2);
        System.out.println("OddSUm: "+oddSum.get());


        List<String> words3 = Arrays.asList("cat", "dog", "elephant", "ant");
        Map<Integer, List<String>> grouped = words3.stream().collect(Collectors.groupingBy((String s)->s.length()));
        for(Map.Entry<Integer,List<String>> entry:grouped.entrySet()){
            System.out.println("key:"+entry.getKey());
            entry.getValue().stream().forEach((String s)-> System.out.println("value:"+s));
        }

        List<Integer> nums4 = Arrays.asList(10, 20, 30, 5, 15);
        Optional<Integer> max = nums4.stream().sorted().max((Integer v1,Integer v2)->v1-v2);
        System.out.println("max:"+max.get());


        List<String> names1 = Arrays.asList("Alice", "Bob", "Charlie");
        Optional<String> first = names1.stream().findFirst();
        System.out.println("first: "+first.get());
    }

}
