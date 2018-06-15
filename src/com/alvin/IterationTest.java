package com.alvin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: gjuse
 * @Date: 2018/6/15 17:35
 * @Description:
 */
class IterationTest {
    Iteration iteration;
    @BeforeEach
    void setUp() {
         iteration=new Iteration();
    }

    @Test
    void before() {
        iteration.before();
    }

    @Test
    void now() {
        iteration.now();
    }
}