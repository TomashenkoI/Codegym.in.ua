package Main.ua.goit.java.Number_1.TheTask_6;

/**
 * Created by 7 on 23.04.2016.
 */
public class MatrixTraversal {
    public static int[] print(int[][] input) { /*-4x3*/

        int z = -1;
        int i;
        int j;
        int firstElement = 0;
        int lastElement = 0;
        int[] result = new int[input.length * input[0].length];

        for (j = 0; j < input[0].length; j++) {
            i = 0;
            z++;
            result[z] = input[i][j];
        }
        firstElement += 1;

        for (i = firstElement; i < input.length; i++) {
            j = input[i].length - firstElement;
            z++;
            result[z] = input[i][j];
        }

        for (j = input[0].length - 2; j > -1; j--) {
            i = input.length - 1;
            z++;
            result[z] = input[i][j];
        }
        lastElement += 1;

        for (i = input.length - 1 - firstElement; i > 0; i--) {
            j = 0;
            z++;
            result[z] = input[i][j];
        }

        for (j = firstElement; j < input[0].length - lastElement; j++) {
            i = 1;
            z++;
            result[z] = input[i][j];
        }
        firstElement += 1;

        for (i = firstElement; i < input.length - lastElement; i++) {
            j = input[i].length - lastElement - 1;
            z++;
            result[z] = input[i][j];
        }

        firstElement++;
        for (j = input.length - firstElement; j > lastElement - 1; j--) {
            i -= 1;
            if (z < input.length * input[0].length - 1) {
                z++;
            }
            result[z] = input[i][j];
        }

        return result;
    }

    public static void main(String[] args) {
//        int[][] input = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9,10,11,12},
//                {13,14,15,16},
//        };
        int[][] input = {
                {1, 2, 3/*, 4*/},
                {5, 6, 7/*, 8*/},
                {9,10,11/*,12*/},
                {13,14,15/*,16*/},
        };
//        int[][] input = {
//                {1, 2, 3},
//                {5, 6, 7},
//                {9,10,11},
//        };
//        int[][] input = {
//                {1, 2},
//                {5, 6},
//                {9,10},
//        };
//        int[][] input = {
//                {1, 2},
//                {5, 6},
//        };
        int z = -1;
        int i;
        int j;
        int size = input.length - 1;
        int firstElement = 0;
        int lastElement = 0;
        int[] result = new int[input.length * input[0].length];
        StringBuilder builder = new StringBuilder();

            for (j = 0; j < input[0].length; j++) {
                i = 0;
                    z++;
                    result[z] = input[i][j];
            }
            firstElement += 1;

            for (i = firstElement; i < input.length; i++) {
                j = input[i].length - firstElement;
                z++;
                result[z] = input[i][j];
            }

            for (j = input[0].length - 2; j > -1; j--) {
                i = input.length - 1;
                z++;
                result[z] = input[i][j];
            }
            lastElement += 1;

            for (i = input.length - 1 - firstElement; i > 0; i--) {
                j = 0;
                z++;
                result[z] = input[i][j];
            }

            for (j = firstElement; j < input[0].length - lastElement; j++) {
                i = 1;
                z++;
                result[z] = input[i][j];
            }
            firstElement += 1;

            for (i = firstElement; i < input.length - lastElement; i++) {
                j = input[i].length - lastElement - 1;

                z++;
                result[z] = input[i][j];
            }

        firstElement++;
        System.out.println(i);
        System.out.println(z);
            for (j = input.length - firstElement; j > lastElement - 1; j--) {
                i -= 1;
                if (z < input.length * input[0].length - 1) {
                    z++;
                }
//                z = (input.length - 1) * (input[0].length - 1);
                result[z] = input[i][j];
            }


//        System.out.println(input[1][2]);
        System.out.println(input[0].length);
        for (i = 0; i < result.length; i++) {
            builder.append(result[i]+" ");
        }
        System.out.println(builder);
    }
}
