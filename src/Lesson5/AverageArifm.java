package Lesson5;

public class AverageArifm {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        while (count <= 100) {
            sum += count;
            count++;
        }
        float result = sum / (float) count;
        System.out.println(result);
    }

}
