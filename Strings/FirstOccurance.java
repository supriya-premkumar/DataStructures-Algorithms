/**
 * Write a function that takes two strings as input and returns the index of the first occurance of the first string
 * in the second
 * <p>
 * f("bc", "abcd") -->
 */

public class FirstOccurance {
    public static void main(String[] args) {
        int result = indexFirstOccurunce("bc", "abcd");
        System.out.println(result);
    }

    /**
     * Using Helper Method: String.indexOf(SubString)
     *
     * @param s, SubSTring, String
     * @param t, String
     * @return index of the first occurance of the first String in the second, int
     */

//    public static int indexFirstOccurunce(String s, String t){
//        int index = t.indexOf(s);
//        return index;
//    }
    public static int indexFirstOccurunce(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int j = 0;
        int index = -1;

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
                if (j == s.length()) {
                    index = i - (sLen - 1);
                    return index;
                }
            }

        }

        return index;


    }
}