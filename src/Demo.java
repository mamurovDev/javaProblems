class Demo {
    public static int sum(int[] array, int fromIndex, int toIndex) {
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }

        if (fromIndex < 0) {
            throw new ArrayIndexOutOfBoundsException("fromIndex < 0: " + fromIndex);
        }

        if (toIndex >= array.length) {
            throw new ArrayIndexOutOfBoundsException("toIndex >= array.length: " + toIndex);
        }

        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("fromIndex > toIndex: " + fromIndex + " > " + toIndex);
        }

        int sum = 0;
        for (int i = fromIndex; i <= toIndex; i++) {
            sum += array[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        // Example usage
        int[] array = {5, 10, 15, 5};
        int fromIndex = 0;
        int toIndex = 2;

        try {
            int result = sum(array, fromIndex, toIndex);
            System.out.println(result);
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
