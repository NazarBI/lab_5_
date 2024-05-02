public class Main {
    // Метод для обчислення площі ромба
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }

    // Метод для знаходження найменшого числа серед трьох
    public static int findMinimum(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    // Метод для виведення масиву
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод для знаходження найбільшого числа в масиві
    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Приклад використання методів
        double rhombusArea = calculateRhombusArea(4, 5);
        System.out.println("Площа ромба: " + rhombusArea);

        int minNumber = findMinimum(3, 7, 2);
        System.out.println("Найменше число: " + minNumber);

        int[] numbers = {10, 5, 8, 3, 12};
        System.out.print("Масив: ");
        printArray(numbers);

        int maxNumber = findMaximum(numbers);
        System.out.println("Найбільше число в масиві: " + maxNumber);
    }
}