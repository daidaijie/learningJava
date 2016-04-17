package com.net.exceptionTest.assertTest;

/**
 * Created by daidaijie on 2016/4/17.
 */
public class AssertTest {
    public static void main(String[] args) {
        ClassLoader.getSystemClassLoader().setDefaultAssertionStatus(true);
        int x = -5;
        assert x >= 0 : "x<0";
        double y = Math.sqrt(x);
        System.out.println(Double.isNaN(y));
    }
}
