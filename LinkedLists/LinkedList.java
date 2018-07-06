public class LinkedList<T>{
  private ListNode<T> head = null;

  public static void insert(ListNode<T> node){


  }

  public static void main(String[] args){
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    linkedList.insert(new ListNode<Integer>(2));
    linkedList.insert(new ListNode<Integer>(5));
    linkedList.insert(new ListNode<Integer>(7));
  }

}

class ListNode<T>{
  public T data;
  public ListNode<T> next;

  public ListNode(){
    this.data = null;
    this.next = null;
  }

  public ListNode(T data){
    this.data = data;
    this.next = null;
  }

  //getNext()
  public ListNode<T> getNext(){
    return next;
  }
  //setNext()
  public void setNext(ListNode<T> node){
    this.next = node;

  }
  //print linkedList
  //

}
