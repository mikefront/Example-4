public class Main {
    public static void main(String[] args) {

        // Задание1
        int number = 1;
        while (number <= 10) {
            System.out.print(number++);
        }
        {
            System.out.println();
        }
        for (int someNumber = 10; someNumber >= 1; someNumber-- ) {
            System.out.print(+ someNumber);
        }
    }
}