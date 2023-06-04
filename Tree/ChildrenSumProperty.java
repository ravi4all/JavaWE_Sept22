package Tree;

public class ChildrenSumProperty {

    boolean isSum(BinaryTree<Integer> root) {
        if(root == null) {
            return true;
        }

        if(root.leftChild == null && root.rightChild == null) {
            return true;
        }
        int sum = 0;
        if(root.leftChild != null) {
            sum += root.leftChild.data;
        }
        if(root.rightChild != null) {
            sum += root.rightChild.data;
        }

        return (root.data == sum && isSum(root.leftChild) && isSum(root.rightChild));

    }

    public static void main(String[] args) {
        
    }
}
