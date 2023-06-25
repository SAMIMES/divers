package WhoLikesIt;

public class WhoLike {

    public static String whoLikesIt(String... names) {


        String results = names.length == 0 ? "no one likes this" :
                names.length == 1 ? names[0] + " likes this" :
                        names.length == 2 ? names[0] + " and " + names[1] + " like this" :
                                names.length == 3 ? names[0] + ", " + names[1] + " and " + names[2] + " like this" :
                                        names.length >= 4 ? names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this" : "";


        return results;
    }



    public static void main(String[] args) {

        System.out.println(whoLikesIt("Peter"));
        System.out.println(whoLikesIt("Peter", "Alex"));
    }

    /***
     *     return "Position of alphabet: " + ((int) alphabet - 96);
     */

}
