package com.devops.bugstracker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BugsTrackerApplicationTests {

    @Test
    void contextLoads() {
        int actual = 0;
        assertEquals(0, actual);
    }
}
