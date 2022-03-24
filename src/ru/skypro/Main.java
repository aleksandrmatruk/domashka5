package ru.skypro;

public class Main {

    static int[] arr = generateRandomArray();

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println("Задание 2");
        int maxExpense = 0;
        int minExpense = 200_000;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxExpense) {
                maxExpense = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxExpense + " рублей");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minExpense) {
                minExpense = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей");
        System.out.println("Задание 3");
        float averageValue = (sum / arr.length);
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");


        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


}
