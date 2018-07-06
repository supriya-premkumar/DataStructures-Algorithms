/**
 * Given a 6 x6 2D Array, arr:
 *
 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 0 0 0 0
 0 0 0 0 0 0
 0 0 0 0 0 0

 * We define a hour glass in A to be a subset of values with indices falling in the pattern in arr's graphical
 * representation
 *
 *     a b c
 *       d
 *     e f g
 *
 * There are 16 hourglasses in arr, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass
 * sum for every hourglass in arr, then print the maximum hourglass sum.
 *
 * Function Description: Complete the function hourglassSum in the editor below. It should return an Integer, the
 * maximum hourglass sum in the array.
 *
 * hourglassSumhas the following parameter(s):
 *  · arr: an array of integers.
 *
 *  Input Format:
 *  Each of the 6 lines of inputs arr[i] contains 6 space separated integers arr[i][j].
 *
 *
 * Constraints
 * · -9<= arr[i][j]<=9
 * · 0<= i,j <=5
 *
 * Output Format
 * Print the largest(maximum) hourglass sum found in arr.
 *
 *
 *
 *
 *
 * Sample Input

 1 1 1 0 0 0
 0 1 0 0 0 0
 1 1 1 0 0 0
 0 0 2 4 4 0
 0 0 0 2 0 0
 0 0 1 2 4 0

 Sample Output
 19

 Explanation

 arr contains the following hourglasses:

 1 1 1   1 1 0   1 0 0   0 0 0
 1       0       0       0
 1 1 1   1 1 0   1 0 0   0 0 0

 0 1 0   1 0 0   0 0 0   0 0 0
 1       1       0       0
 0 0 2   0 2 4   2 4 4   4 4 0

 1 1 1   1 1 0   1 0 0   0 0 0
 0       2       4       4
 0 0 0   0 0 2   0 2 0   2 0 0

 0 0 2   0 2 4   2 4 4   4 4 0
 0       0       2       0
 0 0 1   0 1 2   1 2 4   2 4 0

 The hourglass with the maximum sum (19) is:

            2 4 4
              2
            1 2 4

 Total count of hourglass = (R-2)*(C-2)
 */

import java.util.Arrays;
public class HourGlass {
    private static int R = 6;
    private static int C = 6;

    public static void main(String[] args){
        int[][] arr = {{1,1,1,0,0,0},
                       {0,1,0,0,0,0},
                       {1,1,1,0,0,0},
                       {0,0,2,4,4,0},
                       {0,0,0,2,0,0},
                       {0,0,1,2,4,0}};
        int res = hourglassSum(arr);
        System.out.println(res);

    }

    public static int hourglassSum(int[][] arr){
        int maxSum = Integer.MIN_VALUE;

        //In order to form an hour glass at least 3 Rows and 3 Columns needed.
        if(R < 3 || C < 3){
            return -1;
        }

        //Loop runs for (R-2)*(C-2) times
        for(int i=0; i<R-2; i++){
            for(int j=0; j<C-2; j++){
                int sum = (arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] +
                        arr[i+2][j+2]);

                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

}
