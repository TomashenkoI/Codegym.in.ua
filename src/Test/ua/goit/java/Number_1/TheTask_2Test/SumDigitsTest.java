package Test.ua.goit.java.Number_1.TheTask_2Test;

import Main.ua.goit.java.Number_1.TheTask_2.SumDigits;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 22.04.2016.
 */
public class SumDigitsTest {

    @Test
    public void testSum() throws Exception {

        Assert.assertEquals(SumDigits.sum(123), 6);
    }

    @Test
    public void testSum2() throws Exception {

        Assert.assertEquals(SumDigits.sum2(444), 12);
    }

    @Test
    public void testSum3() throws Exception {

        Assert.assertEquals(SumDigits.sum3(-111111111), 9);
    }

    @Test
    public void testSum4() throws Exception {

        Assert.assertEquals(SumDigits.sum4(555), 15);
    }
}