
class Solution {

    /**
     * calculates the average value of two Integers
     * 
     * @param number1 the first value of the Integer type
     * @param number2 the second value of the Integer type
     * @return the average value of the type Double, or null otherwise
     */
    public static Double calculateAverage(Integer number1, Integer number2) {
        // put your code here
        if (number1 instanceof Integer && number2 instanceof Integer) {
            Double arg = Double.valueOf(((double) number1 + number2) / 2);
            return arg;
        } else {
            return null;
        }
        // exclusively a stub for the first test
    }
}