package QueueOperations;

public class Queue {
    int data[];
    int front;
    int rear;
    int size;
    Queue(int len) {
        data = new int[len];
        front = rear = -1;
        size = 0;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getFront() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty...");
        }
        return data[front];
    }

    int getRear() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is empty...");
        }
        return data[rear];
    }

    void enqueue(int element) {
        if(isEmpty()) {
            front = 0;
        }
        rear++;
        size++;
        if(rear == data.length) {
            rear = 0;
        }
        data[rear] = element;
    }

    int dequeue() {
        if(isEmpty()) {
            throw new RuntimeException("Queue is Empty...");
        }
        int temp = data[front];
        front++;
        size--;
        if(size == 0) {
            front = rear = -1;
        }
        return temp;
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(12);
        q.enqueue(20);
        q.enqueue(5);
    }

}
