package class3;

import org.testng.annotations.Test;

public class GroupingDemo {
    @Test(groups = "smoke")
    public void firstMethod() {
        System.out.println("This is first method");
    }
    @Test(groups = "regression")
    public void secondMethod() {
        System.out.println("This is second method");
    }
    @Test(groups = "smoke")
    public void thirdMethod() {
        System.out.println("This is third method");

    }
    @Test(groups ="smoke")
    public void fourthMethod() {
        System.out.println("This is fourth method");
    }
}

