import java.util.*;
import java.lang.*;

/**
 * Implement a function that takes two lists and returns interecting elements.
 * <p>
 * Eg: L1 = {2,4,5,6,7}; L2 = {9, -9, 5, 8, 7}
 * output = {5,7}
 */

public class IntersectionNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(4, 2, 73, 11, -5, 7));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-5, 73, -1, 9, 9, 4, 7));
        ArrayList<Integer> result = checkIntersections(list1, list2);
        System.out.println(result);

    }

    /**
     * checkIntersections: Method that calculates the interecting elements between two input lists.
     * @param list1, ArrayList<Integer>
     * @param list2, ArrayList<Integer>
     * @return result, ArrayList<Integer>
     * Complexity: O(n)
     */
    public static ArrayList<Integer> checkIntersections(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int list1Len = list1.size();
        int list2Len = list2.size();
        ArrayList<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        /*
        Adding the shortest length of list in the hashset
         */
        if (list1Len == Math.min(list1Len, list2Len)) {
            for (int i : list1) {
                set.add(i);
            }
        } else {
            for (int i : list2) {
                set.add(i);
            }
        }
        /*
         * Checking which list has the shortest length in the HashSet
         * and comparing the second list elements with the HashSet elements
         */
        if (list1Len == set.size()) {
            for (Integer num : list2) {
                if (set.contains(num)) {
                    result.add(num);
                }
            }
        } else {
            for (Integer num : list1) {
                if (set.contains(num)) {
                    result.add(num);
                }
            }
        }
        return result;
    }

}
