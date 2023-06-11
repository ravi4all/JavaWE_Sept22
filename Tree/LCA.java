package Tree;

import java.util.ArrayList;

public class LCA {

    static boolean findPath(BinaryTree<Integer> root, ArrayList<BinaryTree<Integer>> path, int n) {
        // if node doesn't exists in tree then return false
        if(root == null) {
            return false;
        }
        // otherwise store nodes in array
        path.add(root);
        // if reached on destination then return true
        if(root.data == n) {
            return true;
        }
        // traverse left and right child recursively
        if(findPath(root.leftChild, path, n) || findPath(root.rightChild, path, n)) {
            return true;
        }
        // remove those elements which are not part of the path
        path.remove(path.size() - 1);
        return false;
    }

    static BinaryTree<Integer> lca(BinaryTree<Integer> root, int n1, int n2) {
        ArrayList<BinaryTree<Integer>> path_1 = new ArrayList<>();
        ArrayList<BinaryTree<Integer>> path_2 = new ArrayList<>();
        // if any of the node doesn't exists in tree then there is no
        // common ancestor
        if(findPath(root, path_1, n1) == false || findPath(root, path_2, n2) == false) {
            return null;
        }
        // Now finally iterate over two path variables and find LCA
        for(int i = 0; i < path_1.size() - 1 && i < path_2.size() - 1; i++) {
            System.out.print(path_1.get(i).data + ",");
            System.out.print(path_2.get(i).data + ",");
            if(path_1.get(i + 1) != path_2.get(i + 1)) {
                return path_1.get(i);
            }
        }
        return null;
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
