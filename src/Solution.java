class Solution {

    //    /** returns the number of digits in a string
//     * @param str the given string
//     * @return the number of digits in a string
//     */


    public static boolean ifNumber(String a) {
        for (int i = 0; i <= 9; i++) {
            if (a.equals(i + "")) {
                return true;
            }
        }

        return false;
    }

    public static int countDigitsInString(String str) {
        //put your code here
        int totalNumber = 0;
        String[] arr = str.split("");
        for (String s : arr) {
            if (ifNumber(s)) {
                totalNumber++;
            };
        }
        return totalNumber;
    }
}