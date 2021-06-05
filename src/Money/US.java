package Money;

public class US extends Currency{
    public US(double value) {
        super(value);
    }
    public double getValue(){
        return value;
    }


    @Override
    public double Dollars() {
        return 0;
    }

    @Override
    public double Yen() {
        return getValue()*6.4;
    }
    public String toString(){
        return "US";
    }

    @Override
    public double SwissFranc() {
        return getValue()*0.9;
    }
}
