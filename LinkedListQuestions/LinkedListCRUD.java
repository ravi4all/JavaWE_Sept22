package LinkedListQuestions;

// import java.util.ArrayList;

// class Node {
//     int data;
//     Node next;
//     public Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

class Node<T> {
    T data;
    Node<T> next;
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListCRUD<T> {
    private Node<T> start;

    public int get_count() {
        Node<T> temp = start;
        int count = 0;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    void insertAtBeg(Node<T> node) {
        if(start == null) {
            start = node;
            return;
        }
        node.next = start;
        start = node;
    }

    void insertAtEnd(Node<T> node) {
        // If linked list is empty...
        if(start == null) {
            start = node;
            return;
        }
        // If linked list has only one node
        if(start.next == null) {
            start.next = node;
            return;
        }
        Node<T> current = start;
        while(current.next != null) {
            current = current.next;
        }
        current.next = node;

    }

    void insertAtMid(Node<T> node, int index) {
        int count = get_count();
        if(index > count) {
            throw new RuntimeException("Index cannot be greater than count");
        }
        if(count == 0) {
            start.next = node;
            return;
        }
        if(index == 0) {
            insertAtBeg(node);
        }
        if(index > 1) {
            int i = 1;
            Node<T> temp = start;
            while(i < index) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
        
    }

    void deleteAtBeg() {

    }

    void deleteAtEnd() {

    }

    void deleteAtMid(int pos) {
        int count = get_count();
        if(pos > count) {
            throw new RuntimeException("Index cannot be greater than count");
        }
        // If linked list is empty
        if(start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        Node<T> temp = null;
        if(pos == 0) {
            temp = start.next;
            start = temp;
            return;
        }
        int i = 1;
        temp = start;
        while(i < pos) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    void midPoint() {
        Node<T> fast;
        Node<T> slow;
        fast = slow = start;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Mid Point : " + slow.data);
    }

    void kthFromEnd(int k) {
        int n = get_count();
        int pos = n-k+1;
        Node<T> temp = start;
        for(int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        System.out.println("Kth Node : " + temp.data);
    }

    void kthFromEndApproach_2(int k) {
        Node<T> p;
        Node<T> q;
        p = q = start;
        for(int i = 1; i < k; i++) {
            q = q.next;
        }
        while(q != null) {
            p = p.next;
            q = q.next;
        }
        System.out.println("Kth Node : " + p.data);
    }

    void reverseIterate() {
        if(start == null) {
            System.out.println("Linked List is Empty...");
            return;
        }
        if(start.next == null) {
            System.out.println("Only one node is available...");
            return;
        }
        Node<T> currentNode = start;
        Node<T> prevNode = null;
        while(currentNode != null) {
            Node<T> nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        start = prevNode;
    }

    Node<T> reverseIterateRec(Node<T> currentNode, Node<T> prevNode) {
        if(currentNode == null) {
            return prevNode;
        }
        Node<T> nextNode = currentNode.next;
        currentNode.next = prevNode;
        return reverseIterateRec(nextNode, currentNode);
    }

    void detectCycle() {
        Node<T> slow;
        Node<T> fast;
        slow = fast = start;
        while(fast.next != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                break;
            }
        }
        if(slow != fast) {
            System.out.println("No cycle detetced...");
        }
        else {
            System.out.println("Cycle detected...");
        }
        // Remove cycle from LinkedList
    }

    void printList() {
        Node<T> current = start;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        // Node root = new Node(10);
        // root.next = new Node(12);
        // root.next.next = new Node(14);
        // root.next.next.next = new Node(16);
        // Node current = root;
        
        // while(current != null) {
        //     System.out.println(current.data);
        //     current = current.next;
        // }

        // Node<Integer> root = new Node<>(10);
        // root.next = new Node<>(20);
        // root.next.next = new Node<>(30);
        // root.next.next.next = new Node<>(40);

        LinkedListCRUD<Integer> operations = new LinkedListCRUD<>();
        operations.insertAtBeg(new Node<Integer>(10));
        operations.insertAtEnd(new Node<Integer>(20));
        operations.insertAtEnd(new Node<Integer>(30));
        operations.insertAtBeg(new Node<Integer>(40));
        operations.insertAtMid(new Node<Integer>(15), 3);
        operations.printList();

    }
}
