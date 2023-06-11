package Tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.data = data;
    }
}

public class BST {
    TreeNode root;  // initially root is null
    TreeNode insert(TreeNode root, int data) {
        if(root == null) {
            return new TreeNode(data);
        }
        else if(data < root.data) {
            root.left = insert(root.left, data);
        }
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    TreeNode search(TreeNode root, int data) {
        if(root == null || root.data == data) {
            return root;
        }
        else if(root.data < data) {
            return search(root.right, data);
        }
        return search(root.left, data);
    }

    public static void main(String[] args) {
        
    }
}
