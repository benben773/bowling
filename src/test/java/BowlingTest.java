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
    public void all_miss_0_roll_record_Test(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <20; i++) {
            bowling.roll(0);
        }
        assertEquals(0, bowling.getRecordList().get(0).getRoll());
        assertEquals(0, bowling.getRecordList().get(2).getRoll());
        assertEquals(0, bowling.getRecordList().get(19).getRoll());
        assertEquals( 20,bowling.getRecordList().size());
    }
    @Test
    public void all_strike_record_Test(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <10; i++) {
            bowling.roll(10);
        }
        assertEquals(10, bowling.getRecordList().get(0).getRoll());
        assertEquals(10, bowling.getRecordList().get(2).getRoll());
        assertEquals( 10,bowling.getRecordList().size());
    }
    @Test
    public void all_spare_record_Test(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <20; i++) {
            bowling.roll(5);
        }
        bowling.roll(5);
        assertEquals(5, bowling.getRecordList().get(0).getRoll());
        assertEquals(5, bowling.getRecordList().get(20).getRoll());
        assertEquals( 21,bowling.getRecordList().size());
    }
    @Test
    public void all_miss_but_4_and_5_roll_record_Test(){
        Bowling bowling = new Bowling();
        for (int i = 0; i <10; i++) {
            bowling.roll(4);
            bowling.roll(5);
        }
        assertEquals(4, bowling.getRecordList().get(0).getRoll());
        assertEquals(5, bowling.getRecordList().get(1).getRoll());
        assertEquals(4, bowling.getRecordList().get(2).getRoll());
        assertEquals(5, bowling.getRecordList().get(3).getRoll());
        assertEquals( 20,bowling.getRecordList().size());
    }
    @Test
    public void one_miss_but_9_spare_roll_record_Test(){
        Bowling bowling = new Bowling();
        bowling.roll(4);
        bowling.roll(5);
        for (int i = 0; i <9; i++) {
            bowling.roll(1);
            bowling.roll(9);
        }
        bowling.roll(5);
        assertEquals(4, bowling.getRecordList().get(0).getRoll());
        assertEquals(5, bowling.getRecordList().get(1).getRoll());
        assertEquals(1, bowling.getRecordList().get(2).getRoll());
        assertEquals(9, bowling.getRecordList().get(3).getRoll());
        assertEquals(5, bowling.getRecordList().get(20).getRoll());
        assertEquals( 21,bowling.getRecordList().size());
    }
}
