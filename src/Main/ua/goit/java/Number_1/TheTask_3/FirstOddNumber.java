package Main.ua.goit.java.Number_1.TheTask_3;

/**
 * Created by 7 on 22.04.2016.
 */
public class FirstOddNumber {
    public static int find(int[] input) {
        int firstOdd = -1;

        for (int i = 0; i < input.length; i++) {
            int a = input[i] % 2;
            if (a != 0) {
                firstOdd = i;
                break;
            }
        }
        return firstOdd;
    }

    public static void main(String[] args) {
        int firstOdd = -1;
        int[] input = {2, 4, 4, 7, 1, 1, 8};

        for (int i = 0; i < input.length; i++) {
            int a = input[i] % 2;
            if (a != 0) {
                firstOdd = i;
                break;
            }
        }
        System.out.println(firstOdd);
    }
}
