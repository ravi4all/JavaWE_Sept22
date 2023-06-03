package Tree;

public class CountNodes {
    static int count(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int counter = 1;
        counter += count(root.leftChild);
        counter += count(root.rightChild);
        return counter;
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
        int res = count(root);
        System.out.println(res);
    }
}
