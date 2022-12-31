package java8.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * In this example, the Consumer<Integer> interface is implemented using a lambda expression,
 * which takes an integer as input and prints the square of the integer to the console.
 * The Consumer<Integer> is then passed to the forEach method of the list,
 * which applies the accept method to each element in the list.
 * This will print the squares of each integer in the list to the console.
 */
public class ConsumerExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        Consumer<Integer> consumer= nb -> System.out.println(nb * nb);

        numbers.forEach(consumer);



    }
}
