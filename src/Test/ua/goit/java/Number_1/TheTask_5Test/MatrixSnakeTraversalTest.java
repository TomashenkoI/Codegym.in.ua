package Test.ua.goit.java.Number_1.TheTask_5Test;

import Main.ua.goit.java.Number_1.TheTask_5.MatrixSnakeTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by 7 on 23.04.2016.
 */
public class MatrixSnakeTraversalTest {

    @Test
    public void testPrint() throws Exception {

        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        ArrayList<Integer> list = new ArrayList<>();

        int[] result = MatrixSnakeTraversal.print(input);
        for (int i = 0; i < result.length; i++) {
            list.add(result[i]);
        }
            ArrayList<Integer> list1 = new ArrayList<>();

            int[] output = {1, 4, 7, 8, 5, 2, 3, 6, 9};

            for (int j = 0; j < output.length; j++) {
                list1.add(output[j]);
            }
        System.out.println(list);
            Assert.assertEquals(list, list1);
        }
    }

