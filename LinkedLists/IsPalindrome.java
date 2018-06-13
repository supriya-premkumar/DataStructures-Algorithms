import java.util.LinkedList;
import java.util.Arrays;


public class IsPalindrome{
  public static void main(String[] args){
    Node<Integer> list = new Node<Integer>();
    list.(new Node<>(), 2);
    // list.add(new list,1);
    // list.add(2);
    // list.add(1);
    isPalindrome(list);

  }

  public static void isPalindrome(Node<Integer> list){
    // Node n = new Node(list, list.get(0));
    // System.out.println(n);


    for (Node n : list){
      System.out.println(n.get());

    }
  }
}

class Node<T>{
  public Node<T> next;
  public T data;

 Node(Node n, T data){
    this.next = n;
    this.data = data;
  }

  public void insertNode(Node<T> head, Node<T> ){

  }


}

class LinkedList<T>{

}
