class Demo {

    public static int resistance(int voltage, int current) {
        if (current == 0) {
            throw new ArithmeticException("Resistance is infinite: voltage = " + voltage + ", current = " + current);
        }
        return voltage / current;
    }

    public static void main(String[] args) {
        for (String arg : args) {
            String[] pair = arg.split(",");

            try {
                int voltage = Integer.parseInt(pair[0]);
                int current = Integer.parseInt(pair[1]);

                int calculatedResistance = resistance(voltage, current);
                System.out.println(calculatedResistance);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format for pair: " + arg);
            } catch (ArithmeticException e) {
                System.out.println( e.getMessage());
            }
        }
    }
}
