package Main.ua.goit.java.Number_1.TheTask_5;

/**
 * Created by 7 on 22.04.2016.
 */
public class MatrixSnakeTraversal {
    public static int[] print(int[][] input) {
        int z = -1;
        int[] result = new int[input.length * input[0].length];
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input[0].length; i++) {
            if (i % 2 ==0) {
                for (int j = 0; j < input.length; j++) {
                    z++;
                    result[z] = input[j][i];
                }
            }
            else {
                for (int j = input.length - 1; j > -1; j--) {
                    z++;
                    result[z] = input[j][i];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3, 13},
                {4, 5, 6, 14},
                {7, 8, 9, 15},
                {10,11,12, 16},
        };
//        int z = -1;
//        int[] result = new int[input.length * input[0].length];
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < input[0].length; i++) {
//            if (i % 2 ==0) {
//                for (int j = 0; j < input.length; j++) {
//                    z++;
//                    result[z] = input[j][i];
//                }
//            }
//            else {
//                for (int j = input.length - 1; j > -1; j--) {
//                    z++;
//                    result[z] = input[j][i];
//                }
//            }
//        }
//        for (int i = 0; i < result.length; i++) {
//            builder.append(result[i]);
//        }
//        System.out.println(builder);
            }
        }


