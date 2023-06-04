package Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class VerticalPair {
    BinaryTree<Integer> node = null;
    int h1 = 0;
    VerticalPair(BinaryTree<Integer> node, int h1) {
        this.node = node;
        this.h1 = h1;
    }
}

public class VerticalOrder {

    void verticalTraversal(BinaryTree<Integer> root) {
        LinkedList<VerticalPair> queue = new LinkedList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int minh1 = 0, maxh1 = 0;
        List<List<Integer>> ans = new ArrayList<>();
        queue.addLast(new VerticalPair(root, 0));
        while(!queue.isEmpty()) {
            int size = queue.size();
            while(size-- > 0) {
                VerticalPair vp = queue.removeFirst();

                maxh1 = Math.max(maxh1, vp.h1);
                minh1 = Math.min(minh1, vp.h1);

                map.putIfAbsent(vp.h1, new ArrayList<>());
                map.get(vp.h1).add(vp.node.data);

                if(vp.node.leftChild != null) {
                    queue.addLast(new VerticalPair(vp.node.leftChild, vp.h1 - 1));
                }
                if(vp.node.rightChild != null) {
                    queue.addLast(new VerticalPair(vp.node.rightChild, vp.h1 + 1));
                }
            }
        }
        for(int i = minh1; i <= maxh1; i++) {
            ans.add(map.get(i));
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        
    }
}
