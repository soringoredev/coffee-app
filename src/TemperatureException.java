public class TemperatureException extends Exception {
    // props
    int t;

    //constructors

    public TemperatureException(int t) {
        this.t = t;
    }

    public int getT() {
        return t;
    }
}
