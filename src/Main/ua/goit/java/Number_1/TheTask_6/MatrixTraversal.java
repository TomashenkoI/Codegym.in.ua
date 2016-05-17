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
}
