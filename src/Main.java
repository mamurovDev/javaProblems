
public class Main {


    public static int[] getResult(int[] a) {
        int negative = 0;
        int zero = 0;
        int positive = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                positive++;
            } else if (a[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        return new int[] {negative, zero, positive};
    }

}
