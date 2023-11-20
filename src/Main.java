
public class Main {

    public static int getResult(int[] a) {
       int k1 = findMax(a);
       int k2 = findMin(a);
       return  k1 + k2;

    }

    public static int findMax(int[] a){
        int res = a[0];

        for (int i = 2; i < a.length; i += 2){
            if (a[i] > res){
                res = a[i];
            }
        }

        return res;
    }

    public static int findMin(int[] a){
       int initial = a[a.length - 1];
       for (int i = a.length -1 ; i >= 0; i -= 2){
           if (a[i] < initial){
               initial = a[i];
           }
       }
       return initial;
    }

}
