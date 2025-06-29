package advancedConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    }
    /*
    1. Use Stream<Generic> with generics, dont rely much on the primitive streams
    2. Try using the Collection data structure, rather than using the primitive arrays
     */
}
