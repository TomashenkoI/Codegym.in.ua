package Test.ua.goit.java.Number_1.TheTask_6Test;

import Main.ua.goit.java.Number_1.TheTask_6.MatrixTraversal;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7 on 23.04.2016.
 */
public class MatrixTraversalTest {


    @Test
    public void testPrint() throws Exception {

        MatrixTraversal a = new MatrixTraversal();

        int[][] input1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int[][] input2 = {
                {1, 2, 3},
                {5, 6, 7},
                {9,10,11},
        };
        int[][] input3 = {
                {1, 2},
                {5, 6},
        };

        List<Integer> in1 = new ArrayList<>();
            in1.add(1);
            in1.add(2);
            in1.add(3);
            in1.add(4);
            in1.add(8);
            in1.add(12);
            in1.add(16);
            in1.add(15);
            in1.add(14);
            in1.add(13);
            in1.add(9);
            in1.add(5);
            in1.add(6);
            in1.add(7);
            in1.add(11);
            in1.add(10);

        List<Integer> in2 = new ArrayList<>();
        in2.add(1);
        in2.add(2);
        in2.add(3);
        in2.add(7);
        in2.add(11);
        in2.add(10);
        in2.add(9);
        in2.add(5);
        in2.add(6);

        int[] output = a.print(input1);
        List<Integer> out1 = new ArrayList<>();
        for (int i = 0; i < output.length; i++) {
            out1.add(output[i]);
        }

        Assert.assertEquals(in1, out1);

    }
}
