/**Deleting duplicates from a sorted array
This problem is concerned with deleting repeated elements from a sorted array.

Write a program which takes as input a sorted int[] and updates it such that:

all duplicates have been removed and
all remaining valid elements have been shifted left to fill the emptied indices
all remaining empty indices have values set to 0
the function returns the number of remaining valid elements
 (the array size minus the number of removed elements)
For example, given an input array with the values {2,3,5,5,7,11,11,11,11,13},
after the function completes, the values in the array should be
 {2,3,5,7,11,13,0,0,0}, and the function should return 6.

Hint: There is an O(n) time and O(1) space solution.
*/

public class DeleteDuplicates{

public static void main(String[] args){
  int[] numArray = {2,3,5,5,7,11,11,11,11,13};
  removeDuplicates(numArray);
}

public static void removeDuplicates(int[] numArray){
  int i=0;
  for(int j=1; j<numArray.length; j++){
    if(j!=i){
      numArray[j]=numArray[i];
      i++;
    }
  }

System.out.println(i); //6
}
}
