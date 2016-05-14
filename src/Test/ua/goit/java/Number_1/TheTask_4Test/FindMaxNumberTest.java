package Test.ua.goit.java.Number_1.TheTask_4Test;

import Main.ua.goit.java.Number_1.TheTask_4.FindMaxNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 22.04.2016.
 */
public class FindMaxNumberTest {

    @Test
    public void testMax() throws Exception {

        int[] input = {1, 2, 5, 3};

        Assert.assertEquals(FindMaxNumber.max(input), 5);
    }
}
