package Lesson5;

public class LoopIf {
    public static void main(String[] args) {
        int a = 10;
        a = a + 1;
        a += 1;
        a++;    // Инкремента
        a = a - 1;
        a -= 1;
        a--;    // Декремента

        // вывести числа от 1 до 1000 каждое с новой строчки
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break;
            }
        }

    }
}
