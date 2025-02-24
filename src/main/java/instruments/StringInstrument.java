package instruments;

public class StringInstrument extends Instrument{
    public StringInstrument(double price, String name) {
        super(price, name);
    }

    @Override
    void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}
