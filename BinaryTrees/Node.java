public class Node {

    public int data;       //value or data that's stored in a node, it can be int, String or Object
    public Node left;     //left child node
    public Node right;    //right child node
    public Node parent;   //reference to the parent node

    //Constructor without parameter
    Node() {

    }

    // Constructor with parameter
    Node(int value) {
        data = value;
    }

    // To set Left Child Node
    void setLeftNode(Node n) {
        this.left = n;
        if (n != null) {
            n.parent = this;
        }
    }

    // To Set Right Child Node
    void setRightNode(Node n) {
        this.right = n;
        if (n != null) {
            n.parent = this;
        }

    }

}