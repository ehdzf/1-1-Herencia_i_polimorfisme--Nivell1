package instruments;

public class PercussionInstrument extends Instrument{
    public PercussionInstrument(double price, String name) {
        super(price, name);
    }

    @Override
    void play() {
        System.out.println("Està sonant un instrument de percussió");
    }
}
