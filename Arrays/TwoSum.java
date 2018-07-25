import java.lang.reflect.Array;
import java.util.*;

public class TwoSum {
    public static void main(String[] args){
        int[] input = {3,3};
        int target = 6;
        int[] result = twoSum(input, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] input, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<input.length; i++){
            int complement = target - input[i];
            if(map.containsKey(complement) && map.get(complement)!=i){
                return new int[] {i, map.get(complement)};

            }
            map.put(input[i], i);

        }


        throw new IllegalArgumentException("No Two Sum SOlution");
    }
}
