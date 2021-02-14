package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class ThreeMaxTest {

    @Test
    public void firstMax() {
        int rsl = ThreeMax.max(10, 5, 1);
        assertThat(rsl, is(10));
    } // проверяю разные числа, первое – max

    @Test
    public void secondMax() {
        int rsl = ThreeMax.max(5, 10, 1);
        assertThat(rsl, is(10));
    } // проверяю разные числа, второе – max

    @Test
    public void thirdMax() {
        int rsl = ThreeMax.max(1, 5, 10);
        assertThat(rsl, is(10));
    } // проверяю разные числа, третье – max

    @Test
    public void allEq() {
        int rsl = ThreeMax.max(1, 1, 1);
        assertThat(rsl, is(1));
    } // проверяю одинаковые числа

    @Test
    public void firstEqSecond1() {
        int rsl = ThreeMax.max(5, 5, 1);
        assertThat(rsl, is(5));
    } // первое равно второму, первое и второе – max

    @Test
    public void firstEqSecond2() {
        int rsl = ThreeMax.max(5, 5, 10);
        assertThat(rsl, is(10));
    } // первое равно второму, третье – max

    @Test
    public void firstEqThird1() {
        int rsl = ThreeMax.max(5, 1, 5);
        assertThat(rsl, is(5));
    } // первое равно третьему, первое и третье – max

    @Test
    public void firstEqThird2() {
        int rsl = ThreeMax.max(5, 10, 5);
        assertThat(rsl, is(10));
    } // первое равно третьему, второе – max

    @Test
    public void secondEqThird1() {
        int rsl = ThreeMax.max(1, 5, 5);
        assertThat(rsl, is(5));
    } // второе равно третьему, второе и третье – max

    @Test
    public void secondEqThird2() {
        int rsl = ThreeMax.max(10, 5, 5);
        assertThat(rsl, is(10));
    } // второе равно третьему, первое – max
} // всё работает