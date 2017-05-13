public class LinkedListTest{

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.insertAtBeginning("apple");
        ll.insertAtBeginning("Cherry");
        ll.print();

        //  Cherry ->  apple -> null
    }
}