public class LabeledForLoop {
    public static void main(String[] args) {
        outer:
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 6; j++) {
                if(i == 3) {
                    break outer;
                }
            }
        }
    }
}
