public  class LinkedList{

    Node first;

    LinkedList(){
        first = null;
    }

    LinkedList(Node f){
        first = f;
    }

    public void print(){
        Node p = first;
        while(p != null){
            System.out.print(p.data + "-->");
            p = p.next;
        }
        System.out.println("null");
    }

    public void insertAtBeginning(Object a){
        Node n = new Node(a);
        n.next = first;
        first = n;

    }

    public Object deleteNode(Object){

    }


}