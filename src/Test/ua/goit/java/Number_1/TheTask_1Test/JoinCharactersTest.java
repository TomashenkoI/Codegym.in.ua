package Test.ua.goit.java.Number_1.TheTask_1Test;

import Main.ua.goit.java.Number_1.TheTask_1.JoinCharacters;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 22.04.2016.
 */
public class JoinCharactersTest {

    @Test
    public void testJoin() throws Exception {
        char[] ad = {'1', '2', '3'};

        Assert.assertEquals(JoinCharacters.join(ad), 123);
    }
}