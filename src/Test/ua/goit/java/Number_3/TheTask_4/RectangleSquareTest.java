package Test.ua.goit.java.Number_3.TheTask_4;

import Main.ua.goit.java.Number_3.TheTask_4.RectangleSquare;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 16.05.2016.
 */
public class RectangleSquareTest {

    @Test
    public void testMeasure() throws Exception {
        RectangleSquare rectangleSquare = new RectangleSquare();
        int[] x = {0, 0};
        int[] h = {20, 10};
        int[] w = {10, 20};
        int expected = 300;

        Assert.assertEquals(expected, rectangleSquare.measure(x,h,w));
    }

    @Test
    public void testMeasure1() throws Exception {
        RectangleSquare rectangleSquare = new RectangleSquare();
        int[] x = {0, 10};
        int[] h = {10, 10};
        int[] w = {10, 10};
        int expected = 200;

        Assert.assertEquals(expected, rectangleSquare.measure(x,h,w));
    }
}
