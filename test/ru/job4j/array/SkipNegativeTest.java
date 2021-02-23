package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SkipNegativeTest {

    @Test
    public void skip1() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }

    @Test
    public void skip2() {
        int[][] in = {
                {1, -2, -5, -7},
                {1, 2, 3, -4}
        };
        int[][] expect = {
                {1, 0, 0, 0},
                {1, 2, 3, 0}
        };
        int[][] rsl = SkipNegative.skip(in);
        assertThat(rsl, is(expect));
    }
}