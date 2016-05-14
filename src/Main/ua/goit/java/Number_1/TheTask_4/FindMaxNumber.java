package Main.ua.goit.java.Number_1.TheTask_4;

/**
 * Created by 7 on 22.04.2016.
 */
public class FindMaxNumber {
    public static int max(int[] input) {
        int max = input[0];

        for (int i = 0; i < input.length; i++) {
            if (input[i] > max){
                max = input[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        max()
    }
}
