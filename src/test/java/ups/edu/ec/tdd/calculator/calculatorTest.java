package ups.edu.ec.tdd.calculator;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
    calculator cal = null;
    @BeforeClass
    public static void setUpClass(){
        System.out.println("calculatorTest setUpClass");
    }

    @Before
    public void setUp(){
    cal = new calculator();
    System.out.println("calculatorTest setUp");
    }

    @Test
    public void given_two_integers_when_addition_ok() {
        calculator calc = new calculator();
        assertEquals(6,calc.addition(4,2));
        System.out.println("calculatorTest test 1");
    }

    @Test
    public void given_two_integers_when_substraction_ok() {
        calculator calc = new calculator();
        assertEquals(6,calc.substraction(8,2));
        System.out.println("calculatorTest Test 2");
    }
    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_exception() {
        calculator calc = new calculator();
        assertEquals(3,calc.division(6,0));
        System.out.println("calculatorTest Test 3");
    }
    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_timeout() {
        calculator calc = new calculator();
        assertEquals(8,calc.multiplication(4,2));
        System.out.println("calculatorTest Test 4");
    }

    @After
    public void tearDown(){
        System.out.println("tearDown");
        cal.setAns(0);
        cal=null;
    }
    @After
    public void tearDownClass(){
        System.out.println("tearDownClass");
    }
}