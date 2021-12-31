package Homework.lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        // Задача: необходимо создать цикл, который выводит все нечетные числа
        // от 100 до 1000, которые делятся на 5
        for (int i = 100; i <= 1000; i++) {
            if (i % 2 == 1 && i % 5 == 0) {
                System.out.println(i);
            }

        }
    }
}
