package Money;

public class Swiss extends Currency{

    public Swiss(double value) {
        super(value);
    }

    public String toString(){
        return "Swiss";
    }

    @Override
    public double Dollars() {
        return getValue()*1.11;
    }

    public double getValue(){
        return value;
    }
    @Override
    public double Yen() {
        return getValue()*7.11;
    }

    @Override
    public double SwissFranc() {
        return 0;

    }
}
