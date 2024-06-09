public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.5, 2.3, -3.4, 4.1, 5.6, -1.2, 7.8, -6.7, 8.9, 9.0, -5.1, 10.2, 11.3, -2.4, 12.5};

        double sum = 0;
        int count = 0;
        boolean firstNegativeFound = false;

        for (double num : numbers) {
            if (num < 0) {
                firstNegativeFound = true;
            } else if (firstNegativeFound && num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного числа: " + average);
        } else {
            System.out.println("Положительные числа после первого отрицательного числа не найдены.");
        }
    }
}
