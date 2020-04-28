import org.junit.Test;
import tdd.Bowling;

import static org.junit.Assert.assertEquals;

public class BowlingTest {
    @Test
    public void bowling_interface_Test(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <20; i++) {
            bowling.roll(0);
        }
        assertEquals(0, bowling.score());
    }
}
