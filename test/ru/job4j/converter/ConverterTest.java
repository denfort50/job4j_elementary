package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert0RblThen2Euro() {
        int in = 0;
        int expected = 0;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        double in = 140.0;
        double expected = 2.33;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}