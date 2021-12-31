package Homework.Lesson4;

public class Gipotenuza {
    public static void main(String[] args) {
        // написать программу, которая принимает значение катетов a и b,
        // и выводит на экран значение гиппотенузы с, используя Теорему Пифагора
/*        Math.sqrt(36);
        double sqrt = Math.sqrt(36);
        System.out.println("Корень из 36 равен: " + sqrt);*/
            double a = 5;
            double b = 7;
            double c = Math.sqrt(a*a + b*b);
        System.out.println(c);
    }
}
