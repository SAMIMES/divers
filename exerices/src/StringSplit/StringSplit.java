package StringSplit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit {

    public static String[] solution(String s) {
        StringBuffer toAppend = new StringBuffer();
        ArrayList<String> splitedList = new ArrayList<>();

        int counter = 0;

        if (s.length() % 2 == 0) {
            for (Character c : s.toCharArray()) {
                toAppend.append(c);
                counter++;
                if (counter == 2) {
                    splitedList.add(toAppend.toString());
                    toAppend = new StringBuffer();
                    counter = 0;
                }
            }
        }
        else {
            int counterLengthString = 1;
            for (Character c : s.toCharArray()) {

                toAppend.append(c);
                counter++;
                if (counter == 2) {
                    splitedList.add(toAppend.toString());
                    toAppend = new StringBuffer();
                    counter = 0;
                }
                if(counterLengthString == s.length()){
                    toAppend.append('_');
                    splitedList.add(toAppend.toString());
                    break;
                }
                counterLengthString ++;
            }
        }

        String[] splitedArray = new String[splitedList.size()];
        splitedList.toArray(splitedArray);
        return splitedArray;
    }

    public static void main(String[] args) {
        String splitedString = Arrays.toString(solution("helloworlds"));
        System.out.println(splitedString);
    }

    //        s = (s.length() % 2 == 0)?s:s+"_";
    //        return s.split("(?<=\\G.{2})");

    /** OR **/
    //   if(s.length()%2==1) s+="_";
    //        int n=s.length()/2;
    //
    //
    //      String[] sub=new String[n];
    //      for(int i=0;i<n;++i)
    //      sub[i]=""+s.charAt(i*2)+s.charAt(1+i*2);
}
