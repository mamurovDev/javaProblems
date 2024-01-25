public class Solution {

    public static String reverseWordOrder(String input) {
        String[] arr = input.split(" ");
        int count = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[count - i];
            arr[count - i] = temp;
        }

        StringBuilder str = new StringBuilder();
        for (String s : arr) {
            str.append(s).append(" ");
        }

        return str.toString().trim();
    }


}
