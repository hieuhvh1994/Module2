public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(27);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);

        System.out.println("Inorder traversal of the given tree");
        tree.inorder();


    }
}
