package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void MaxOf2When1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void MaxOf2When3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void MaxOf2When5To2Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void MaxOf3When523Then5() {
        int result = Max.max(5, 2, 3);
        assertThat(result, is(5));
    }

    @Test
    public void MaxOf3When225Then5() {
        int result = Max.max(2, 2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void MaxOf3When222Then2() {
        int result = Max.max(2, 2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void MaxOf4When5231Then5() {
        int result = Max.max(5, 2, 3, 1);
        assertThat(result, is(5));
    }

    @Test
    public void MaxOf4When2215Then5() {
        int result = Max.max(2, 2, 1,5);
        assertThat(result, is(5));
    }

    @Test
    public void MaxOf4When2222Then2() {
        int result = Max.max(2, 2, 2,2);
        assertThat(result, is(2));
    }
}