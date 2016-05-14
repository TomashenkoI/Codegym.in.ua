package Test.ua.goit.java.Number_1.TheTask_3Test;

import Main.ua.goit.java.Number_1.TheTask_3.FirstOddNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 22.04.2016.
 */
public class FirstOddNumberTest {

    @Test
    public void testFind() throws Exception {

        int[] input = {2, 4, 4, 6, 8, 9, 4, 1};

        Assert.assertEquals(FirstOddNumber.find(input), 5);
    }
}
