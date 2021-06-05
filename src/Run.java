import Countries.Main;
import Money.China;
import Money.Swiss;

public class Run {
    public static void main(String[] args) {
        Main main=new Main();
        Swiss swiss=new Swiss(1000);
        China china=new China(2000);
        China china1=new China(3000);
        main.addCountry(china1);
        main.addCountry(china);
        main.addCountry(swiss);
        main.removeCountry(2);

        main.change(1);

    }
}
