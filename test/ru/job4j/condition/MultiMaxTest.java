package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void WhenFirstMax() {
        int result = MultiMax.max(12, 2, 11);
        assertThat(result, is(12));
    }

    @Test
    public void WhenThirdMax() {
        int result = MultiMax.max(2, 3, 6);
        assertThat(result, is(6));
    }
}