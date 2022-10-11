public class LabeledForLoop {
    public static void main(String[] args) {
        outerLoop:
        for(int i = 0; i < 5; i++) {
            innerLoop:
            for(int j = 0; j < 5; j++) {
                if(i == 3) {
                    break outerLoop;
                }
                if(j == 5) {
                    break innerLoop;
                }
            }
        }
    }
}
