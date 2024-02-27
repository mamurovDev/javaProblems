//import java.util.Scanner;
//
//class Trip {
//    private final int DAILY_RATE = 50;
//    private final int numberOfDays;
//    private final int fare;
//
//    Trip(int numberOfDays, int fare) {
//        this.numberOfDays = numberOfDays;
//        this.fare = fare;
//    }
//
//    public final int totalCost() {
//        return DAILY_RATE * numberOfDays + fare;
//    }
//
//    protected int calculateCost() {
//        return DAILY_RATE * numberOfDays + fare;
//    }
//}
//
//class HomeTrip extends Trip {
//    private static final int DAILY_RATE = 60;
//
//    public HomeTrip(int numberOfDays) {
//        super(numberOfDays, 0);
//    }
//
//    @Override
//    protected int calculateCost() {
//        return DAILY_RATE * super.calculateCost();
//    }
//}
//
//class OneDayTrip extends Trip {
//    private static final int dailyRate = 35;
//
//    public OneDayTrip(int fare) {
//        super(1, fare);
//    }
//
//    @Override
//    protected int calculateCost() {
//        return dailyRate * super.calculateCost();
//    }
//}
//
//class Solution {
//    public static Trip getTrip(Scanner sc) {
//        int id = sc.nextInt();
//        if (id == 1) {
//            int numberOfDays = sc.nextInt();
//            return new HomeTrip(numberOfDays);
//        } else if (id == 2) {
//            int fare = sc.nextInt();
//            return new OneDayTrip(fare);
//        } else {
//            int numberOfDays = sc.nextInt();
//            int fare = sc.nextInt();
//            return new Trip(numberOfDays, fare);
//        }
//    }
//}
