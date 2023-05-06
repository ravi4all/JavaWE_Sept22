package Stack;

public class TwoStack {
    int arr[];
    int capacity;
    int leftTop;
    int rightTop;

    TwoStack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        leftTop = -1;
        rightTop = capacity;
    }

    void leftPush(int data) {
        if(leftTop < rightTop - 1) {
            leftTop++;
            arr[leftTop] = data;
        }
    }

    void rightPush(int data) {
        if(leftTop < rightTop - 1) {
            rightTop--;
            arr[rightTop] = data;
        }
    }

    void print() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TwoStack st = new TwoStack(6);
        st.leftPush(1);
        st.leftPush(2);
        st.leftPush(3);
        st.leftPush(4);
        st.rightPush(9);
        st.rightPush(10);
        st.rightPush(11);

        st.print();


    }
}
