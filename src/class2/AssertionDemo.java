package class2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
    @Test
    public void AssertionMethod() {
        String expected = "JoinCoreTech";
        String actual = "JoinCoreTech";

        boolean buttonIsEnabled = true;
        System.out.println("This is expected text " + expected);
        Assert.assertTrue(buttonIsEnabled);


        System.out.println("Looking for an other assertion ");
        Assert.assertEquals(expected, actual);
        System.out.println("My test is working fine and passed");

        /*if (expected.equals(actual)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }*/
    }
}
