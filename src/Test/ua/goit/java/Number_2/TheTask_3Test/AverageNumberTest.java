package Test.ua.goit.java.Number_2.TheTask_3Test;

import Main.ua.goit.java.Number_2.TheTask_3.AverageNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 29.04.2016.
 */
public class AverageNumberTest {
    AverageNumber aver = new AverageNumber();

    @Test
    public void testAverage() throws Exception {
        int in = aver.average(1073741824, 1073741824);
        int exp = 1073741824;

        Assert.assertEquals(in, exp);
    }

    @Test
    public void testAverage1() throws Exception {
        int in = aver.average(-7, -3);
        int exp = -5;

        Assert.assertEquals(in, exp);
    }

    @Test
    public void testAverage3() throws Exception {
        int in = aver.average(2, 4);
        int exp = 3;

        Assert.assertEquals(in, exp);
    }

    @Test
    public void testAverage2() throws Exception {
        int in = aver.average(-2147483648, -2);
        int exp = -1073741825;

        Assert.assertEquals(in, exp);
    }
}

