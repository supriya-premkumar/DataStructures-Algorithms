public class LinkedList<T>{
  private ListNode<T> head = null;
  public static void main(String[] args){
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.insert(new ListNode<Integer>(2));
    list.insert(new ListNode<Integer>(1));
    list.insert(new ListNode<Integer>(1));
    list.insert(new ListNode<Integer>(2));
    list.insert(new ListNode<Integer>(4));
    list.printNode();

  }

  public void insert(ListNode<T> node){
    if(node != null){
      node.setNext(head);
      head = node;
    }
  }


  void print(ListNode<T> node){
    System.out.println("Node is: " + node.getValue());
    if(node.getNext()!=null){
      print(node.getNext());
    }
  }

void printNode(){
    print(head);
  }


}


class ListNode<T> {
  private T value;
  private ListNode<T> next;

  ListNode(){
    this.value = null;
    this.next = null;
  }

  ListNode(T data){
    value = data;
    this.next = null;
  }

  void setNext(ListNode<T> next){
    this.next = next;
  }

  ListNode<T> getNext(){
    return next;
  }

  T getValue(){
    return value;
  }

}
