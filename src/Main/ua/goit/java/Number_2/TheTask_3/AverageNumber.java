package Main.ua.goit.java.Number_2.TheTask_3;

/**
 * Created by 7 on 29.04.2016.
 */
public class AverageNumber {
    public int average(int a, int b) {
        int result;

        result = (a + b) / 2;
        if (a >= 2147483640 || a <= 2147483640 || b >= 2147483640 || b <= 2147483640) {
            long a1 = a;
            long b1 = b;
            long result1 = (a1 + b1) / 2;
            result = (int) result1;
        }
        if (a == b) {
            result = a;
        }

        return result;
    }

    public static void main(String[] args) {
    }
}