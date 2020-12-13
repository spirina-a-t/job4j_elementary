package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenHello() {
        assertThat(
                DummyBot.answer("Привет, Бот"),
                is("Привет, умник")
        );
    }

    @Test
    public void whenBye() {
        assertThat(
                DummyBot.answer("Пока"),
                is("До скорой встречи")
        );
    }

    @Test
    public void whenUnknown() {
        assertThat(
                DummyBot.answer("42"),
                is("Это ставит меня в тупик. Задайте другой вопрос")
        );
    }
}