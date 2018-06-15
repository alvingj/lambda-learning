package com.alvin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: gjuse
 * @Date: 2018/6/15 17:58
 * @Description:
 */
class PredicateDemoTest {

    PredicateDemo predicateDemo;
    @BeforeEach
    void setUp() {
        predicateDemo= new PredicateDemo();
    }

    @Test
    void filter() {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        predicateDemo.filter(languages, (str)->((String)str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        predicateDemo.filter(languages, (str)->((String)str).endsWith("a"));

        System.out.println("Print all languages :");
        predicateDemo.filter(languages, (str)->true);

        System.out.println("Print no language : ");
        predicateDemo.filter(languages, (str)->false);

        System.out.println("Print language whose length greater than 4:");
        predicateDemo.filter(languages, (str)->((String)str).length() > 4);

    }
}