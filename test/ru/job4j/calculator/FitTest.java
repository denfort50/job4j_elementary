package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan175Then86() {
        short in = 175;
        double expected = 86;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.25);
    }

    @Test
    public void whenWoman162Then59() {
        short in = 162;
        double expected = 59;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.8);
    }
}