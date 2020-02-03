package com.mytests.micronaut.test1;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 12/25/2019.
 * Project: micronaut-test1
 * *******************************
 */
@MicronautTest
class MyClient1Test {
    @Inject
    MyClient1 client1;
    @Test
    void home() {
        assertEquals("b1 replaced bean22",client1.home().blockingGet());
    }
}
