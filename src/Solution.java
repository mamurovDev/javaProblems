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

// import java.util.Scanner;

// class Pair<A, B> {

//   private A a;
//   private B b;

//   public Pair(A a, B b) {
//     this.a = a;
//     this.b = b;
//   }

//   @Override
//   public String toString() {
//     return "Pair [a=" + a + ", b=" + b + "]";
//   }
// }

// public class Solution {

//   public static Pair<?, ?> getPair(Scanner sc) {
//     if (sc.hasNextInt()) {
//       int first = sc.nextInt();
//       if (sc.hasNextInt()) {
//         int second = sc.nextInt();
//         return new Pair<>(first, second);
//       } else {
//         String second = sc.next();
//         return new Pair<>(first, second);
//       }
//     } else {
//       String first = sc.next();
//       if (sc.hasNextInt()) {
//         int second = sc.nextInt();
//         return new Pair<>(first, second);
//       } else {
//         String second = sc.next();
//         return new Pair<>(first, second);
//       }
//     }
//   }
// }

// import java.util.Scanner;

// //Declare a generic class Mark with a bounded type parameter T
// class Mark<T extends Number> {

//   //Declare a class constant PASS_GRADE
//   final int PASS_GRADE = 4;
//   //Declare an instance class constant grade
//   final T grade;

//   //Declare a constructor
//   public Mark(T grade) {
//     this.grade = grade;
//   }

//   //Declare a boolean method isPassed()
//   public boolean isPassed() {
//     return this.PASS_GRADE <= this.grade.doubleValue();
//   }
// }

// class Solution {

//   //put the method getMark(Scanner sc) here
//   public static Mark<? extends Number> getMark(Scanner sc) {
//     if (sc.hasNextInt()) {
//       int gr = sc.nextInt();
//       Mark<Integer> mark = new Mark<>(gr);
//       return mark;
//     } else if (sc.hasNextDouble()) {
//       double gr = sc.nextDouble();
//       Mark<Double> mark = new Mark<>(gr);
//       return mark;
//     } else {
//       throw new IllegalArgumentException();
//     }
//   }
// }

// import java.util.Scanner;

// //declare a parameterized interface Higher
// interface Higher<T> {
//   boolean isHigher(T other);
// }

// //update the class header
// class Product implements Higher<Product> {

//   private final String name;
//   private final int price;

//   public Product(String name, int price) {
//     super();
//     this.name = name;
//     this.price = price;
//   }

//   public Product(Scanner sc) {
//     name = sc.next();
//     price = sc.nextInt();
//   }

//   public int getPrice() {
//     return price;
//   }

//   @Override
//   public boolean isHigher(Product product) {
//     return name.compareTo(product.name) < 0;
//   }

//   @Override
//   public String toString() {
//     return "Product [name=" + name + ", price=" + price + "]";
//   }
// }

// //update the class header
// class Purchase implements Higher<Purchase> {

//   private final Product product;
//   private final int number;

//   public Purchase(Product product, int number) {
//     super();
//     this.product = product;
//     this.number = number;
//   }

//   public Purchase(Scanner sc) {
//     product = new Product(sc);
//     number = sc.nextInt();
//   }

//   public int getCost() {
//     return product.getPrice() * number;
//   }

//   @Override
//   public boolean isHigher(Purchase purchase) {
//     return getCost() > purchase.getCost();
//   }

//   @Override
//   public String toString() {
//     return (
//       "Purchase [product=" +
//       product +
//       ", number=" +
//       number +
//       ", getCost()=" +
//       getCost() +
//       "]"
//     );
//   }
// }

// class Solution {

//   //declare a static method getHighest
//   //that accepts an array of objects of the type parameter T
//   //and returns the highest element of the array.
//   public static <T extends Higher<T>> T getHighest(T[] array) {
//     if (array.length == 0) {
//       throw new IllegalArgumentException();
//     }
//     T highest = array[0];
//     for (int i = 1; i < array.length; i++) {
//       if (array[i].isHigher(highest)) {
//         highest = array[i];
//       }
//     }
//     return highest;
//   }
// }

// import java.util.*;

// public class Solution {
//    public static void main(String[] args) {
//       PriorityQueue<Integer> queue = new PriorityQueue<>(); 
// for(int i = 0; i < 3; i++) 
//     queue.add(i); 
// queue.add(1); 
// for(int i = 0; i < 3; i++) 
//     System.out.print(queue.remove()); 
// for(int i = 0; i < 1; i++) 
//    System.out.print(queue.peek()); 
//    }

// }

import java.util.Arrays;

class Solution {

    /**
     * @param a the number.
     * @param b the number.
     * @param c the number.
     * @return the pair of numbers - minimum and maximum from a, b, c
     */
    public static Pair getMinAndMax(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        return new Pair(min, max);
    }

}


/**
 * Represents a pair of integers.
 * 
 * Do not change this class. 
 */
class Pair {

	private int x0;

	private int x1;

	public Pair(int x0, int x1) {
		this.x0 = x0;
		this.x1 = x1;
	}

	public int getx0() {
		return x0;
	}

	public int getX1() {
		return x1;
	}

	@Override
	public String toString() {
		return String.format("(%d, %d)", x0, x1);
	}

}


