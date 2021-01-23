package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int[] expected = {};
        int[] rsl = Machine.change(100, 100);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when100by38() {
        int[] expected = {10, 10, 10, 10, 10, 10, 2};
        int[] rsl = Machine.change(100, 38);
        assertThat(rsl, is(expected));
    }

    @Test
    public void when16by8() {
        int[] expected = {5, 2, 1};
        int[] rsl = Machine.change(16, 8);
        assertThat(rsl, is(expected));
    }
}