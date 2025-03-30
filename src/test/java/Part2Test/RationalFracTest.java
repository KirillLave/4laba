package Part2Test;

import Part2.RatioonalFrac;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RationalFracTest {
    RatioonalFrac func = new RatioonalFrac(1, 2, 2, 4, 5, 10);

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
        assertEquals(0.5, func.solution(5),0.00000001);
    }
}

