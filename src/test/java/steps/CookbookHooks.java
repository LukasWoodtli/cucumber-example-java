package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CookbookHooks {

    @Before
    public static void createDriver() {
        System.out.println("Inside Before");
    }

    @Before("@web")
    public static void createDriverWeb() {
        System.out.println("Inside Web Hook");
//sample code
    }

    @After
    public void tearDown() {
        System.out.println("Inside After");
    }
}
