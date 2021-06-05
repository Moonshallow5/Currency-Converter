package Money;

public class China extends Currency{
        public China(double value){
        super(value);
    }
    public double getValue(){
            return value;
    }
    @Override
    public double SwissFranc(){
        return getValue()*0.14;
    }
    @Override
    public double Dollars(){
        return getValue()*0.16;
    }

    @Override
    public double Yen() {
        return getValue();
    }

    public String toString(){
        return "China";
    }
}
