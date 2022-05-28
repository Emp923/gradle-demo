package com.epenrod;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HelloTest {
    
    private static Hello obj1;
    private static Hello obj2;
    private static Hello obj3;

    @BeforeClass
    public static void setup() {
        obj1 = new Hello(2, 3);
        obj2 = new Hello(-2, 3);
        obj3 = new Hello(0, 0);
    }

    @Test
    public void test_addThem() {
        Assert.assertEquals(5, obj1.addThem());
        Assert.assertEquals(1, obj2.addThem());
        Assert.assertEquals(0, obj3.addThem());
    }

}
