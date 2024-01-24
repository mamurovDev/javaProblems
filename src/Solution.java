


class Solution {

    public static String lastLongestWord(String text) {
        String longest = "";
        //put your code here
        String[] longest_word = text.split(" ");
        if (longest_word.length == 1){
            return longest_word[0];
        }

        for (int i = 0; i < longest_word.length - 1; i++) {
            if (longest_word[i].length() > longest_word[i + 1].length()) {
                longest = longest_word[i];
            } else {
                longest = longest_word[i + 1];
            }
        }
        return longest;
    }

}



