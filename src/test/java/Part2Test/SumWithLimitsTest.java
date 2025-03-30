package Part2Test;

import Part2.*;
import Part2ifaces.FuncOnInterval;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumWithLimitsTest {
    LinealFunc func1 = new LinealFunc(2, 5, 5, 10);
    TrigonometricFunc func2 = new TrigonometricFunc(1, 1, 0, Math.PI);
    RatioonalFrac func3 = new RatioonalFrac(1, 2, 2, 4, 5, 10);
    ExpFunc func4 = new ExpFunc(1,1,1, 1);

    SumWithLimits<FuncOnInterval> functional = new SumWithLimits<>();

    @Test
    public void linTest(){
        assertEquals(60, Math.round(functional.result(func1)));
    }

    @Test
    public void trigTest(){
        assertEquals(1, Math.round(functional.result(func2)));
    }
    @Test
    public void ratTest(){
        assertEquals(2, Math.round(functional.result(func3)));
    }
    @Test
    public void expTest(){
        assertEquals(Math.exp(1)*3 + 3, functional.result(func4),0.00000001);
    }
}

