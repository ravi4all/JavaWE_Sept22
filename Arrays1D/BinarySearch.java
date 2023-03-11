package Arrays1D;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        // int search = 70;
        int search = 77;
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int nearestLowest = 0;
        int nearestGreater = 0;
        while(low < high) {
            mid = (low + high) / 2;
            if(search == arr[mid]) {
                System.out.println("Element Found");
                return;
            }
            if(search > arr[mid]) {
                low = mid + 1;
                nearestLowest = arr[mid];
            }
            else if(search < arr[mid]) {
                high = mid - 1;
                nearestGreater = arr[mid];
            }
        }
    }
}
