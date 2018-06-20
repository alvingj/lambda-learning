package com.alvin;

import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;

/**
 * @Auther: gjuse
 * @Date: 2018/6/15 17:57
 * @Description:
 */
public class PredicateDemo {

    @Test
    public void filter(List names, Predicate condition) {
        names.stream().filter((name) -> (condition.test(name))).forEach((name) -> {
            System.out.println(name + " ");
        });
    }
}
