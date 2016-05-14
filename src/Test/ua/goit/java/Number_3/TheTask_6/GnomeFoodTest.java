package Test.ua.goit.java.Number_3.TheTask_6;

import Main.ua.goit.java.Number_3.TheTask_6.GnomeFood;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by 7 on 07.05.2016.
 */
public class GnomeFoodTest {

    @Test
    public void testFind() throws Exception {
        GnomeFood gf = new GnomeFood();
        int[] gnames = { 3, };
        int[] food = { 9,};
        int[] expected = { 0,};
        String result = Arrays.toString(gf.find(gnames, food));
        String exp = Arrays.toString(expected);

        Assert.assertEquals(result,exp);
    }
}
