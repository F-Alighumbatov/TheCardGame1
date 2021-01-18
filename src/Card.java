public class Card {

    private char value;
    private boolean guess = false;
    private int RC;

    public Card(char value, int RC) {
        this.value = value;
        this.guess = guess;
        this.RC = RC;
    }

    public int getRC() {
        return RC;
    }

    public void setRC(int RC) {
        this.RC = RC;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isGuess() {
        return guess;
    }

    public void setGuess(boolean guess) {
        this.guess = guess;
    }
}
