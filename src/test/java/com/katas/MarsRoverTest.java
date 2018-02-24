package com.katas;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MarsRoverTest {

    @Test
    public void should_say_hello() {
        MarsRover rover = new MarsRover();

        String response = rover.sayHello();

        assertThat(response).isEqualTo("Hello!");
    }

}
