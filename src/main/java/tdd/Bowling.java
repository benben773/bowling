package tdd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/27 0:41
 */
public class Bowling {
    private List<GameSet> recordList;

    public Bowling() {
        recordList = new ArrayList<GameSet>();
    }

    public void roll(int point) {
        GameSet gameSet = new GameSet(point);
        recordList.add(gameSet);
    }

    public int score() {
        return 0;
    }

    public List<GameSet> getRecordList() {
        return recordList;
    }

}
