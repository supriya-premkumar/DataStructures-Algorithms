import java.util.Arrays;

/**
 * Given an array a of n integers and a number d, perform d left rotations on the array. Return the updated array to
 * be printed as a single line of space-separated integers.
 */
public class LeftRotation {


    static int[] rotLeft(int[] a, int d){
        int temp =0;
        int prev = 0;

        for(int i =0; i<d; i++){
            prev = a[a.length-1];
            for(int j=0; j<a.length; j++){

                temp = a[j];
                a[j] = prev;
                prev = temp;
                System.out.println("Loop: "+ j + "  temp is  " + temp + "  a[j]  " + a[j] + "  prev  " + prev);
                System.out.println(Arrays.toString(a));
            }



        }

        return a;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotLeft(a, 4)));
    }
}
