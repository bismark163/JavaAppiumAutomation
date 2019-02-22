import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass

{
    @Test
    public void testGetClassNumber()
    {
        String str = this.getClassString();
        if (str.contains("Hello"))
        {

        } else if (str.contains("hello")) {

        } else {
            Assert.fail("String does not contains 'Hello' or 'hello' ");
        }

    }
}