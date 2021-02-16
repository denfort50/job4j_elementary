package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int out = Factorial.calc(5);
        assertThat(out, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int out = Factorial.calc(0);
        assertThat(out, is(1));
    }
}