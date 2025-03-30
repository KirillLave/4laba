package Part1Test;

import Part1.SquareTrinomial;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTrinomialTest {
    SquareTrinomial poly1 = new SquareTrinomial(1, 2, -3); //-3, 1
    SquareTrinomial poly2 = new SquareTrinomial(1, 2, 1);  // -1
    SquareTrinomial poly3 = new SquareTrinomial(2, 1, 3);// нет действиетльных корней (массив пустой)
    SquareTrinomial poly4 = new SquareTrinomial(0, 2, -4); // 1 корень (2)

    @Test
    public void SolutionOfSquareTrinomialTest1(){
        assertEquals(1.0, poly1.SolutionOfSquareTrinomial()[1], 0.00000001);
        assertEquals(-3.0, poly1.SolutionOfSquareTrinomial()[0], 0.00000001);
    }

    @Test
    public void SolutionOfSquareTrinomialTest2(){
        assertEquals(-1, poly2.SolutionOfSquareTrinomial()[0],0.00000001);
    }

    @Test
    public void SolutionOfSquareTrinomialTest3(){
        assertEquals(0, poly3.SolutionOfSquareTrinomial().length);
    }

    @Test
    public void SolutionOfSquareTrinomialTest4(){
        assertEquals(2, poly4.SolutionOfSquareTrinomial()[0],0.00000001);
    }
}

