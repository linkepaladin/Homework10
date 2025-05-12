public class Main {
    public static void main(String[] args) {
        // task 1

        System.out.println("Задача 1");

        int [] numbers = new int[]{1, 2, 3};
        double [] digits = {1.57, 7.654, 9.986};
        char [] chars = new char[15];

        // task 2

        System.out.println("Задача 2");

        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print("" + numbers [numbers.length - 1]);
        System.out.println();
        for (int i = 0; i < digits.length - 1; i++) {
            System.out.print(digits[i] + ", ");
        }
        System.out.print("" + digits[digits.length - 1]);
    }
}