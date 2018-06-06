public class LinkedList<T>{
    private LinkedListNode<T> head = null;
    /**
     * Insert a Node at the head
     */
    public void insert(LinkedListNode<T> node){
       node.setNode(head);
       head = node;
    }

    /**
     * Remove node at the head
     */

    public void delete(){

        if(head.getNext() !=null){
            head = head.getNext();
        }else{
            head = null;
        }

    }

    /**
     * Recursively Traverse the list
     */
    private void printList(LinkedListNode<T> node){
        System.out.println("Node is : " + node.getValue());
        System.out.print
        if(node.getNext()!=null){
            printList(node.getNext());
        }
    }

    public void print(){
        printList(head);
    }

    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.insert(new LinkedListNode<Integer>(3));
        list.insert(new LinkedListNode<Integer>(4));
        list.insert(new LinkedListNode<Integer>(5));
        list.print();

    }



}

class LinkedListNode<T>{
    private T data;
    private LinkedListNode<T> next;

    public LinkedListNode(T data){
        this.data = data;
    }

    public LinkedListNode(LinkedListNode<T> node){
        this.next = node;

    }

    public void setNode(LinkedListNode<T> node){
        this.next = node;
    }

    public LinkedListNode<T> getNext(){
        return this.next;
    }

    public T getValue(){
        return this.data;
    }


}