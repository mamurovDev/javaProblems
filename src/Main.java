
public class Main {

    public static int getResult(int[] a, int c, int d) {
        int items = 0;
        for (int num: a){
            if (c <= num && num <= d){
                items++;
            }
        }
        return items;
    }





}
