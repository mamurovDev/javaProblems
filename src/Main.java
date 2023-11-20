
public class Main {


    public static int getResult(int[] a, int m) {
        int count = 0;
        for (int i = 0 ; i < a.length; i++){
            if (a[i] > m){
                a[i] = m;
                count++;
            }
        }
        return count;
    }

}
