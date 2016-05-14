package Test.ua.goit.java.Number_3.TheTask_2;

import Main.ua.goit.java.Number_3.TheTask_2.LongestStabilityPeriod;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 06.05.2016.
 */
public class LongestStabilityPeriodTest {

    @Test
    public void testCount() throws Exception {
        LongestStabilityPeriod lsp = new LongestStabilityPeriod();
        int[] gdp = {900, 901, 902, 903, 904, 904, 904, 904, 904, 904, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 906, 906, 906, 906, 906, 906, 906, 906, 906, 906, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 905, 904, 904, 904, 904, 904, 904, 904, 904, 904, 904, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 922, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 901, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903, 903,};
        Assert.assertEquals(lsp.count(gdp), 90);
    }

    @Test
    public void testCount1() throws Exception {
        LongestStabilityPeriod lsp = new LongestStabilityPeriod();
        int[] gdp = { 1000, };
        Assert.assertEquals(lsp.count(gdp), 1);
    }

    @Test
    public void testCount2() throws Exception {
        LongestStabilityPeriod lsp = new LongestStabilityPeriod();
        int[] gdp = {  900, 902, 904, 906, 908,  };
        Assert.assertEquals(lsp.count(gdp), 1);

    }@Test
    public void testCount3() throws Exception {
        LongestStabilityPeriod lsp = new LongestStabilityPeriod();
        int[] gdp = { 900, 900, 900, 901, 902, 902, 903, 903, };
        Assert.assertEquals(lsp.count(gdp), 4);
    }

    @Test
    public void testCount4() throws Exception {
        LongestStabilityPeriod lsp = new LongestStabilityPeriod();
        int[] gdp = { 901, 901, 901, 902, 902, 903, 903, 902, 902, 901,  };
        Assert.assertEquals(lsp.count(gdp), 6);
    }

    @Test
    public void testCount5() throws Exception {
        LongestStabilityPeriod lsp = new LongestStabilityPeriod();
        int[] gdp = { 902, 902, 901, 902, 902, 903, 902, 902, 901, 902, 901, 901, 902, 903, };
        Assert.assertEquals(lsp.count(gdp), 7);
    }
}
