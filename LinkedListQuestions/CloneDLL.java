package LinkedListQuestions;

import java.util.HashMap;

class NodeDLL {
    int data;
    NodeDLL next, random;
    NodeDLL(int data) {
        this.data = data;
        next = random = null;
    }
}

public class CloneDLL {
    static void clone(NodeDLL head) {
        HashMap<NodeDLL, NodeDLL> map = new HashMap<>();
        for(NodeDLL current = head; current != null; current = current.next) {
            map.put(current, new NodeDLL(current.data));
        }

        for(NodeDLL current = head; current != null; current = current.next) {
            NodeDLL cloneCurrent = map.get(current);
            cloneCurrent.next = map.get(current.next);
            cloneCurrent.random = map.get(current.random);
        }

        NodeDLL head_2 = map.get(head);
    }

    static NodeDLL cloneOptimized(Node head) {
        NodeDLL temp = head;
        while(temp != null) {
            // Cloning of node
            NodeDLL newNode = new NodeDLL(temp.data);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }
        temp = head;
        // copy random pointers
        while(temp != null) {
            temp.next.random = (temp.random != null) ? temp.random.next : null;
            temp = temp.next.next;
        }

        NodeDLL old_pointer = head;
        NodeDLL new_pointer = head.next;
        NodeDLL old_head = head.next;

        while(old_pointer != null) {
            old_pointer.next = old_pointer.next.next;
            new_pointer.next = (new_pointer.next != null) ? new_pointer.next.next : null;
            old_pointer = old_pointer.next;
            new_pointer = new_pointer.next;
        }

        return old_head;

    }

}
