package FindPosition;

import java.util.ArrayList;
import java.util.Arrays;

public class Kata {

    public static String alphabets = "abcdefghijklmnopqrstuvwxyz";

    public static String position(char alphabet) {

        return   "Position of alphabet:"+ alphabets.indexOf(alphabet +1);
    }

    public static void main(String[] args) {

        System.out.println(position('a'));
        System.out.println(position('d'));

    }

    /***
     *     return "Position of alphabet: " + ((int) alphabet - 96);
     */

}
