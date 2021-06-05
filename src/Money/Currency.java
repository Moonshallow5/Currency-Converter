package Money;

public abstract class Currency {
    double value;
    protected Currency(double value) {
        this.value=value;
    }
    public abstract double Dollars();
    public abstract double Yen();
    public abstract double SwissFranc();
}
