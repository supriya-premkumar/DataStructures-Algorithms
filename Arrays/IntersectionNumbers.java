import java.util.*;
import java.lang.*;

public class IntersectionNumbers{
  public static void main(String[] args){
    ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(4, 2, 73, 11, -5));
    ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(-5, 73, -1, 9, 9, 4, 7));
    checkIntersections(list1, list2);

  }

  public static void checkIntersections(ArrayList<Integer> list1, ArrayList<Integer> list2){
    int list1Len = list1.size();
    int list2Len = list2.size();
    HashSet<Integer> set = new HashSet<Integer>();
    if(list1Len == Math.min(list1Len,list2Len)){
      for (int i : list1){
        set.add(i);
      }
    }else{
      for (int i : list2){
        set.add(i);
      }
    }

    System.out.println(set.size());

    if(list1Len == set.size()){

    }




  }


}
