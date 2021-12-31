package Lesson2;

public class Days {
    // Дано количество дней. Необходимо подсчитать, сколько это
    // сколько это лет, месяцев, дней.
    public static void main(String[] args) {

        int days = 5000;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - years * 365 - month * 31;
        System.out.println("Общее количество дней: " + days);
        System.out.println("Лет: " + years);
        System.out.println("Месяцев: " + month);
        System.out.println("Дней: " + leftDays);


    }
}
