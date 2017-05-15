public class BST {
    Node root;

    // Insertion of node
    public void insertElement(int value) {
        Node n = new Node(value);

        if (root == null) {
            root = n;
        } else {
            Node curr;
            Node prev;
            curr = root;
            prev = root;

            while (curr != null) {
                prev = curr;
                if (value < curr.data) {
                    curr = curr.left;
                } else {
                    curr = curr.right;
                }

                if (value < prev.data) {
                    prev.setLeftNode(n);
                } else {
                    prev.setRightNode(n);
                }
            }


        }

    }

    // InorderTraversal in recursive method
    void inorderTraversal (Node n) {
        if(n == null){
            return;
        }else{
            inorderTraversal(n.left);
            System.out.println("" + n.data);
            inorderTraversal(n.right);
        }
    }


}