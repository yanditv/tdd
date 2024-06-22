package ups.edu.ec.tdd.calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class calculatorParametersTest {
    private int a,b,expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters() {
        List<Object[]> result = new ArrayList<>();
        result.add(new Object[] {2,4,6});
        result.add(new Object[] {1,8,9});
        result.add(new Object[] {2,5,7});
        result.add(new Object[] {7,3,10});
        result.add(new Object[] {22,4,26});
        result.add(new Object[] {12,14,26});
        return result;
    }
    public calculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }
    @Test
    public void given_parameters_when_addition_then_ok(){
        calculator calc = new calculator();
        int actual=calc.addition(a,b);
        assertEquals(expected,actual);
    }
}
