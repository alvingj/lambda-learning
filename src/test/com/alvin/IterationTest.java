package test.com.alvin;

import com.alvin.Iteration;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Iteration Tester.
 *
 * @author <Authors name>
 * @version 1.0
 */
public class IterationTest {
    Iteration iteration;

    @Before
    public void before() throws Exception {
        iteration = new Iteration();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: before()
     */
    @Test
    public void testBefore() throws Exception {
        iteration.before();
    }

    /**
     * Method: now()
     */
    @Test
    public void testNow() throws Exception {
        iteration.now();
    }


} 
