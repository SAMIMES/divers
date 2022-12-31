package java8.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * In Java 8, the Supplier<T> functional interface represents a supplier of results.
 * It has a single method, get(), which returns an instance of the specified type T.
 *
 * Note that the Supplier<T> interface does not take any arguments and does not throw any checked exceptions.
 * It is often used as a factory for creating objects or as a way to generate values without any side effects.
 */
public class SupplierExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Supplier<Integer> supplier5 = () -> { return numbers.get(4); };

        System.out.println(supplier5.get());





    }
}
