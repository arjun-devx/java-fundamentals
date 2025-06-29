package advancedConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        //Streams from Data Structure
        //Streams -> Generics, stream of primitives
        IntStream intStream = Arrays.stream(arr); //stream of primitives

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
        Stream<Integer> listStream = list.stream();

        Stream<Integer> directIntStream = Stream.of(1,2,3,4,5,6,7,8,9);
        Stream<String> directStringStream = Stream.of("Ram", "Shyam");
        Stream<Boolean> directBooleanStream = Stream.of(true,false, true);
        Stream<Dog> directStreamDog = Stream.of(new Dog(), new Dog(), new Dog());

        List<String> names = Arrays.asList("Arjun", "Agasytya", "Abhimanyu", "Bhim", "Sahdev", "Nakul", "Yudhishthir");
        names.stream()
                .filter(n -> n.startsWith("A"))
                .forEach(n -> System.out.println(n));
        System.out.println("--------------------------");
        names.stream()
                .filter(n -> n.length() > 4)
                .forEach(n -> System.out.println(n));
        List<String> upperCaseNames = names.stream()
                .map(String :: toUpperCase).sorted()
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);
    }
    /*
    1. Use Stream<Generic> with generics, dont rely much on the primitive streams
    2. Try using the Collection data structure, rather than using the primitive arrays
     */
}
