import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass

{
    @Test
    public void testGetClassNumber()
    {
        int a = this.getClassNumber();
        System.out.println(a);

        Assert.assertTrue("Number less than or equal to 45",a > 45);
    }
}