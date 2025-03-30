package Part2Test;

import Part2.LinealFunc;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinealFuncTest {
    LinealFunc func = new LinealFunc(2, 5, 5, 10);

    @Test
    public void getUpLimitTest(){
        assertEquals(10, func.getUpLimit(),0.00000001);
    }

    @Test
    public void getLowLimitTest(){
        assertEquals(5, func.getLowLimit(),0.00000001);
    }

    @Test
    public void solutionTest(){
        assertEquals(15, func.solution(5),0.00000001);
    }
}
