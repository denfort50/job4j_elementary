package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void when10to4then4() {
        int expected = 4;
        int p = 10;
        int k = 4;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when25to7then7() {
        int expected = 7;
        int p = 25;
        int k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0);
    }

    @Test
    public void when100to5then320() {
        int expected = 320;
        int p = 100;
        int k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0);
    }
}