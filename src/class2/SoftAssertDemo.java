package class2;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
    @Test
    public void softAssertionMethod() {
        String expectedText = "this is my test";
        String actualTest = "THIS is my test";

        SoftAssert softAssert = new SoftAssert();

        softAssert.assertEquals(actualTest, expectedText);
        System.out.println("Code after first assertion");

        softAssert.assertTrue(false);
        System.out.println("Code after second assertion");

        softAssert.assertFalse(true);
        System.out.println("Code after third assertion");

        String secondExpectedText = "This is my second test";
        String secondActualTest = "This is my second test";
        softAssert.assertEquals(secondActualTest, secondExpectedText);
        System.out.println("This is second expected result");

        softAssert.assertAll();
    }
}
