package Tree;

import java.util.LinkedList;

public class LeftView {
    static int maxLevel = 0;
    static void leftView(BinaryTree<Integer> root, int level) {
        if(root == null) {
            return;
        }
        if(maxLevel < level) {
            System.out.println(root.data);
            maxLevel = level;
        }
        leftView(root.leftChild, level+1);
        leftView(root.rightChild, level+1);
    }

    static void leftViewIter(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                BinaryTree<Integer> current = queue.removeFirst();
                if(i == 0) {
                    System.out.println(current.data);
                }
                if(current.leftChild != null) {
                    queue.addLast(current.leftChild);
                }
                if(current.rightChild != null) {
                    queue.addLast(current.rightChild);
                }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
