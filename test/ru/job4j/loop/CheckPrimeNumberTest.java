package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when7() {
        boolean rsl = CheckPrimeNumber.check(7);
        assertThat(rsl, is(true));
    }

    @Test
    public void when16() {
        boolean rsl = CheckPrimeNumber.check(16);
        assertThat(rsl, is(false));
    }

    @Test
    public void when1() {
        boolean rsl = CheckPrimeNumber.check(1);
        assertThat(rsl, is(false));
    }
}