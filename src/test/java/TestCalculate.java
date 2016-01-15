import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by angel on 15.01.2016.
 */
public class TestCalculate {


    @Before
    public void consolePrint() {
        System.out.println("Tests started!!! ");

    }

    @Test
    public void testAddTwoPositiveValues() {
        // Class for testing
        Calculate calc = new Calculate();

        // Method to check
        assertEquals("10 + 5 must be 15", 15, calc.add(10, 5));
    }


    //TODO
    //add new 5 tests for add() method

    //TODO
    //add tests for new methods

    @After
    public void consolePrintAfter() {
        System.out.println("Good!!! ");

    }
}
