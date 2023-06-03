package Tree;

public class HeightOfTree {
    static int height(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.leftChild);
        int rightHeight = height(root.rightChild);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        BinaryTree<Integer> root = new BinaryTree<>(10);
        root.leftChild = new BinaryTree<>(20);
        root.rightChild = new BinaryTree<>(50);
        root.leftChild.leftChild = new BinaryTree<>(30);
        root.leftChild.rightChild = new BinaryTree<>(40);
        root.rightChild.leftChild = new BinaryTree<>(70);
        root.rightChild.rightChild = new BinaryTree<>(90);
        root.rightChild.rightChild.rightChild = new BinaryTree<>(100);
        int max = height(root);
        System.out.println(max);
    }
}
