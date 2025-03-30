package Part2Test;

import Part2.TrigonometricFunc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrigonometricFuncTest {
    TrigonometricFunc func = new TrigonometricFunc(1, 1, 0, Math.PI);

    @Test
    public void getUpLimitTest(){
        assertEquals(Math.PI, func.getUpLimit(),0.00000001);
    }

    @Test
    public void getLowLimitTest(){
        assertEquals(0, func.getLowLimit(),0.00000001);
    }

    @Test
    public void solutionTest(){
        assertEquals(0, func.solution(0),0.00000001);
    }
}

