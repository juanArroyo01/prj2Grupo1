package exceptions;

public class NegativeNumbers extends Exception {

    private int num;

    public NegativeNumbers(String message, int num) {
        super(message);
        this.num = num;
    }

    public int getCorrectNumber() {
        return -num;
    }

}
