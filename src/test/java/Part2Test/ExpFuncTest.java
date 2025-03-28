package Part2Test;

import Part2.ExpFunc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpFuncTest {
    ExpFunc func = new ExpFunc(1,1,1, 10);

    @Test
    public void getUpLimitTest(){
        assertEquals(10, func.getUpLimit(),0.00000001);
    }

    @Test
    public void getLowLimitTest(){
        assertEquals(1, func.getLowLimit(),0.00000001);
    }

    @Test
    public void solutionTest(){
        assertEquals(4, Math.round(func.solution(1)));
    }
}

