public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key + " ");
            inorderRec(root.right);
        }
    }

    public void inorder() {
        inorderRec(root);
    }

    public Node search(Node root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (root.key>key) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }
}
