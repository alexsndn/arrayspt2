public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила "+sum);
        //task 2
        System.out.println("Task 2");
        int maxSum = 0;
        int minSum = 200000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            } else if (arr[i] < minSum) {
                minSum = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день "+maxSum);
        System.out.println("Минимальная сумма трат за день "+minSum);
        //task 3
        System.out.println("Task 3");
        double average = sum/30;
        System.out.println("Средняя сумма трат составила "+average);
        //task 4
        System.out.println("task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i-1]);
        }
    }
    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

}