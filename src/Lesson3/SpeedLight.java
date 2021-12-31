package Lesson3;

public class SpeedLight {
    public static void main(String[] args) {
        // Задача: Дано количество дней 1000: скорость света 300000 км/с. Какое расстояние пройдет свет за это время?
        int days = 1000;
        int speed = 300000;
        long seconds = days * 24 * 60 * 60;
        long distance = speed * seconds;
        System.out.println(distance);

//        byte a = 127;
//        a += 1;
//        System.out.println(a);
    }
}
