package tdd;

/**
 * @author ：ls05
 * @date ：Created in 2020/4/29 0:57
 */
public class Turn {
    private int firstRoll;
    private int secondRoll;

    public Turn(int fristRoll, int secondRoll) {

        this.firstRoll = fristRoll;
        this.secondRoll = secondRoll;
    }

    public int getFirstRoll() {
        return firstRoll;
    }

    public void setFirstRoll(int firstRoll) {
        this.firstRoll = firstRoll;
    }

    public int getSecondRoll() {
        return secondRoll;
    }

    public void setSecondRoll(int secondRoll) {
        this.secondRoll = secondRoll;
    }
}
