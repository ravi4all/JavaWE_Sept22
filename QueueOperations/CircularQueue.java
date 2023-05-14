package QueueOperations;

public class CircularQueue {
    int arr[];
    int front;
    int rear;
    CircularQueue(int capacity) {
        arr = new int[capacity];
        rear = front = 0;
    }
    int getSize() {
        return rear;
    }
    boolean isEmpty() {
        return rear == 0;
    }

    void enqueue(int data) {
        if(rear == arr.length) {
            System.err.println("Queue is full...");
        }
        int availableIndex = (front + rear) % arr.length;
        arr[availableIndex] = data;
        rear++;
    }
    int dequeue() {
        int value = arr[front];
        arr[front] = 0;
        front = (front + 1) % arr.length;
        rear--;
        return value;
    }

}
