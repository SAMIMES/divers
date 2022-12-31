package java8.Optional;

import java.util.Optional;

//Optional is just a container that either has something in it or doesn't.
public class WithOptional {

    public static void main(String[] args) {
        Optional<Cat> optionalCat = findCatByName("kamy");
        if(optionalCat.isPresent()) {
            System.out.println(optionalCat.get().getAge());
        }
        else
            System.out.println("no value");
    }


    private static Optional<Cat> findCatByName(String name){

        Cat myCat = new Cat(name,5);

        //if is null, it will create an empty Optional
        //return Optional.ofNullable(myCat);
        return Optional.ofNullable(null);

    }
}
