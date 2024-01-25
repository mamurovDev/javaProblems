class Solution {
//    /** removes duplicate symbols in a string
//     * @param str the given string
//     * @return a string with duplicate characters removed
//     */




    public static String removeDuplicateSymbols(String str) {
        //put your code here
        StringBuilder finalValue = new StringBuilder();
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++){
            if (!finalValue.toString().contains(arr[i])){
                finalValue.append(arr[i]);
            }
        }
        return finalValue.toString();
    }
}