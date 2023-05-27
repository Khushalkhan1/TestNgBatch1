package reviewClass1;

import org.testng.annotations.*;

public class Demo1 {
    // Testing is annotation based tool/ framework.
    //The main annotation in testing is @Test.
    // When we tag any method with this annotation, it means it is actual test method.

    @Test
    public void firstTest(){
        System.out.println("I am first test");
    }
    @Test
    public void secondTest(){
        System.out.println("I am second test");
    }
    @Test
    public void a(){
        System.out.println("I am A");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("I am before test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am after test");
    }
}
