package Main.ua.goit.java.Number_2.TheTask_2;

/**
 * Created by 7 on 29.04.2016.
 */
public class PositiveAverageNumber {
    public int average(int a, int b) {
        int result = 0;

        result = (a + b) / 2;
        if (a == b) {
            result = a;
        }

        return result;
    }
}
