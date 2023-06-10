package Tree;

import java.util.ArrayList;

public class LCA {

    boolean findPath(BinaryTree<Integer> root, ArrayList<BinaryTree<Integer>> path, int n) {
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

    BinaryTree<Integer> lca(BinaryTree<Integer> root, int n1, int n2) {
        ArrayList<BinaryTree<Integer>> path_1 = new ArrayList<>();
        ArrayList<BinaryTree<Integer>> path_2 = new ArrayList<>();
        // if any of the node doesn't exists in tree then there is no
        // common ancestor
        if(findPath(root, path_1, n1) == false || findPath(root, path_2, n2) == false) {
            return null;
        }
        // Now finally iterate over two path variables and find LCA
    }

    public static void main(String[] args) {
        
    }
}
