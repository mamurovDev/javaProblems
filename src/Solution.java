class Solution {

//    /** checks whether two strings are anagrams of each other
//     * @param str1 the first string
//     * @param str2 the second string
//     * @return true if the strings are anagrams, and false otherwise
//     */
    public static boolean isAnagrams(String str1, String str2) {
        //put your code here
        String[] string1 = str1.split("");
        String[] string2 = str2.split("");
        if (string1.length != string2.length) return false;

        for (String s: string1){
            if (!str2.contains(s)){
                return false;
            }
        }
        return true;
    }
}