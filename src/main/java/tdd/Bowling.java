package tdd;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/27 0:41
 */
public class Bowling {
    private List<GameSet> recordList;
    private int score;

    public Bowling() {
        recordList = new ArrayList<GameSet>();
    }

    public void roll(int point) {
        GameSet gameSet = new GameSet(point);
        recordList.add(gameSet);
    }

    public int score() {

        score = 0;
        ListIterator<GameSet> iterator = recordList.listIterator();
        while (iterator.hasNext()) {
            int thisRoll = iterator.next().getRoll();
            if (iterator.hasNext()) {
                int nextRoll = iterator.next().getRoll();
                if (iterator.hasNext()) {
                    int nextNextScore = iterator.next().getRoll();
                    score += thisRoll + nextRoll + nextNextScore;
                    turnToPreTurn(iterator, thisRoll);
                }
                iterator.previous();
            }
        }
        return score;
    }

    /**
     * 向前移动一个轮次
     * @param iterator
     * @param thisRoll
     */
    private void turnToPreTurn(ListIterator<GameSet> iterator, int thisRoll) {
        if (thisRoll == 10) {
            iterator.previous();
        }
    }

    public List<GameSet> getRecordList() {
        return recordList;
    }

}
