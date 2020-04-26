import org.junit.Test;
import tdd.Bowling;

import static org.junit.Assert.assertEquals;

public class BowlingTest {
    @Test
    public void bowlingTest(){
        Bowling bowling = new Bowling();
        bowling.roll(5);
        int score = bowling.score();
        assertEquals(score, 150);


    }
}
