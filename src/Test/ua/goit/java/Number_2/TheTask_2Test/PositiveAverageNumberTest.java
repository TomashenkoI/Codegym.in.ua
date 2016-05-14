package Test.ua.goit.java.Number_2.TheTask_2Test;

import Main.ua.goit.java.Number_2.TheTask_2.PositiveAverageNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 29.04.2016.
 */
public class PositiveAverageNumberTest {
    PositiveAverageNumber aver = new PositiveAverageNumber();

    @Test
    public void testAverage() throws Exception {
        int in = aver.average(1073741824, 1073741824);
        int exp = 1073741824;

        Assert.assertEquals(in, exp);
    }

    @Test
    public void testAverage1() throws Exception {
        int in = aver.average(5, 9);
        int exp = 7;

        Assert.assertEquals(in, exp);
    }

    @Test
    public void testAverage2() throws Exception {
        int in = aver.average(2, 7);
        int exp = 4;

        Assert.assertEquals(in, exp);
    }
}
