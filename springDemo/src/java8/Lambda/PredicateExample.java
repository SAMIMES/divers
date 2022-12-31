package java8.Lambda;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * In Java 8, the Predicate<T> functional interface represents a predicate (a boolean-valued function) of one argument.
 * It has a single method, test(T t), which returns a boolean value.
 */
public class PredicateExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");
        Predicate<String> longWordPredicate = s -> s.length() > 5;

        List<String> longWords = words.stream()
                .filter(longWordPredicate)
                .collect(Collectors.toList());

        System.out.println(longWords);




    }
}
