class Solution {

//    /** returns a new one that removes the first and last symbols of words longer than 5 characters.
//     * @param text given string
//     * @return the new string
//     */

    public static String remove(String str) {
        String temp = "";
        for (int i = 1; i < str.length() - 1; i++) {
            temp = temp + str.charAt(i);
        }
        return temp;
    }



    static String trimSymbols(String text) {
        //put your code here
        String[] arr = text.split(" ");
        String trimmed = arr[0].length() > 5 ? remove(arr[0]) : arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > 5) {
                trimmed += " " + remove(arr[i]);
            } else {
                trimmed += " " + arr[i];
            }
        }

        return trimmed;
    }
}