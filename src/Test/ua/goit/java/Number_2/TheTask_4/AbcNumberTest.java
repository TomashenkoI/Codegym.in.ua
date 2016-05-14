package Test.ua.goit.java.Number_2.TheTask_4;

import Main.ua.goit.java.Number_2.TheTask_4.AbcNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 29.04.2016.
 */
public class AbcNumberTest {

    AbcNumber abcNumber = new AbcNumber();

    @Test
    public void testConvert() throws Exception {

        int result = abcNumber.convert("bcd");

        Assert.assertEquals(result, 123);
    }
}
