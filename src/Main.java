
public class Main {


    public static int[] getResult(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++){
            if (a[i] > i){
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }
        return b;
    }

}
