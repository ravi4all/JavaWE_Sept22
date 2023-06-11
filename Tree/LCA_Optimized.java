package Tree;

public class LCA_Optimized {

    static BinaryTree<Integer> lca(BinaryTree<Integer> root, int n1, int n2) {
        if(root == null) {
            return null;
        }
        if(root.data == n1 || root.data == n2) {
            return root;
        }
        BinaryTree<Integer> path_1 = lca(root.leftChild, n1, n2);
        BinaryTree<Integer> path_2 = lca(root.rightChild, n1, n2);
        if(path_1 != null && path_2 != null) {
            return root;
        }
        if(path_1 != null) {
            return path_1;
        }
        else {
            return path_2;
        }

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
        BinaryTree<Integer> result = lca(root, 70, 100);
        System.out.println(result.data);
    }
}
