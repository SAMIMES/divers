package DescendingOrder;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder  {
    public static int sortDesc(final int num) {

        String numStr = Integer.toString(num);

        Character[] chars = new Character[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            chars[i] = numStr.charAt(i);
        }

        Arrays.sort(chars, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder(chars.length);

        for (Character c : chars) {
            sb.append(c.charValue());
        }

        return Integer.parseInt(sb.toString());

    }



    public static void main(String[] args) {


        System.out.println(sortDesc(561231448));

    }

    /***
     *      public static int sortDesc(final int num) {
     *         String[] array = String.valueOf(num).split("");
     *         Arrays.sort(array, Collections.reverseOrder());
     *         return Integer.valueOf(String.join("", array));
     *     }
     */

}
