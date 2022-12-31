package java8.Optional;

//Optional is just a container that either has something in it or doesn't.
public class OldCall {

    public static void main(String[] args) {

        Cat myCat = findCatByName("Fred");
        if (myCat != null )
            System.out.println(myCat.getAge());
        else
            System.out.println(0);
    }


     private static Cat findCatByName(String name){
        Cat cat = new Cat(name,3);

        return null;
    }
}
