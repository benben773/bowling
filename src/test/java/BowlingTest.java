import org.junit.Test;
import tdd.Bowling;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class BowlingTest {
    @Test
    public void bowling_interface_Test(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <20; i++) {
            bowling.roll(0);
        }
        assertEquals(0, bowling.score());
    }
    @Test
    public void all_miss_roll_record_Test(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <20; i++) {
            bowling.roll(0);
        }
        assertEquals(0, bowling.getRecordList().get(0).getRoll());
        assertEquals(0, bowling.getRecordList().get(2).getRoll());
        assertEquals(0, bowling.getRecordList().get(19).getRoll());
        assertEquals( 20,bowling.getRecordList().size());
    }
}
