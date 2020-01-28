package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    @Before
    public void before_all_test() {
        System.out.println(">> Before all hook");
    }

    @Before("@RegTest")
    public void before_reg_test() {
        System.out.println(">> Before Reg Test hook");
    }

    @After("@RegTest")
    public void after_reg_test() {
        System.out.println(">> After Reg Test hook");
    }

    @Before("@SmokeTest")
    public void before_smoke_test() {
        System.out.println(">> Before Smoke Test hook");
    }
}
