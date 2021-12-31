package Lesson5;

public class LoopFor {
    public static void main(String[] args) {
//        for (int i = 0; i  < 100; i++) {
//            System.out.println(i);
//        }
        for (int i = 100; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
