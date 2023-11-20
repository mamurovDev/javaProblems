import java.util.Arrays;
class Main {

    /**
     * @param a the given array, containing an even number of elements
     * @return max(a[0] + a[n - 1], ..., a[n/2 - 1] + a[n/2])
     */
    public static int getResult(int[] a) {
        // Sort the array
        Arrays.sort(a);

        // Calculate the sum of pairs and find the maximum
        int maxSum = 0;
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int sum = a[i] + a[n - 1 - i];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
