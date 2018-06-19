/**
 * Job Scheduling historical analysis, what minimal amount of executors total is sufficicient to accommodate all the
 * jobs to execute immediately.
 *
 * Input is a collection(array, list, whatever language of your choice supports) of pairs {job_start, job_end}
 *
 * Example: [[2,3], [3,4], [2,3], [5,10], [9,11]]
 * answer: 2
 *
 */

public class JobScheduling {
    public static void main(String[] args){
        int[][] input = {{2,3}, {3,4}, {2,3}, {5,10}, {9,11}};
        printMatrix(input);
    }

    public static void printMatrix(int[][] input){
        for(int i =0 ; i<input.length; i++){
            for(int j = 0; j<input.length; j++){
                System.out.println(input[i][j]);
            }
        }

    }
}