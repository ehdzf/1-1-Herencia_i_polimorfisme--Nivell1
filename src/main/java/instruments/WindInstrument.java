package instruments;

public class WindInstrument extends Instrument{
    public WindInstrument(double price, String name) {
        super(price, name);
    }

    @Override
    void play() {
        System.out.println("Està sonant un instrument de vent");
    }


}
