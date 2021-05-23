package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class MathCalculatorTest {

    @Test
    public void sumAndMultiplyTest() {
        double d1 = 6;
        double d2 = 3;
        double rsl = 27;
        assertThat(MathCalculator.sumAndMultiply(d1, d2), is(rsl));
    }

    @Test
    public void differAndDevideTest() {
        double d1 = 6;
        double d2 = 3;
        double rsl = 5;
        assertThat(MathCalculator.differAndDevide(d1, d2), is(rsl));
    }

    @Test
    public void sumAllOperationsTest() {
        double d1 = 6;
        double d2 = 3;
        double rsl = 32;
        assertThat(MathCalculator.sumAllOperations(d1, d2), is(rsl));
    }

}