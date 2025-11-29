public class ConcentrationException extends Exception {
    // props
    int c;

    // constructors
    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }

    public int getC() {
        return c;
    }
}
