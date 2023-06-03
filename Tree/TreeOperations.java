package Tree;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class BinaryTree<T> {
    T data;
    BinaryTree<T> leftChild;
    BinaryTree<T> rightChild;
    BinaryTree(T data) {
        this.data = data;
        leftChild = rightChild = null;
    }
}

public class TreeOperations {
    String message = "root";
    Scanner scanner = new Scanner(System.in);
    BinaryTree<Integer> insert() {
        System.out.println("Enter " + message + " data or -1 to exit");
        int data = scanner.nextInt();
        if(data == -1) {
            return null;
        }
        BinaryTree<Integer> node = new BinaryTree<>(data);
        message = "left";
        node.leftChild = insert();
        message = "right";
        node.rightChild = insert();
        message = "root";
        return node;
    }

    void preOrder(BinaryTree<Integer> root) {
        // Root, Left, Right
        if(root == null) {
            return;
        }
        System.out.println(root.data);
        preOrder(root.leftChild);
        preOrder(root.rightChild);
    }

    void inOrder(BinaryTree<Integer> root) {
        // Left, Root, Right
        if(root == null) {
            return;
        }
        
        preOrder(root.leftChild);
        System.out.println(root.data);
        preOrder(root.rightChild);
    }

    void postOrder(BinaryTree<Integer> root) {
        // Left, Right, Root
        if(root == null) {
            return;
        }
        
        preOrder(root.leftChild);
        preOrder(root.rightChild);
        System.out.println(root.data);
    }

    void preOrderIterative(BinaryTree<Integer> root) {
        // Root, Left, Right
        /*
         * 1. Create Empty Stack
         * 2. Push root node in stack
         * 3. while stack is not empty
         * 4. pop node from stack & print in
         * 5. if right child is not null then push in stack
         * 6. push left child if stack is not null
         */
        if(root == null) {
            return;
        }
        Stack<BinaryTree<Integer>> st = new Stack<>();
        BinaryTree<Integer> currentNode = root;
        while(!st.isEmpty() || currentNode != null) {
            if(!st.isEmpty() && currentNode == null) {
                currentNode = st.pop();
            }
            System.out.println(currentNode.data);
            if(currentNode.rightChild != null) {
                st.push(currentNode.rightChild);
            }
            currentNode = currentNode.leftChild;
        }
    }

    void levelOrder(BinaryTree<Integer> root) {
        LinkedList<BinaryTree<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            BinaryTree<Integer> node = queue.removeFirst();
            System.out.println(node.data);
            if(node.leftChild != null) {
                queue.addLast(node.leftChild);
            }
            if(node.rightChild != null) {
                queue.addLast(node.rightChild);
            }
        }
    }

    void print(BinaryTree<Integer> root) {
        if(root == null) {
            return;
        }
        String output = "";
        System.out.println("Root : " + root.data);
        if(root.leftChild != null) {
            output += "L : " + root.leftChild.data;
        }
        if(root.rightChild != null) {
            output += " R : " + root.rightChild.data;
        }
        System.out.println(output);
        print(root.leftChild);
        print(root.rightChild);
    }

    public static void main(String[] args) {
        TreeOperations obj = new TreeOperations();
        BinaryTree<Integer> root = obj.insert();
        obj.print(root);
        System.out.println("==============");
        obj.preOrder(root);
        System.out.println("==============");
        obj.postOrder(root);
        System.out.println("==============");
        obj.inOrder(root);
        System.out.println("==============");
        obj.levelOrder(root);
    }
}
