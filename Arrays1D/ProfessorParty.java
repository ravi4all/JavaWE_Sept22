package Arrays1D;

public class ProfessorParty {
    static boolean approach_1(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5, 1};
        //approach_1(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[Math.abs(arr[i])] >= 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
            else {
                System.out.println(Math.abs(arr[i]));
            }
        }
    }
}
