import org.junit.Test;
import tdd.Bowling;

import static org.junit.Assert.assertEquals;

public class BowlingTest {
    @Test
    public void when_all_score_0_bowlingTest(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <20; i++) {
            bowling.roll(0);
        }
        assertEquals(0, bowling.score());

    }
}
