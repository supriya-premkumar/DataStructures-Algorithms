public class BSTDemo{

    public static void main(String[] args){
        BST tree = new BST();

        int[] numbers = {11, 2, 5, 21, 3, 1};

        for(int i : numbers){
            tree.insertElement(i);
            System.out.println("\n Adding Element: " + i);
            System.out.println("\n Printing Inorder: ");
            tree.inorderTraversal(tree.root);
        }
    }
}