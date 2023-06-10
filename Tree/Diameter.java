package Tree;

public class Diameter {

    static int height(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = height(root.leftChild);
        int rightHeight = height(root.rightChild);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    static int diameter(BinaryTree<Integer> root) {
        if(root == null) {
            return 0;
        }
        // height of left sub tree and right sub tree and add 1
        int d1 = height(root.leftChild) + height(root.rightChild) + 1;
        int d2 = diameter(root.leftChild);
        int d3 = diameter(root.rightChild);
        return Math.max(d1, Math.max(d2, d3));
    }

    public static void main(String[] args) {
        
    }
}
