package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class MultipleSwitchWeekTest {

    @Test
    public void monday1() {
        int day = MultipleSwitchWeek.numberOfDay("Monday");
        assertThat(day, is(1));
    }

    @Test
    public void monday2() {
        int day = MultipleSwitchWeek.numberOfDay("Понедельник");
        assertThat(day, is(1));
    }

    @Test
    public void noDay() {
        int day = MultipleSwitchWeek.numberOfDay("Привет");
        assertThat(day, is(-1));
    }
}