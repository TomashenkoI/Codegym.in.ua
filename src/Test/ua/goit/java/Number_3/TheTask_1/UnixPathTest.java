package Test.ua.goit.java.Number_3.TheTask_1;

import Main.ua.goit.java.Number_3.TheTask_1.UnixPath;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by 7 on 07.05.2016.
 */
public class UnixPathTest {
    UnixPath unixPath = new UnixPath();

    @Test
    public void testSimplify() throws Exception {
        String input = "//";
        String expected = "/";

        Assert.assertEquals(unixPath.simplify(input),expected);
    }

    @Test
    public void testSimplify1() throws Exception {
        String input = "/var//lib";
        String expected = "/var/lib";

        Assert.assertEquals(unixPath.simplify(input),expected);
    }

    @Test
    public void testSimplify2() throws Exception {
        String input = "/.";
        String expected = "/";

        Assert.assertEquals(expected, unixPath.simplify(input));
    }

    @Test
    public void testSimplify3() throws Exception {
        String input = "/var//lib/";
        String expected = "/var/lib";

        Assert.assertEquals(expected, unixPath.simplify(input));
    }

    @Test
    public void testSimplify4() throws Exception {
        String input = "/var/lib/../log/./../tmp/data///.";
        String expected = "/var/tmp/data";

        Assert.assertEquals(expected, unixPath.simplify(input));
    }
}
