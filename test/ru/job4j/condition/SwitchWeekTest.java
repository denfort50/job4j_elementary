package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class SwitchWeekTest {

    @Test
    public void monday() {
        String name = SwitchWeek.nameOfDay(1);
        assertThat(name, is("Понедельник"));
    }

    @Test
    public void tuesday() {
        String name = SwitchWeek.nameOfDay(1);
        assertThat(name, is("Понедельник"));
    }

    @Test
    public void noday() {
        String name = SwitchWeek.nameOfDay(8);
        assertThat(name, is("Ошибка"));
    }
}