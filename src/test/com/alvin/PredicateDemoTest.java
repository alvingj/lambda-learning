package test.com.alvin;

import com.alvin.PredicateDemo;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * PredicateDemo Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class PredicateDemoTest {
    PredicateDemo predicateDemo;

    @Before
    public void before() throws Exception {
        predicateDemo = new PredicateDemo();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: filter(List names, Predicate condition)
     */
    @Test
    public void testFilter() throws Exception {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");

        System.out.println("Languages which starts with J :");
        predicateDemo.filter(languages, (str) -> ((String) str).startsWith("J"));

        System.out.println("Languages which ends with a ");
        predicateDemo.filter(languages, (str) -> ((String) str).endsWith("a"));

        System.out.println("Print all languages :");
        predicateDemo.filter(languages, (str) -> true);

        System.out.println("Print no language : ");
        predicateDemo.filter(languages, (str) -> false);

        System.out.println("Print language whose length greater than 4:");
        predicateDemo.filter(languages, (str) -> ((String) str).length() > 4);


        // 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
// 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
        Predicate<String> startsWithJ = (n) -> n.startsWith("J");
        Predicate<String> fourLetterLong = (n) -> n.length() == 4;
        languages.stream()
                .filter(startsWithJ.and(fourLetterLong))
                .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));
    }


} 
