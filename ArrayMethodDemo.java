public class ArrayMethodDemo {
    public static void main(String args[]) {
        int[] numbers = new int[8];
        numbers[0] = 12;
        numbers[1] = 15;
        numbers[2] = 34;
        numbers[3] = 67;
        numbers[4] = 4;
        numbers[5] = 9;
        numbers[6] = 10;
        numbers[7] = 7;
        int limit = 12;

        display(numbers);
        System.out.println("");
        displayReverse(numbers);
        System.out.println("");
        displaySum(numbers);
        displayLessThan(numbers, limit);
        System.out.println("");
        displayHigherThanAverage(numbers);
    }

    public static void display(int[] numbers) {
        // Write your code here
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void displayReverse(int[] numbers) {
        // Write your code here
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void displaySum(int[] numbers) {
        // Write your code here
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }

    public static void displayLessThan(int[] numbers, int limit) {
        // Write your code here
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < limit) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    public static void displayHigherThanAverage(int[] numbers) {
        // Write your code here
        int sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            double average = sum / numbers.length;
        if (numbers[i] > average) {
            System.out.print(numbers[i] + " ");
        }
        }
    }
}