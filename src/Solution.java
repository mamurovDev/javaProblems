class Solution {
//    /**
//     * generates a sequence of numbers
//     *
//     * @param start initial value of the number
//     * @param count number of numbers in sequence
//     * @return generated sequence of numbers
//     */


    public static String generateNumberSequence(int start, int count) {
        //put your code here
        if (count == 0) return "()";
        StringBuilder str = new StringBuilder();
        str.append(start);
        for (int i = 1; i < count; i++) {
            str.append(" ").append(i + start);

        }
        return "(" + str.toString() + ")";
    }
}