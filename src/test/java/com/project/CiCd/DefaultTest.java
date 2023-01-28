package com.project.CiCd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class DefaultTest {

    private static long test;

    @BeforeAll
    public static void setUp(){
        test = 10L;
    }

    @Test
    public void defaultTest(){
        Assert.isTrue(10L == test);
    }
}
