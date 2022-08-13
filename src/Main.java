public class Main {
    public static void main(String[] args) {

        // Задание1
        int number = 1;
        while (number <= 10) {
            System.out.print(number++);
        }
        System.out.println();
        for (int someNumber = 10; someNumber >= 1; someNumber--) {
            System.out.print(+someNumber);
        }
        {
            System.out.println();
        }

        // Задание2
        int reportingDay = 5;
        for (int i = 5; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет");
        }
        // Задание3
        for (int startYear = 1822; startYear <= 2122; startYear = startYear + 79) {
            System.out.println(startYear);
        }
    }
}