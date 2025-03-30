package Part2Test;

import Part2.*;
import Part2ifaces.FuncOnInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class IntegralTest {
    LinealFunc func1 = new LinealFunc(2, 5, 5, 10);
    TrigonometricFunc func2 = new TrigonometricFunc(1, 2 * Math.PI, 0, 20);
    RatioonalFrac func3 = new RatioonalFrac(2, 1, 0, 1, 5, 10);
    ExpFunc func4 = new ExpFunc(1,1,1, 1);

    Integral<FuncOnInterval> integral = new Integral<>(6,9);

    @Test
    public void linIntTest(){
        assertEquals(60, Math.round(integral.result(func1)));
    }

    @Test
    public void TrigIntTest(){
        assertEquals(0, Math.round(integral.result(func2)));
    }

    @Test
    public void RatIntTest(){
        assertEquals(48, Math.round(integral.result(func3)));
    }

    @Test
    public void ExpIntTest(){
        assertThrows(IllegalArgumentException.class, () -> integral.result(func4));
    }


}

