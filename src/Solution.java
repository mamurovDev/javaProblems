// class Solution {

//     /**
//      * calculates the average value of two Integers
//      *
//      * @param number1 the first value of the Integer type
//      * @param number2 the second value of the Integer type
//      * @return the average value of the type Double, or null otherwise
//      */
//     public static Double calculateAverage(Integer number1, Integer number2) {
//         // put your code here
//         if (number1 instanceof Integer && number2 instanceof Integer) {
//             Double arg = Double.valueOf(((double) number1 + number2) / 2);
//             return arg;
//         } else {
//             return null;
//         }
//         // exclusively a stub for the first test
//     }
// }

// class Solution {

//     /**
//      * converts a string to an array of numbers
//      *
//      * @param line a string of integers and real numbers separated by a space
//      * @return an array of numbers, or null otherwise
//      */
//     public static Number[] convertString2Numbers(String line) {
//         // put your code here
//         String[] strList = line.split(" ");
//         Number[] nums = new Number[strList.length];
//         for (int i = 0; i < nums.length; i++) {
//             try {
//                 nums[i] = Integer.parseInt(strList[i]);

//             } catch (Exception e) {
//                 try {
//                     nums[i] = Double.parseDouble(strList[i]);
//                 } catch (Exception ex) {
//                     // TODO: handle exception
//                     nums[i] = null;
//                 }
//             }
//         }
//         return nums; // exclusively a stub for the first test
//     }
// }

// class Solution {

//     /**
//      * calculates the average of the real numbers in an array of integers and real
//      * numbers
//      *
//      * @param numbers an array of integers and real numbers
//      * @return the average of the real numbers, or null otherwise
//      */
//     public static Double calculateAverageDoubles(Number numbers[]) {
//         double sum = 0;
//         int divisor = 0;

//         for (Number q : numbers) {
//             if (q instanceof Double) {
//                 sum += q.doubleValue();
//                 divisor++;
//             }
//         }

//         return divisor == 0 ? null : (sum / divisor);
//     }
// }

// class Solution {

//     /**
//      * compares two values of the Double type
//      *
//      * @param value1 the first value of the Double type
//      * @param value2 the second value of the Double type
//      * @return "less" if value1 < value2, or "more" if value1 > value2, or "equal"
//      *         otherwise
//      */
//     public static String compareDouble(Double value1, Double value2) {
//         // put your code here
//         if (value1 < value2) {
//             return "less";
//         } else if (value1 > value2) {
//             return "more";
//         } else
//             return "equal";
//     }
// }

// class Solution {

//     /**
//      * counts the number of uppercase characters
//      *
//      * @param str the given string
//      * @return the number of uppercase characters
//      */
//     public static Integer countUpperCase(String str) {
//         // put your code here
//         Integer total = 0;
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (Character.isUpperCase(ch)) {
//                 total++;
//             }
//         }
//         return total;
//     }
// }

// import java.math.BigInteger;
// class Solution {

//     /**
//      * calculates the factorial of a number
//      *
//      * @param n a natural number
//      * @return the factorial of a natural number, or otherwise the "Invalid
//      *         parameter"
//      */
//     public static String calculateFactorial(String n) {
//         // put your code here
//         Integer in = Integer.parseInt(n);
//         BigInteger factorial = BigInteger.ONE;
//         if (in < 0) {
//             return "Invalid parameter";
//         } else if (in == 0) {
//             return "1";
//         } else {
//             for (int i = 1; i <= in; i++) {
//                 factorial = factorial.multiply(BigInteger.valueOf(i));
//             }
//         }
//         return factorial.toString(); // exclusively a stub for the first test
//     }
// }

// import java.math.BigInteger;

// class Solution {

//     /**
//      * Calculates the number from the Fibonacci sequence at the given index.
//      *
//      * @param index The index in the Fibonacci sequence.
//      * @return The Fibonacci number at the given index.
//      */
//     public static BigInteger calculateFibonacci(int index) {
//         if (index < 0) {
//             return BigInteger.valueOf(0); // Invalid index, return -1
//         } else if (index == 0) {
//             return BigInteger.ZERO; // Base case: Fibonacci(0) = 0
//         } else if (index == 1 || index == 2) {
//             return BigInteger.ONE; // Base case: Fibonacci(1) = 1, Fibonacci(2) = 1
//         }

//         BigInteger fibMinus2 = BigInteger.ZERO;
//         BigInteger fibMinus1 = BigInteger.ONE;
//         BigInteger fib = BigInteger.ZERO;

//         for (int i = 2; i <= index; i++) {
//             fib = fibMinus1.add(fibMinus2); // Fibonacci number at current index is sum of previous two
//             fibMinus2 = fibMinus1;
//             fibMinus1 = fib;
//         }

//         return fib;
//     }
// }
import java.util.Scanner;

class Pair<A, B> {
    private A a;
    private B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Pair [a=" + a + ", b=" + b + "]";
    }
}

public class Solution {
    public static Pair<?, ?> getPair(Scanner sc) {
        if (sc.hasNextInt()) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            return new Pair<>(first, second);
        } else {
            String first = sc.next();
            String second = sc.next();
            return new Pair<>(first, second);
        }
    }
}
