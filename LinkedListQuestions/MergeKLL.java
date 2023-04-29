package LinkedListQuestions;

class NodeB {
    NodeB right;
    NodeB down;
    int data;
    public NodeB(int data) {
        this.data = data;
    }
}

public class MergeKLL {
    NodeB start, tail;

    void add(int data) {
        if(start == null) {
            NodeB node = new NodeB(data);
            tail = start = node;
        }
        else {
            NodeB node = new NodeB(data);
            tail.down = node;
            tail = node;
        }
    }

    void addTop() {
        if(start == null) {
            tail = start = node;
        }
        else {
            tail.right = node;
            tail = node;
        }
    }

    void merge() {
        
    }

    void flatten() {
        
    }

    public static void main(String[] args) {
        MergeKLL obj = new MergeKLL();
        obj.add(5);
        obj.add(8);
        obj.add(9);
        obj.add(15);

        MergeKLL obj_2 = new MergeKLL();
        obj_2.add(10);
        obj_2.add(20);
        obj_2.add(30);
        obj_2.add(40);

        MergeKLL obj_3 = new MergeKLL();
        obj_3.add(3);
        obj_3.add(5);
        obj_3.add(7);
        obj_3.add(11);

        MergeKLL obj_4 = new MergeKLL();
        obj_4.addTop(obj.start);
        obj_4.addTop(obj_2.start);
        obj_4.addTop(obj_3.start);

    }
}
